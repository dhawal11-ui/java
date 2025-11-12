public class JavaBasics {

    public static void printSubArrays(int numbers[]) {
        int currSum = 0, maxSum = Integer.MIN_VALUE, prefix[] = new int[numbers.length];
        // calculate prefix array.
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) { // for determining starting position of indexes .
            int start = i;
            for (int j = i; j < numbers.length; j++) { // start se end dono ki positon define krna .
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
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


// TC = O(n2);