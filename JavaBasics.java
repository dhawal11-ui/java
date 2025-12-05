// - Static Keyword.
// - Static keyword is java is uesd to share the same variable or method of a class with all the objects of the class.
//  properties , fucntiosn , block , nested class can be declared as static in java.
// static variable alag se created in the memory only once and sare objects uski reference ko point karte hain.

public class JavaBasics {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "JMV";

        Student s2 = new Student();
        System.out.println(s2.schoolName); // it will print JMV because schoolName is static variable shared by all
                                           // objects of Student class

        Student s3 = new Student();
        s3.schoolName = "XYZ School";
    }
}

class Student {
    static int returnPercentage(int math, int phy, int chem) { // logic har function ka same rhega . also recreate nhi
                                                               // hoga toh memory v bachegi.
        return (math + phy + chem) / 3;
    }

    String name;
    int rollNo;
    static String schoolName = "ABC School"; // static variable

    void setName(String name) { // setters
        this.name = name;
    }

    String getName() {// getters
        return this.name;
    }
}