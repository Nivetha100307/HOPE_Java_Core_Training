package DAY6;

// Solution class
class Solution520 {

    public boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase()))
            return true;

        if (word.equals(word.toLowerCase()))
            return true;

        if (Character.isUpperCase(word.charAt(0)) &&
                word.substring(1).equals(word.substring(1).toLowerCase()))
            return true;

        return false;
    }
}

// Main class
public class leet520 {
    public static void main(String[] args) {

        Solution520 sol = new Solution520();

        String word1 = "USA";
        String word2 = "leetcode";
        String word3 = "Google";
        String word4 = "FlaG";

        System.out.println(word1 + " → " + sol.detectCapitalUse(word1));
        System.out.println(word2 + " → " + sol.detectCapitalUse(word2));
        System.out.println(word3 + " → " + sol.detectCapitalUse(word3));
        System.out.println(word4 + " → " + sol.detectCapitalUse(word4));
    }
}
