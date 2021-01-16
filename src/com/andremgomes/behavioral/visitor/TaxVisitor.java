package com.andremgomes.behavioral.visitor;

public class TaxVisitor implements Visitor{
    @Override
    public void visit(Person person) {
        System.out.println("Calculating tax for person");
    }

    @Override
    public void visit(Firm firm) {
        System.out.println("Calculating tax for user");
    }
}
