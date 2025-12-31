public class Recurssion {

    public static void findOcc(int arr[], int idx) {

        // bc
        if (idx == 9) {
            System.out.println("end");

        } else if (arr[idx] == 2) {
            System.out.println(idx);
            findOcc(arr, idx + 1);

        } else {

            findOcc(arr, idx + 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2, };
        findOcc(arr, 0);

    }
}