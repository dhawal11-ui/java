public class Recurssion {

    public static void converter(int n[], String arr[], int idx) {
        // bc
        if (idx == arr.length) {
            System.out.println("end");
        } else {

            System.out.println(arr[n[idx]]);
            converter(n, arr, idx + 1);
        }
    }

    public static void main(String[] args) {
        String letter[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        int number[] = { 1, 9, 4, 7 };
        converter(number, letter, 0);
    }
}