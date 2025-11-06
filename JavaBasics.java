
public class JavaBasics {

    public static void deciToBi(int n) {
        int pow = 0;
        int biNum = 0;

        while (n > 0) {
            int rem = n % 2;
            biNum = biNum + rem * (int) Math.pow(10, pow);

            pow++;
            n = n / 2;

        }
        System.out.println(biNum);

    }

    public static void main(String[] args) {
        deciToBi(7);
    }

}