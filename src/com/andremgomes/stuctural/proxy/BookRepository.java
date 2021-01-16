package com.andremgomes.stuctural.proxy;

import java.util.List;
import java.util.Optional;

public abstract class BookRepository {

    private List<Book> bookList;

    public abstract Optional<Book> findByName(String name);
}
