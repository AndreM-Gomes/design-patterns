package com.andremgomes.behavioral.iterator.tree;

public class Tree<T extends Comparable<T>> {
    private Node<T> selfNode;
    public Tree<T> rightChild;
    public Tree<T> leftChild;

    public Tree(Node<T> node){
        this.selfNode = node;
    }

    public void add(Node<T> node){
        if (this.selfNode == null){
            this.selfNode = node;
        }else{
            if(node.data.compareTo(this.selfNode.data)>0){
                if(rightChild == null){
                    this.rightChild = new Tree<>(node);
                }else{
                    this.rightChild.add(node);
                }
            }else{
                if(leftChild == null){
                    this.leftChild = new Tree<>(node);
                }else{
                    this.leftChild.add(node);
                }
            }
        }
    }

    public void print(){
        if(this.leftChild != null){
            this.leftChild.print();
        }
        if(this.selfNode != null){
            System.out.println(this.selfNode.data);
        }
        if(this.rightChild != null){
            this.rightChild.print();
        }
    }
}
