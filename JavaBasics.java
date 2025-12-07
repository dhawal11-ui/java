public class JavaBasics {

    public static void main(String[] args) {
        marks m = new marks();
        m.check_marks(2);
        System.out.println(marks.marks);
    }
}

class marks {
 static   int marks = 10; // 

    int check_marks(int marks) {
        return marks;
    }
}