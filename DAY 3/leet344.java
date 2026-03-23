public class leet344 {

    public static void main(String[] args) {
        Solution344 sol = new Solution344();

        char[] s1 = { 'h', 'e', 'l', 'l', 'o' };
        char[] s2 = { 'H', 'a', 'n', 'n', 'a', 'h' };

        sol.reverseString(s1);
        sol.reverseString(s2);

        System.out.println(java.util.Arrays.toString(s1));
        System.out.println(java.util.Arrays.toString(s2));
    }
}

class Solution344 {
    public void reverseString(char[] s) {
        int j = s.length - 1;
        int i = 0;
        while (i < j) {
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            i++;
            j--;
        }
    }
}