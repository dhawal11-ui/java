public class Recurssion {
    public static void main(String[] args) {// sirf arrray check kr rhe hai . sorted bna nhi rhe hai array ko.
        int arr[] = { 1, 2 };
        System.out.println(isSorted(arr, 0));
    }

    public static boolean isSorted(int arr[], int i) { //
        if (i == arr.length - 1) { // Base Case (for ending || and also for single element of array.)
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        } // nichi ki run he nhi hoti agr upr wala false dedeta to.
        return isSorted(arr, i + 1);
    }

}