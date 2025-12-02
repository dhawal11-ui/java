public class JavaBasics {

    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 10;
        System.out.println(dobby.legs);
    }
}

// Base Class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breadth() {
        System.out.println("breadths");
    }

}

class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String breed;
}

// Derived Class / sub class
class Fish extends Animal {
    void swin() {
        System.out.println("swims in water");
    }
}