public class JavaBasics {
    public static void printSubArrays(int numbers[]) {
        int ts =0;
        for(int i =0 ; i< numbers.length ; i++){ // for determining starting position of indexes .
            int start = i;
            for(int j=i ;j<numbers.length ; j++){ // start se end dono ki positon define krna . 
                int end = j;
                for(int k=start ;k<=end ; k++){
                    System.out.print(numbers[k]+ " "); // sub array  (printing ka kam karna . )
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub arrays = "+ ts);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10};
        printSubArrays(numbers);
    }

}


// formula where n is the size of an array.
    // sum = n(n=1)/2