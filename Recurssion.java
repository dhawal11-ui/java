public class Recurssion {

    public static void main(String[] args) { // To find first occurence of an element{key} in an array
        int[] arr = { 1, 2, 3, 4, 6, 7, 8, 3, 5 };
        System.out.println(lastOcc(arr, 3, 0));
    }

    public static int lastOcc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOcc(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static int firstOcc(int arr[], int key, int i) {
        // Pura funciton else if he hai
        if (i == arr.length) { // Base case
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return firstOcc(arr, key, i + 1);
    }
}

// time complexity and space complexity is O(n);