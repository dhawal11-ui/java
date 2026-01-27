public class Dsa1 {

    // Question 1

    public static void printIndex(int[] arr, int key, int idx) {
        if (idx == arr.length) {
            return;
        }
        if (arr[idx] == key) {
            System.out.print(" " + idx);
        }
        printIndex(arr, key, idx + 1);

    }

    // Question 2
    public static void printEng(int[] arr, String[] str, int idx) {
        if (idx == arr.length) {
            return;
        } else {

            System.out.print(" " + str[arr[idx]]);
            printEng(arr, str, idx + 1);

        }
    }

    // Question 3 --> Not solved

    // Approach 1 (check this there are errros.)
    /*
     * public static int strLength(String str, int idx) {
     * int store = 0;
     * char NoVal = '\0';
     * char atIdx = (char) str.charAt(idx);
     * if (atIdx == NoVal) {
     * return -1;
     * } else {
     * store++;
     * strLength(str, idx++);
     * }
     * 
     * return store;
     * 
     * }
     */

    // Approach 2

    public static int strLength(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return strLength(str.substring(1)) + 1;
    }

    // Question 4 --> Not know the process.

    // Question 5 ( TOwer of hanoi)
    public static void towerOfHanoi(int n) {

    }

    public static void contStr(String[] str, int idx) {

    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        String[] alpha = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String demo = "DhawalGala";
        // printIndex(arr, 2, 0);
        // printEng(arr, alpha, 0);
        // System.out.println(strLength(demo, 0));
        // System.out.println(strLength(demo));

    }

}
