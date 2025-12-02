public class JavaBasics {

    public static void main(String[] args) {
        Student s1 = new Student(); // student class ke andr ka student functioln
        s1.name("dhawal", 11);
        System.out.println(s1.name);
    }
}

class Student {
    String name;
    int roll;

   

    void name(String name, int roll) {
        this.roll = roll;
        this.name = name;// ye changes consturctor me krega
    }
}