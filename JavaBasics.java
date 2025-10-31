import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 2) {
            System.out.println("n is prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) { // square root of no. n
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
                ;
            }
            if (isPrime == true) {
                System.out.println("n is prime");
            } else {
                System.out.println("n is not prime ");
            }

        }

    }

}