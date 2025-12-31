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
        if (map[currChar - 'a'] == true) { // duplicate {ham yha samaj rhe hai ki woh currchar exists krti hai}
            removeDuplicates(str, idx + 1, newStr, map);
        } else { // dne currChar in map
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);

        }
    }
}