package com.andremgomes.stuctural.decorator;

public class ClientClass {
    public static void main(){
        Dish dish = new Chicken();
        System.out.println("Chicken");
        System.out.println("Ingredients: " + dish.getIngredients());
        System.out.println("Cost:"+dish.getCost());
        dish = new Breaded(dish);
        System.out.println("Breaded chicken");
        System.out.println("Ingredients: " + dish.getIngredients());
        System.out.println("Cost:"+dish.getCost());
        dish = new Parmigiana(dish);
        System.out.println("Parmigiana breaded chicken");
        System.out.println("Ingredients: " + dish.getIngredients());
        System.out.println("Cost:"+dish.getCost());
    }
}
