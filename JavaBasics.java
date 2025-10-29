import java.util.*;

public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int A = sc.nextInt();

        // if (A > 0) {
        // System.out.println("A is an positive NUmbeer");
        // } else {
        // System.out.println("A is an Negative NUmbeer");
        // }

        // double temp = 103.5;
        // if (temp > 100) {
        // System.out.println("YOu have fever");
        // } else {
        // System.out.println("No fever");
        // }

        // int week = 6;
        // switch (week) {
        // case 1:
        // System.out.println("sunday");
        // break;
        // case 2:
        // System.out.println("monday");
        // break;
        // case 3:
        // System.out.println("tuesday");
        // break;
        // case 4:
        // System.out.println("wensday");
        // break;
        // case 5:
        // System.out.println("thursday");
        // break;
        // case 6:
        // System.out.println("friday");
        // break;
        // case 7:
        // System.out.println("saturday");
        // break;

        // default:
        // System.out.println("you enter a wrong number");
        // }

        // x=f and y =a

        int year = sc.nextInt();

        if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            System.out.println("leap year");
        } else {
            System.out.println("not a leap year");
        }
        ;
    }
}