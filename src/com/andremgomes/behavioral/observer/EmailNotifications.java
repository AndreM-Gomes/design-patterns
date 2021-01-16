package com.andremgomes.behavioral.observer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

public class EmailNotifications implements Subject<String> {

    Map<Integer,Consumer<String>> observers = new LinkedHashMap<>();
    private Integer autoIncrementId = 0;

    @Override
    public void notifyObservers(String email) {
        this.observers.values().forEach(((observer) -> {
            observer.accept(email);
        }));
    }

    @Override
    public synchronized Integer subscribe(Consumer<String> function) {
        this.observers.put(autoIncrementId,function);
        this.autoIncrementId+=1;
        return this.autoIncrementId;
    }

    @Override
    public void unsubscribe(int subscriptionId) {
        this.observers.remove(subscriptionId);
    }
}
