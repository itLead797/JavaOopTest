package com.company;

import java.util.ArrayList;

public class DeluxeBurger extends Burger {

    public DeluxeBurger(ArrayList<Addition> additions) {
        super("Deluxe", 2, "Sesame seed", 0, additions, 2, 7.00);
        additions.clear();

        Addition drink = new Addition("Coke", 1.00);
        Addition chips = new Addition("Chips", 0.50);
        super.addAdditions(drink);
        super.addAdditions(chips);
        super.setNumAdditions(2);
    }




}

