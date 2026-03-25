package DAY6;

public class leet189 {

    public static void main(String[] args) {
        Solution189 sol = new Solution189();

        int[] nums1 = {1,2,3,4,5,6,7};
        sol.rotate(nums1, 3);
        printArray(nums1);  

        int[] nums2 = {-1,-100,3,99};
        sol.rotate(nums2, 2);
        printArray(nums2);   
    }

    public static void printArray(int[] nums) {
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

class Solution189 {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}