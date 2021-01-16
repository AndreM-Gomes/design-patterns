package com.andremgomes.behavioral.observer;

public class ClientClass {
    public static void main(){
        User andre = new User("André");
        User joao = new User("João");
        Subject<String> subject = new EmailNotifications();
        subject.subscribe(s -> {
            System.out.println("User "+ andre.name + " Received email " + s);
        });
        subject.subscribe(s -> {
            System.out.println("User "+ joao.name + " Received email " + s);
        });
        subject.notifyObservers("New Promo");
        subject.notifyObservers("New Friend recommendation");
    }
}
