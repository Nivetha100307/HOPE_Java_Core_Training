package DAY6;

class Solution1678 {
    public String interpret(String s) {
        s = s.replace("()", "o");
        s = s.replace("(al)", "al");
        return s;
    }
}

public class leet1678 {
    public static void main(String[] args) {

        Solution1678 sol = new Solution1678();

        String input = "G()(al)";

        String result = sol.interpret(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }
}
