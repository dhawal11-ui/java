public class JavaBasics {
    public static void printPairs(int numbers[]) {
        int  tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
           
        }
        System.out.println(tp);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printPairs(numbers);
    }

}


// formula to find by observing patterrsn . n(n-2)/2; .. sum of n-1 numbners .

// outer loop -> o(n)
// inner loop - > o(n  + n-1 ... 1)

// time complexity at worst case -> o(n2)