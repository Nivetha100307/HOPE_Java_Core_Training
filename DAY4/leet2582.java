package DAY4;

public class leet2582 {

    public static void main(String[] args) {
        Solution2582 sol = new Solution2582();

        // Test cases
        System.out.println(sol.passThePillow(4, 5));   // 2
        System.out.println(sol.passThePillow(4, 10));  // 3
        System.out.println(sol.passThePillow(6, 19));  // 2
    }
}

class Solution2582 {
    public int passThePillow(int n, int time) {

        int cycle = 2 * (n - 1);
        time %= cycle;

        if (time < n) {
            return time + 1;
        } else {
            return n - (time - (n - 1));
        }
    }
}