package DAY7;

class solution796 {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        return (s + s).contains(goal);
    }
}

public class leet796 {
    public static void main(String[] args) {
        solution796 sol = new solution796();

        String s = "abcde";
        String goal = "cdeab";

        boolean result = sol.rotateString(s, goal);

        System.out.println("String s: " + s);
        System.out.println("Goal: " + goal);
        System.out.println("Is Rotation: " + result);
    }
}