package Pizzas;

import Pizzas.Pizza;

public class ThinCrustPizza extends Pizza {
    public ThinCrustPizza(){
        this.description = "Thin crust pizza";
    }

    @Override
    public double cost() {
        return 1000;
    }
}
