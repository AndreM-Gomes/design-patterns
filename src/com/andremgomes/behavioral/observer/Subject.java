package com.andremgomes.behavioral.observer;

import java.util.function.Consumer;

public interface Subject<T> {
    public void notifyObservers(T notification);
    public abstract Integer subscribe(Consumer<T> function);
    public abstract void unsubscribe(int subscriptionId);
}
