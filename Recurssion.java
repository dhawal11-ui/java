public class Recurssion {

    public static void main(String[] args) {
        String str = "apnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map) {
        if (idx == str.length()) { // BC
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) { // duplicate
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            newStr.append(currChar);
            removeDuplicates(str, idx + 1, newStr, map);
            newStr.deleteCharAt(newStr.length() - 1);
        }
    }
}