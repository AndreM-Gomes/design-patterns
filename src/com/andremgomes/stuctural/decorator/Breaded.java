package com.andremgomes.stuctural.decorator;

import java.math.BigDecimal;

public class Breaded extends DishDecorator {

    public Breaded(Dish decoratedDish) {
        super(decoratedDish);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", breadcrumbs, oil";
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }
}
