public class leet191 {

    public static void main(String[] args) {
        Solution191 sol = new Solution191();

        int n1 = 11;
        int n2 = 128;
        int n3 = 7;

        System.out.println("Set Bits = " + sol.hammingWeight(n1));
        System.out.println("Set Bits = " + sol.hammingWeight(n2));
        System.out.println("Set Bits = " + sol.hammingWeight(n3));
    }
}

class Solution191 {
    public int hammingWeight(int n) {
        int c = 0;
        while (n > 0) {
            c++;
            n = n & (n - 1);
        }
        return c;
    }
}