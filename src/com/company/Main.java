package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * The purpose of the application is to help a fictitious company called Bills Burgers to manage
 * their process of selling hamburgers.
 * <p>
 * Our application will help Bill to select types of burgers, some of the additional items (additions) to
 * be added to the burgers and pricing.
 * <p>
 * We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bill's store.
 * The basic hamburger should have the following items.
 * <p>
 * Bread roll type, meat and up to 4 additional items (things like lettuce, tomato, onion, pickle) that
 * the customer can select to be added to the burger.
 * <p>
 * Each one of these items gets charged an additional price, so you need some way to track how many items got added
 * and calculate the final price (base burger with all additions).
 * <p>
 * This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
 * Create a Hamburger class to deal with all the above.
 * <p>
 * The constructor should only include the roll type, meat, and price, and also include name of purger or you
 * can use a setter.
 * <p>
 * Also create two extra varieties of hamburgers(subclasses) to cater for:
 * <p>
 * a) a Healthy burger (on brown rye bread roll), plus two more items that can be added (mushrooms, cheese).
 * The Healthy burger can have 6 items in total.
 * <p>
 * hint: you probably want to process the two additional items in this new class (subclass of Hamburger),
 * not the base class (Hamburger), since the two additional items are only appropriate for this new class
 * (in other words new burger type)
 * <p>
 * b) Deluxe hamburger - comes with chips and drinks  as additions, but no extra items are allowed.
 * hint: You have to find a way to automatically  add the new items at the time the deluxe burger
 * object is created, and prevent other items being made.
 * <p>
 * All 3 classes should have a method that can be called anytime to show the base price of the hamburger
 * plus all additionals, each showing the addition name, and addition price, and a grand total for the burger
 * (base price + all additions).
 * <p>
 * For the two additional classes this may require you to be looking at the base class for pricing and then
 * adding totals to the final price.
 */


public class Main {

    public static void main(String[] args) {
        Addition lettuce = new Addition("Lettuce", 0.20);
        Addition tomato = new Addition("Tomato", 0.30);
        Addition onion = new Addition("Onion", 0.40);
        Addition pickle = new Addition("Pickle", 0.50);
        Addition mushrooms = new Addition("Mushrooms", 0.60);
        Addition cheese = new Addition("cheese", 0.70);
        ArrayList<Addition> addition = new ArrayList<Addition>();

//        Addition[] empty = new Addition[4];
//        empty[0] = lettuce;


//        myList.add(lettuce);
//        myList.add(tomato);

        Burger timBurger = new Burger("Basic", "Sesame Seed", addition);
        timBurger.addAdditions(lettuce);
        timBurger.addAdditions(tomato);
        timBurger.printReceipt(timBurger);

        DeluxeBurger joeBurger = new DeluxeBurger(addition);
        joeBurger.addAdditions(cheese);
        joeBurger.printReceipt(joeBurger);
        HealthyBurger beckyBurger = new HealthyBurger(addition);
        beckyBurger.addAdditions(onion);
        beckyBurger.addAdditions(pickle);
        beckyBurger.printReceipt(beckyBurger);
    }


}
