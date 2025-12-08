public class Recurssion {

    public static void main(String[] args) {
        System.out.println("you sum is " + sum(8));
    }

    public static int sum(int n) {
        if (n == 1) {// BC (base case).
            return 1;
        }
        int sum = sum(n - 1); // return store return store .
        return sum + n;
    }

} // time and space complexity are both O(n);.