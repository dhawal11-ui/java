public class Recurssion {
    // Tc O(logn) Tree daigram >< ( total levels se calc kara ki tc logn hogi )\
    public static int optimizePower(int a, int n) {
        if (n == 0) { // Base case
            return 1;
        }
        int halfPowerSq = (int) Math.pow(optimizePower(a, n / 2), 2);

        // n is odd
        if (n % 2 != 0) {
            halfPowerSq = halfPowerSq * a;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) { // To find first occurence of an element{key} in an array

        int a = 2;
        int n = 10;
        System.out.println(optimizePower(a, n));
    }

    // Tc O(n);
    public static int power(int x, int n) {
        if (n == 0) { // base case
            return 1;
        }

        return x * power(x, n - 1); // rec8urssion

    }

}
