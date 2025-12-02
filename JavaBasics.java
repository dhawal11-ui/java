public class JavaBasics {

    public static void main(String[] args) {
        Student s1 = new Student("dhawal"); // student class ke andr ka student fu
        System.out.println(s1.name);

    }
}

class Student {
    String name;
    int roll;

    Student(String name) {
        this.name = name;
    }
}