package DAY7;

class solution1678 {
    public String interpret(String s) {
        s = s.replace("()", "o");
        s = s.replace("(al)", "al");
        return s;
    }
}

public class leet1678 {
    public static void main(String[] args) {
        solution1678 sol = new solution1678();

        String input = "G()(al)";
        String result = sol.interpret(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }
}