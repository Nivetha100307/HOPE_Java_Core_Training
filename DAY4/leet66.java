package DAY4;

public class leet66 {

    public static void main(String[] args) {
        Solution66 sol = new Solution66();

        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 9, 9, 9 };

        arr1 = sol.plusOne(arr1);
        arr2 = sol.plusOne(arr2);

        System.out.println(java.util.Arrays.toString(arr1));
        System.out.println(java.util.Arrays.toString(arr2));
    }
}

class Solution66 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[n + 1];
        res[0] = 1;
        return res;
    }
}