public class JavaBasics {

    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
        Animal a = new Animal();
        a.eat();

    }
}

class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");
    }
}