// WAJP to implement multilevel inheritance 

// Grandparent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Parent class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Child class inheriting from Dog
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

// Main class
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        // Accessing all methods
        p.eat();   // from Animal
        p.bark();  // from Dog
        p.weep();  // from Puppy
    }
}