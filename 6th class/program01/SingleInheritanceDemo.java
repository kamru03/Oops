// WAJP to implement single inheritance.

// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class
public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();

        // Calling parent class method
        d.eat();

        // Calling child class method
        d.bark();
    }
}