import java.util.*;

public class JavaBasics {
    public static void main(String[] args) {
        char ch = 'a';

        switch (ch) {
            case 'a':
                System.out.println("samosa");
                break;
            case 'b':
                System.out.println("burger");
                break;

            case 'f':
                System.out.println("mango shake");
                break;
            default:
                System.out.println("we relize we are dreami9ng");

        }
    }
}
/*
 * o/p without using break.
 * burger
 * mango shake
 * we relize we are dreami9ng
 */

/*
 * o/p using break.
 * burger
 * 
 */
