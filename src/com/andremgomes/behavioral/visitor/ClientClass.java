package com.andremgomes.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class ClientClass {
    public static void main(){
        List<Taxable> taxableList = new ArrayList<>();
        taxableList.add(new Person());
        taxableList.add(new Firm());
        taxableList.forEach(taxable -> taxable.accept(new TaxVisitor()));
    }
}
