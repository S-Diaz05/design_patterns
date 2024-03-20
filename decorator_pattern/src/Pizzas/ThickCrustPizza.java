package Pizzas;

import Pizzas.Pizza;

public class ThickCrustPizza extends Pizza {
    public ThickCrustPizza(){
        this.description =  "Thick crust pizza";
    }
    @Override
    public double cost() {
        return 2000;
    }
}
