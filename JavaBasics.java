import java.util.*;

public class JavaBasics {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infuinity

        for(int i=0 ; i<numbers.length ; i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }

        }

        return largest;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,3,94,5 };
       System.out.println(getLargest(numbers));
    }
} 