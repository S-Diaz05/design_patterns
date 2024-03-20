package Decorator;

import Pizzas.Pizza;

public class Olives extends ToppingsDecorator{
     Pizza pizza;


     public Olives(Pizza pizza){
         this.pizza = pizza;
     }
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", olives";
    }

    @Override
    public double cost() {
        return pizza.cost() + 200;
    }
}
