public class JavaBasics {
    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0; // propety of binary num .
        // also can we do it by taking log.?
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(3434));
    }
}