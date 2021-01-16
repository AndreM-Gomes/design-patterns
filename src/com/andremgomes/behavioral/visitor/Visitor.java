package com.andremgomes.behavioral.visitor;

public interface Visitor {
    public void visit(Person user);
    public void visit(Firm firm);
}
