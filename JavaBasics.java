public class JavaBasics {

    public static void numCheck(int num[]){
           for(int i=0;i<num.length;i++){
            int checkNo = num[i];

                for(int j=0;j<num.length;j++){
                    if(checkNo == num[j]){
                     System.out.println("True3");
                     break;

                    }

                }
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }
    public static void main(String args[]) {
        int num[]={1, 2, 3, 1};
        numCheck(num);

        // Test the add function
        int result = add(5, 3);
        System.out.println("Addition result: " + result);

        // Add an array of 5 natural numbers and sum them
        int[] naturalNumbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : naturalNumbers) {
            sum += number;
        }
        System.out.println("Sum of natural numbers: " + sum);

    }
    
}
