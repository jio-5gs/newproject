// Base class (Parent class)
class Animal {
    // Method in the parent class
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class (Child class) inheriting from Animal
class Dog extends Animal {
    // Method in the child class
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog myDog = new Dog();

        // Call the methods from both the parent and child classes
        myDog.eat();  // This method is inherited from the Animal class
        myDog.bark(); // This method is from the Dog class
    }
}

