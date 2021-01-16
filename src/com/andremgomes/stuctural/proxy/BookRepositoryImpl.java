package com.andremgomes.stuctural.proxy;

import java.util.List;
import java.util.Optional;

public class BookRepositoryImpl extends BookRepository{
    private List<Book> bookList;

    public Optional<Book> findByName(String name){
        return this.bookList
                .stream()
                .filter(book -> book.name.equalsIgnoreCase(name))
                .findFirst();
    }
}
