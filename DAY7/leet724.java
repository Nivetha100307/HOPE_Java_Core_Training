package DAY7;

class Solution {

    public static int pivotIndex(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int l = 0;

        for (int i = 0; i < nums.length; i++) {
            int r = sum - l - nums[i];

            if (l == r) {
                return i;
            }

            l += nums[i];
        }

        return -1;
    }
}

public class leet724 {
    public static void main(String[] args) {

        int[] nums = { 1, 7, 3, 6, 5, 6 };

        int result = Solution.pivotIndex(nums);

        System.out.print("Array: ");
        for (int n : nums) {
            System.out.print(n + " ");
        }

        System.out.println("\nPivot Index: " + result);
    }
}