package com.andremgomes.stuctural.decorator;

import java.math.BigDecimal;

public abstract class DishDecorator implements Dish{
    private final Dish decoratedDish;

    public DishDecorator(Dish decoratedDish) {
        this.decoratedDish = decoratedDish;
    }


    @Override
    public String getIngredients() {
        return this.decoratedDish.getIngredients();
    }

    @Override
    public BigDecimal getCost() {
        return this.decoratedDish.getCost();
    }
}
