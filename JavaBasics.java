public class JavaBasics {
    public static void main(String[] args) {
        Vehicle v = new Car(); // child ka object parent ke refrence variable meh access kar skate hai .
        // Car c = new Vehicle(); // wrong
        v.name();
        // lhs refrence(point variable jo address store karta hai object ka)= rhs object
        // (new keyword se ham memory dete hai). obj - meomory ke andar kuch data store
        // huwa hai .

    }
}

class Vehicle {
    String name;

    // syso direct use nhi kar sakte hai usko construcotr ke andr karna padta
    // bchnod.
    Vehicle() {
        System.out.print("Hello, ");
    }

    void name() {
        System.out.println("vehicle is called ");
    }
}

class Car extends Vehicle {
    String vehicleName;

    void Car() {
        System.out.println("vehicle called");
    }

    void name() {
        System.out.println("car is called ");
    }
}