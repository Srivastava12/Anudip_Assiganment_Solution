package anudip_day_4lab_q2;
/**
 * @author Shubham Kumar
 */
class Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}
public class Anudip_Day_4Lab_Q2 {
    public static void main(String[] args) {
        // Creating objects of subclasses
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling the makeSound method on each object
        System.out.println("Calling makeSound() using superclass reference:");

        myDog.makeSound();
        myCat.makeSound();

        // Creating objects of subclasses directly
        System.out.println("\nCalling makeSound() using subclass references:");

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }   
}
