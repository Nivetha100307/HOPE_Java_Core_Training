public class leet2220 {

    public static void main(String[] args) {
        Solution2220 sol = new Solution2220();

        int start1 = 10, goal1 = 7;
        int start2 = 3, goal2 = 4;

        System.out.println(sol.minBitFlips(start1, goal1));
        System.out.println(sol.minBitFlips(start2, goal2));
    }
}

class Solution2220 {
    public int minBitFlips(int start, int goal) {
        return Integer.bitCount(start ^ goal);
    }
}