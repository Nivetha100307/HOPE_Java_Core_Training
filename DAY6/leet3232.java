package DAY6;

public class leet3232 {
    public static void main(String[] args) {
        Solution3232 obj = new Solution3232();
        int[] nums = { 1, 2, 10, 11 };
        System.out.println(obj.canAliceWin(nums));
    }
}

class Solution3232 {
    public boolean canAliceWin(int[] nums) {
        int sum1 = 0, sum2 = 0;
        for (int i : nums) {
            if (i < 10)
                sum1 += i;
            else
                sum2 += i;
        }
        return sum1 != sum2;
    }
}