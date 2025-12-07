public class JavaBasics {
    public static void main(String[] args) {
        Vehicle v = new Car();
        // v.name1(); 

    }
}

class Vehicle {
    String name;

    Vehicle() {
        System.out.print("Hello, ");
    }

    void name() {
        System.out.println("vehicle is called ");
    }
}

class Car extends Vehicle {
    String vehicleName;

    void name1() {
        System.out.println("car is called ");
    }
}