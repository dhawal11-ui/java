public class JavaBasics {

    public static void main(String[] args) {
        
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
    void walk() {
        System.out.println("walks");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("Swim");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("FLy");
    }
}
