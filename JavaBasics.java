public class JavaBasics {

    public static void main(String[] args) {
        Peacock p1 = new Peacock();
        p1.eat();
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
//Mammals
class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Dog extends Animal{
    void name(){
        System.out.println("Dog");
    }
}
class Cat extends Animal{
    void name(){
        System.out.println("Cat");
    }
}
class Human extends Animal{
    void name(){
        System.out.println("Human");
    }
}

//Fish
class Fish extends Animal {
    void swim() {
        System.out.println("Swim");
    }
}

class Tuna extends Fish {
    void name() {
        System.out.println("Tuna");
    }
}

class Shark extends Fish {
    void name() {
        System.out.println("Shark");
    }
}

// Bird
class Bird extends Animal {
    void fly() {
        System.out.println("FLy");
    }
}

class Peacock extends Fish {
    void name(){
        System.out.println("peacock");
    }
}
