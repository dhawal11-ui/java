// 1: Pivot lelo ( jayada tr last wale ko lete  hai)
// 2: Partition(PIVOT KE AROUND ARRANGE AGE YA PICHE) 
// 3: tO CALL QUICK SORT  (for left and right )  
public class Recurssion {
    public static void quickSort(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }

        // last elemet (pviot)
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1); // left
        quickSort(arr, pIdx + 1, pIdx - 1); // right
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // To make place for elements smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) { // check element for pivot.
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // swap
        int temp = pivot;
        arr[ei] = arr[i]; // pivot = arr[i]; X
        arr[i] = temp;
        return i;

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*
         * Merge sort. TC nlogn
         * approach
         * 1> Div mid
         * 2> merge sort left and right
         * 3> merge the both left and right part
         */
        int arr[] = { 6, 3, 9, 5, 2, 8 };

        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }

}