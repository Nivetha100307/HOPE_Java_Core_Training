
public class leet268 {

    public static void main(String[] args) {
        Solution268 sol = new Solution268();

        int[] arr1 = { 3, 0, 1 };
        int[] arr2 = { 0, 1 };

        System.out.println("Missing Number = " + sol.missingNumber(arr1));
        System.out.println("Missing Number = " + sol.missingNumber(arr2));
    }
}

class Solution268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        double tot = n * (n + 1) / 2.0;
        int sum = 0;

        for (int i : nums) {
            sum += i;
        }

        int total = (int) tot;
        return (total - sum);
    }
}