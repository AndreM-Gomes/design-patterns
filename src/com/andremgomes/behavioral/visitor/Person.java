package com.andremgomes.behavioral.visitor;

public class Person implements Taxable{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
