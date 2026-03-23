public class leet231 {

    public static void main(String[] args) {
        Solution231 sol = new Solution231();

        int n1 = 1;
        int n2 = 16;
        int n3 = 3;
        int n4 = 0;

        System.out.println(n1 + " -> " + sol.isPowerOfTwo(n1));
        System.out.println(n2 + " -> " + sol.isPowerOfTwo(n2));
        System.out.println(n3 + " -> " + sol.isPowerOfTwo(n3));
        System.out.println(n4 + " -> " + sol.isPowerOfTwo(n4));
    }
}

class Solution231 {
    public boolean isPowerOfTwo(int n) {
        return (n > 0 && (n & (n - 1)) == 0);
    }
}