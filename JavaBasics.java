public class JavaBasics {

    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
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

// Derived Class / sub class
class Fish extends Animal {
    void swin() {
        System.out.println("swims in water");
    }
}