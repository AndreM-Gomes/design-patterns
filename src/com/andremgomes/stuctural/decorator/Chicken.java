package com.andremgomes.stuctural.decorator;

import java.math.BigDecimal;

public class Chicken implements Dish {
    @Override
    public String getIngredients() {
        return "Chicken";
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(10);
    }
}
