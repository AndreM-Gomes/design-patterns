package com.andremgomes.behavioral.visitor;

public interface Taxable {
    public void accept(Visitor visitor);
}
