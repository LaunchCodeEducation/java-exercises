package org.launchcode.java.demos.java4python.cats;

/**
 * Created by LaunchCode
 */
public class Cat {

    // We set these parameters to "protected" so all classes in the same package
    // along with all subclasses may access them
    protected boolean tired = true;
    protected boolean hungry = true;

    // A cat is rested and hungry after it sleeps
    public void sleep() {
        this.tired = false;
        this.hungry = true;
    }

    //
    public void eat() {

        // eating when not hungry makes a cat sleepy
        if (!this.hungry) {
            this.tired = true;
        }

        this.hungry = false;
    }

    // sleepy cats say prrrr, energized cats say meow!
    public String noise() {
        if (this.tired) {
            return "purrrrr";
        } else {
            return "meow";
        }
    }

    public static void main(String[] args) {
        Cat tom = new Cat();
        System.out.println("tom says: " + tom.noise());
        tom.sleep();
        System.out.println("After sleeping, tom says: " + tom.noise());
        tom.eat();
        System.out.println("After eating, tom still says: " + tom.noise());
        tom.eat();
        System.out.println("After eating again, tom says: " + tom.noise());
    }
}
