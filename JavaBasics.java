import java.util.*;

public class JavaBasics {
    public static void main(String[] args) {
        int A = 411, B = 13, C = 6;
        if ((A >= B) && (A >= C)) {
            System.out.println("A is largest");
        } else if (B >= C) {
            System.out.println("B is largest");
        } else {
            System.out.println("C is largest");
        }
    }
}
