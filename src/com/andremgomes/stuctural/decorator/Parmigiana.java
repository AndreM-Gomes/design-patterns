package com.andremgomes.stuctural.decorator;

import java.math.BigDecimal;

public class Parmigiana extends DishDecorator{
    public Parmigiana(Dish decoratedDish) {
        super(decoratedDish);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()+", cheese, tomato sauce";
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }
}
