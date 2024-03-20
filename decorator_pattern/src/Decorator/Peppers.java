package Decorator;

import Pizzas.Pizza;

public class Peppers extends ToppingsDecorator{
     Pizza pizza;

     public Peppers(Pizza pizza){
         this.pizza = pizza;
     }
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", peppers";
    }

    @Override
    public double cost() {
        return pizza.cost() + 300;
    }
}
