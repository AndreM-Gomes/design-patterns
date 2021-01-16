package com.andremgomes.behavioral.iterator.stack;

public class Stack<T> {
    private Node<T> node;

    public Stack(T data){
        this.node = new Node<T>(data);
    }

    public Stack(){}

    public void push(T data){
        if(this.node == null){
            this.node = new Node<T>(data);
        }else{
            Node<T> newNode = new Node<>(data);
            newNode.nextNode = this.node;
            this.node = newNode;
        }
    }

    public T pop(){
        T data = this.node.data;
        this.node = this.node.nextNode;
        return data;
    }

    public void print(){
        this.print(this.node);
    }

    private void print(Node<T> node){
        if(node != null){
            System.out.println(node.data);
            this.print(node.nextNode);
        }
    }
}
