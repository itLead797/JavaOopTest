package com.company;

import java.util.ArrayList;

public class HealthyBurger extends Burger {

    public HealthyBurger(String name, int meat, String bunType, int numAdditions, ArrayList<Addition> additions, int maxAdditions, double cost) {
        super(name, meat, bunType, numAdditions, additions, maxAdditions, cost);
        additions.clear();
    }
    public HealthyBurger(ArrayList<Addition> additions) {
        super("Healthy", 1, "Brown rye bread roll", 0, additions, 4, 6.00);
        additions.clear();

    }





}


