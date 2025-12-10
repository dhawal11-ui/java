public class Recurssion {

    public static void main(String[] args) {// fibonachi series
        int n = 25;
        System.out.println(fib(n));
    }

    public static int fib(int n) {
        // viswar rakho n-1 already calculate hojayega. (khud se likha but logic clear
        // nhi hai )
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int fibNMO = fib(n - 1);// recursion
            int fibNMT = fib(n - 2);// recursion
            int fibonachi = fibNMO + fibNMT;
            return fibonachi;
        }
    }

}