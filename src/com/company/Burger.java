package com.company;

import java.util.ArrayList;

public class Burger {
    private String name;
    private int meat;
    private String bunType;
    private int numAdditions;
    private ArrayList<Addition> additions;
    private int maxAdditions;
    private double cost;

    public Burger(String name, int meat, String bunType, int numAdditions, ArrayList<Addition> additions, int maxAdditions, double cost) {
        this.name = name;
        this.meat = meat;
        this.bunType = bunType;
        this.numAdditions = numAdditions;
        this.additions = additions;
        this.maxAdditions = maxAdditions;
        this.cost = cost;
        additions.clear();
    }

    public Burger(String name, String bunType, ArrayList<Addition> additions) {
        this(name, 1, bunType, 0, additions, 4, 5.00);
        additions.clear();
    }

    public Burger(ArrayList<Addition> additions) {
        this("Basic",1, "Sesame seed", 0, additions, 4, 5.00);
        additions.clear();
    }

    public double getCost(Burger burger) {

        double totalCost = this.cost;
        for(int i = 0; i < burger.additions.size(); i++) {
            totalCost += burger.additions.get(i).getCost();
        }
        System.out.println("Burger cost is " + totalCost);
        return totalCost;
    }
    public void printReceipt(Burger burger) {
        double totalCost = this.cost;
        System.out.println("Burger ordered: : " + this.name + " Burger");
        System.out.println("All beef patty: " + this.meat);
        System.out.println(this.bunType + " Bun");
        System.out.println("Base burger: " + String.format("%.2f", this.cost));
        for(int i = 0; i < burger.additions.size(); i++) {
            System.out.println("Added: " + burger.additions.get(i).getName() + ", $" + String.format( "%.2f", burger.additions.get(i).getCost()));
            totalCost += burger.additions.get(i).getCost();
        }
        System.out.println("---------------");
        System.out.println("Total: $" + String.format("%.2f", totalCost) + "\n");
    }


    public void addAdditions(Addition additions) {
        if(this.numAdditions < this.maxAdditions) {
            this.additions.add(additions);
            this.numAdditions += 1;
        } else {
            System.out.println("You cannot add any more items");
        }
    }

    public void setNumAdditions(int numAdditions) {
        this.numAdditions = numAdditions;
    }

}
