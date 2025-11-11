import java.util.*;

public class JavaBasics {

    public static void minAndMax(int array[]) {
        int max = 0, min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        System.out.println("max =" + max);

        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                // do nothing
            } else {
                min = array[j];
            }

        }
        System.out.println("min =" + min);

    }

    public static void printSubArrays(int numbers[]) {
        int ts = 0;
        int sum = 0;
        ArrayList<Integer> sumArray = new ArrayList<>();
        // int[] sumArray = new int[50];
        for (int i = 0; i < numbers.length; i++) { // for determining starting position of indexes .
            int start = i;
            for (int j = i; j < numbers.length; j++) { // start se end dono ki positon define krna .
                int end = j;
                for (int k = start; k <= end; k++) {

                    sum = sum + numbers[k];
                    System.out.print(numbers[k] + " "); // sub array (printing ka kam karna . )

                }
                System.out.println("=" + sum);

                sumArray.add(sum); // ✅ Correct way to add elements
                ts++;
                sum = 0; // f0r resetting the value of sum.

                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub arrays = " + ts);
        System.out.println(sumArray);
        // minAndMax(sumArray);

    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubArrays(numbers);
    }

}

// formula where n is the size of an array.
// sum = n(n=1)/2