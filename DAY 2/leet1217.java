class Solution1217 {
    public int minCostToMoveChips(int[] position) {
        int[] count = new int[2];
        for (final int p : position)
            ++count[p % 2];
        return Math.min(count[0], count[1]);
    }
}

public class leet1217 {
    public static void main(String[] args) {
        Solution1217 sol = new Solution1217();

        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 2, 2, 2, 3, 3 };

        System.out.println("Min Cost = " + sol.minCostToMoveChips(arr1));
        System.out.println("Min Cost = " + sol.minCostToMoveChips(arr2));
    }
}