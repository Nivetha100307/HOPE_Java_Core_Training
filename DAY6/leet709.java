package DAY6;

class Solution709 {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
}

public class leet709 {
    public static void main(String[] args) {

        Solution709 sol = new Solution709();

        String input = "Hello WORLD";

        String result = sol.toLowerCase(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }
}