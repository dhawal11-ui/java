public class Recurssion {

    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1); // last meh printDec ko he call lagaya . jo ki upr likha huwa hia public static
                         // void printDec(int n).
    }

    public static void main(String[] args) {    
        printDec(10);
    }

}
