// Abstract class
/*
 * 1>cannot create an instance(obj)of abstract class
 * 2> abstract and non abstract method aajayege
 * 3>
 * can have constructors
 */

public class JavaBasics {

    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        System.out.println(h.color);

        // Animal a = new Animal(); // cannot create instatntiate the type animal (err)
        // {abstract class hai re }
    }
}

abstract class Animal {
    String color;

    Animal() {
        this.color = "brown";
    }

    void eat() {
        System.out.println("Animal eats");
    }

    // if you try Animal a = new Animal(); when Animal is abstract, the compiler
    // will
    // error — that’s the primary purpose of abstract here: prevent instantiation of
    // the base type.
    abstract void walk();
}

class Horse extends Animal {
    void changeColor() {
        this.color = "dark Brown";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    void changeColor() {
        this.color = "yellow";
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}