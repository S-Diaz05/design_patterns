package Decorator;

import Pizzas.Pizza;

public class Cheese extends ToppingsDecorator{
    Pizza pizza;

    public Cheese(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", cheese";
    }

    @Override
    public double cost() {
        return pizza.cost()+ 100;
    }
}
