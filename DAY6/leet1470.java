package DAY6;

public class leet1470 {

    public static void main(String[] args) {
        Solution1470 sol = new Solution1470();

        int[] arr = { 2, 5, 1, 3, 4, 7 };
        int n = 3;

        int[] result = sol.shuffle(arr, n);

        printArray(result);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class Solution1470 {
    public int[] shuffle(int[] arr, int n) {
        int[] result = new int[arr.length];
        int j = 0;
        int k = n;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result[i] = arr[j];
                j++;
            } else {
                result[i] = arr[k];
                k++;
            }
        }
        return result;
    }
}