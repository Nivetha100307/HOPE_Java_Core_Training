public class leet1822 {

    public static void main(String[] args) {
        Solution1822 sol = new Solution1822();

        int[] arr1 = { -1, -2, -3, -4, 3, 2, 1 };
        int[] arr2 = { 1, 5, 0, 2, -3 };
        int[] arr3 = { -1, 1, -1, 1, -1 };

        System.out.println("Sign = " + sol.arraySign(arr1));
        System.out.println("Sign = " + sol.arraySign(arr2));
        System.out.println("Sign = " + sol.arraySign(arr3));
    }
}

class Solution1822 {
    public int arraySign(int[] nums) {
        int nc = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            } else if (nums[i] < 0) {
                nc++;
            }
        }

        if (nc % 2 == 0) {
            return 1;
        } else {
            return -1;
        }
    }
}