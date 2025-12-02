public class JavaBasics {

    public static void main(String[] args) {
        // CONSTRUCTOR OVERLOADING (ex of polymorphism)
        Student s1 = new Student(); // fn1 ..(agr yeh line chalaani hai bina student class meh constructor banaye
                                    // yani default constructor made by java ko use krke . Toh hame baki sare
                                    // construcors jo hane banaye class student meh woh hame delete karne hoge
                                    // .bchncod)
        Student s2 = new Student("dhawal"); // fn2
        Student s3 = new Student(19);// fn3

    }
}

class Student {
    String name;
    int roll;

    Student() { // fn1
        System.out.println("constructor is called");
    }

    Student(int roll) {// fn2
        this.roll = roll;
    }

    Student(String name) {// fn3
        this.name = name;
    }
}