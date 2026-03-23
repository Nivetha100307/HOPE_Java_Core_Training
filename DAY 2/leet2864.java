public class leet2864 {

    public static void main(String[] args) {
        Solution2864 sol = new Solution2864();

        String s1 = "010";
        String s2 = "0101";
        String s3 = "1110";

        System.out.println("Result = " + sol.maximumOddBinaryNumber(s1));
        System.out.println("Result = " + sol.maximumOddBinaryNumber(s2));
        System.out.println("Result = " + sol.maximumOddBinaryNumber(s3));
    }
}

class Solution2864 {
    public String maximumOddBinaryNumber(String s) {
        int count = 0;
        int l = s.length();

        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count - 1; i++) {
            sb.append("1");
        }

        for (int i = count - 1; i < l - 1; i++) {
            sb.append("0");
        }

        sb.append("1");

        return sb.toString();
    }
}