public class leet557 {

    public static void main(String[] args) {
        Solution557 sol = new Solution557();

        String s1 = "Let's take LeetCode contest";
        String s2 = "God Ding";

        System.out.println(sol.reverseWords(s1));
        System.out.println(sol.reverseWords(s2));
    }
}

class Solution557 {
    public String reverseWords(String s) {
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            char[] ch = words[i].toCharArray();

            int l = 0, r = ch.length - 1;

            while (l < r) {
                char temp = ch[l];
                ch[l] = ch[r];
                ch[r] = temp;
                l++;
                r--;
            }

            words[i] = new String(ch);
        }

        return String.join(" ", words);
    }
}