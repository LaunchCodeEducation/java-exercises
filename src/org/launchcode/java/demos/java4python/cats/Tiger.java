package org.launchcode.java.demos.java4python.cats;

/**
 * Created by LaunchCode
 */
public class Tiger extends Cat {


    public boolean angry() {
        return this.tired && this.hungry;
    }

    public String noise() {
        if (this.angry()) {
            return "GRRRR";
        } else {
            return super.noise();
        }
    }

    public static void main(String[] args) {
        Tiger hobbes = new Tiger();
        System.out.println("hobbes says: " + hobbes.noise());
        hobbes.sleep();
        System.out.println("After sleeping, hobbes says: " + hobbes.noise());
        hobbes.eat();
        System.out.println("After eating, hobbes still says: " + hobbes.noise());
        hobbes.eat();
        System.out.println("After eating again, hobbes says: " + hobbes.noise());
    }
}
