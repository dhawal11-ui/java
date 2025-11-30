public class JavaBasics {
    public static void main(String[] args) { // starting of the execution of the program . by compiler (yhi dhundega
                                             // pehele )
        Pen p1 = new Pen(); // constructor . (memory meh pen object banaya p1 name seh)
        p1.setColor("Blue");
        System.out.println(p1.color); // just like key value pairs
        p1.setTip(5); // accessing function
        System.out.println(p1.tip); // accessing blueprint p1 tip value .

        //rechanging directly by accessing its value .
        p1.color = "marine";
        System.out.println(p1.color);
      
    }

}

// classes public ke upr na banaye .yeh classes ke objects banane me pareshani
// ayegi
// bluprints
class Pen {
    // prop+ functions
    String color;
    int tip;

    void setColor(String newColor) {// functions of the class
        color = newColor;
    }

    void setTip(int newTip) {// functions of the class
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage; // cgpa

    void calcPercentage(int phy, int chem, int math) { // functions of the class
        percentage = (phy + chem + math) / 3;
    }
}