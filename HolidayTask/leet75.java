public class leet75 {

    public static void main(String[] args) {
        Solution75 sol = new Solution75();

        int[] arr1 = { 2, 0, 2, 1, 1, 0 };
        int[] arr2 = { 2, 0, 1 };

        sol.sortColors(arr1);
        sol.sortColors(arr2);

        System.out.println(java.util.Arrays.toString(arr1));
        System.out.println(java.util.Arrays.toString(arr2));
    }
}

class Solution75 {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}