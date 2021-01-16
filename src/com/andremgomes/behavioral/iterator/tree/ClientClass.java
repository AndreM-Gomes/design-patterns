package com.andremgomes.behavioral.iterator.tree;

public class ClientClass {
    public static void main(){
        Tree<String> tree = new Tree<>(new Node<>(""));
        for (int i = 0; i < 1000000000; i++) {
            tree.add(new Node<>(Character.toString((int) (Math.random() * 100))));
        }
        tree.print();
    }
}
