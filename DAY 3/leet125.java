public class leet125 {

    public static void main(String[] args) {
        Solution125 sol = new Solution125();

        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";

        System.out.println(sol.isPalindrome(s1));
        System.out.println(sol.isPalindrome(s2));
        System.out.println(sol.isPalindrome(s3));
    }
}

class Solution125 {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);

            if (!Character.isLetterOrDigit(ch1)) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(ch2)) {
                j--;
                continue;
            }

            if (Character.toLowerCase(ch1) != Character.toLowerCase(ch2)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}