// WAJP to implement hierarchical inheritance

// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

// Main class
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        
        Dog d = new Dog();
        Cat c = new Cat();

        // Dog object
        d.eat();   // from Animal
        d.bark();  // from Dog

        // Cat object
        c.eat();   // from Animal
        c.meow();  // from Cat
    }
}