public class Recurssion {

    public static void main(String[] args) { // To find first occurence of an element{key} in an array
        System.out.println(power(2, 10));
    }

    public static int power(int x, int n) {
        if (n == 0) { // base case
            return 1;
        }

        return x * power(x, n - 1); // rec8urssion

    }

}
