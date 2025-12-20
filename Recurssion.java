public class Recurssion {

    public static void main(String[] args) { // To find first occurence of an element{key} in an array
        int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9, 5 };
        System.out.println(firstOcc(arr, 5, 0));
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