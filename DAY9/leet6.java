package DAY9;

import java.util.*;

class solution6 {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}

public class leet6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String s = sc.nextLine();
        int numRows = sc.nextInt();

        solution6 obj = new solution6();
        String result = obj.convert(s, numRows);

        // Output
        System.out.println(result);

        sc.close();
    }
}