package org.launchcode.java.demos.java4python.cats;

/**
 * Created by LaunchCode
 */
public class HouseCat extends Cat {

    private String name;

    public HouseCat(String name) {
        // first initialize as a normal Cat
        super();

        this.name = name;
    }

    public boolean satisfied() {
        return !this.hungry && !this.tired;
    }

    public String noise() {
        if (this.satisfied()) {
            return "Hello, my name is " + this.name + "!";
        } else {
            return super.noise();
        }
    }

    public void purr() {
        System.out.println("I'm a HouseCat");
    }

    public static void main(String[] args) {

        // demonstrate basic HouseCat behaviors
        HouseCat garfield = new HouseCat("Garfield");
        System.out.println("garfield says: " +  garfield.noise());
        garfield.sleep();
        System.out.println("After sleeping, garfield says: " + garfield.noise());
        garfield.eat();
        System.out.println("After eating, garfield says: " + garfield.noise());
        garfield.eat();
        System.out.println("After eating again, garfield says: " + garfield.noise());

        /* polymorphic examples */

        // this will run w/o error
        Cat sukiHouseCat = new HouseCat("Suki");
        ((HouseCat) sukiHouseCat).satisfied();

        // this results in a compiler error
        Cat sukiCat = new Cat();
        ((HouseCat) sukiCat).satisfied();
    }
}
