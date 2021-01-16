package com.andremgomes.behavioral.visitor;

public class Firm implements Taxable {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
