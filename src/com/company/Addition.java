package com.company;

public class Addition {
    private String name;
    private double cost;

    public Addition(String type, double cost) {
        this.name = type;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}

