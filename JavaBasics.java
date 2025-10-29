import java.util.*;

public class JavaBasics {
    public static void main(String[] args) { // code input lene ke bad age procced krega./ First A then B then Char .
                                             // then switch . upto down approach
        Scanner sc = new Scanner(System.in);
        System.out.println("E4nter A");
        int a = sc.nextInt();
        System.out.println("Enter B");
        int b = sc.nextInt();
        System.out.println("Enter operator");
        char operator = sc.next().charAt(0);
        System.out.println("Your answer is ");
        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;

            default:
                System.out.println("wrong case");
        }

    }
}
