public class leet1672 {

    public static void main(String[] args) {
        Solution1672 sol = new Solution1672();

        int[][] arr1 = {
                { 1, 2, 3 },
                { 3, 2, 1 }
        };

        int[][] arr2 = {
                { 1, 5 },
                { 7, 3 },
                { 3, 5 }
        };

        System.out.println("Maximum Wealth = " + sol.maximumWealth(arr1));
        System.out.println("Maximum Wealth = " + sol.maximumWealth(arr2));
    }
}

class Solution1672 {
    public int maximumWealth(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int max = 0;

        for (int i = 0; i < m; i++) {
            int a = 0;
            for (int j = 0; j < n; j++) {
                a += arr[i][j];
            }
            max = Math.max(max, a);
        }

        return max;
    }
}