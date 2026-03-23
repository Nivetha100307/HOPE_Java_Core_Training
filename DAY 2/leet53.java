

class leet53 {

    public int maxSubArray(int[] nums) {
        int cursum = nums[0], maxsum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            cursum = Math.max(nums[i], cursum + nums[i]);
            maxsum = Math.max(maxsum, cursum);
        }

        return maxsum;
    }

    public static void main(String[] args) {

        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        leet53 obj = new leet53();

        int result = obj.maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + result);
    }
}