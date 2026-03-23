public class leet283 {

    public static void main(String[] args) {
        Solution283 sol = new Solution283();

        int[] arr1 = { 0, 1, 0, 3, 12 };
        int[] arr2 = { 0, 0, 1 };

        sol.moveZeroes(arr1);
        sol.moveZeroes(arr2);

        System.out.println(java.util.Arrays.toString(arr1));
        System.out.println(java.util.Arrays.toString(arr2));
    }
}

class Solution283 {
    public void moveZeroes(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}