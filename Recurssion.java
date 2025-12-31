class Recurssion {
    // str builder se v kar sakte the but woh complex hojata tha . Isliye nhi kiya.
    // Umse append ek waqt ek posn per 2 ajate the kabhi kabhi 0 ya 1 .. isliye
    // remove v karna padtta tha .

    public static void printBiStr(int n, int lastPlace, String str) {
        if (n == 0) {
            System.err.println(str);
            return;
        }
        // kaam
        printBiStr(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBiStr(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        printBiStr(30, 0, "");
    }
}