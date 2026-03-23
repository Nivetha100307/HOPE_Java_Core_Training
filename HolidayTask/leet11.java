public class leet11 {

    public static void main(String[] args) {
        Solution11 sol = new Solution11();

        int[] arr1 = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int[] arr2 = { 1, 1 };

        System.out.println(sol.maxArea(arr1));
        System.out.println(sol.maxArea(arr2));
    }
}

class Solution11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            int area = h * width;

            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}