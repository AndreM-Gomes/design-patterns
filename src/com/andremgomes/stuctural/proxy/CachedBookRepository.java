package com.andremgomes.stuctural.proxy;

import java.util.*;

public class CachedBookRepository extends BookRepository{

    private final BookRepositoryImpl bookRepository;
    private final Map<String,Book> cache;

    public CachedBookRepository(BookRepositoryImpl bookRepository){
        this.cache = new LinkedHashMap<>();
        this.bookRepository = bookRepository;
    }

    @Override
    public Optional<Book> findByName(String name) {
        boolean hasCache = this.cache.containsKey(name);
        if(hasCache){
            return Optional.ofNullable(this.cache.get(name));
        }else{
            Optional<Book> book = this.bookRepository.findByName(name);
            book.ifPresent(book1 -> {
                this.cache.put(name,book1);
            });
            return book;
        }
    }
}
