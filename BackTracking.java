public class BackTracking {

    public static void findSubsets(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }

            return;
        }
        // recurrision
        // yes choice
        findSubsets(str, ans + str.charAt(i), i + 1);
        // no choice
        findSubsets(str, ans, i + 1);
        // to print in reverse order exchange the above line positions.
    }

    public static void main(String[] args) {
        String str = "abcfgsfgsfgs";
        findSubsets(str, "", 0);
    }

}

// TC = O(n*2**n) // ek subset nikal ne ko 1 step lagta then 2**n subsets ke n
// steps.
// liye n2**n
// SC =O(n) // stack meh n levels bante hai ...
// Also try with string builder . then use deleete character to delete from
// string.