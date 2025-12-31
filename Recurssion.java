public class Recurssion {

    public static int frPair(int n) {

        // bc
        if (n == 1 || n == 2) {
            return n;
        }

        // for single
        int fnm1 = frPair(n - 1);

        // for pair
        int fnm2 = frPair(n - 2);

        int totalWays = fnm1 + (n - 1) * fnm2;
        // single select + pairs
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(frPair(4));
        ;
    }

}