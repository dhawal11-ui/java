public class JavaBasics {

    public static void printSubArrays(int numbers[]) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) { // for determining starting position of indexes .
            int start = i;
            for (int j = i; j < numbers.length; j++) { // start se end dono ki positon define krna .
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    // subarray sub
                    currSum += numbers[k];
                }

                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }

            }

        }
        System.out.println("Max sum = " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        printSubArrays(numbers);
    }

}