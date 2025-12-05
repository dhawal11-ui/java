public class JavaBasics {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal {
    String color;

    Animal() {

        System.out.println("Animal constructor called");
    }
}

class Horse extends Animal {
    Horse() {
        // super(); // animal ke constructor ko call karta hai (same as this. but yeh
        // parent class ke liye hota hai). Java by default likhta
        super.color = "brown";
        // super(); sabse upr likha hona chahiye constructor ke andar. (here niche likha
        // huwa hai for explanation purpose , ye error dega)
        System.out.println("Horse constructor called");
    }
}