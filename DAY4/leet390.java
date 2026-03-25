public class leet390 {

    public static void main(String[] args) {
        Solution390 sol = new Solution390();

        System.out.println(sol.lastRemaining(9));
        System.out.println(sol.lastRemaining(1));
    }
}

class Solution390 {
    public int lastRemaining(int n) {
        int head = 1;
        int step = 1;
        int remaining = n;
        boolean left = true;

        while (remaining > 1) {
            if (left || remaining % 2 == 1) {
                head += step;
            }

            remaining /= 2;
            step *= 2;
            left = !left;
        }

        return head;
    }
}