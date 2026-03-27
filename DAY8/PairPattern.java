package DAY8;

import java.util.*;

public class PairPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();

        for (int i = 0; i <= n / 2; i++) {
            System.out.print(s.charAt(i));

            int spaces = n - 2 * i - 2;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            if (i != n - i - 1) {
                System.out.println(s.charAt(n - i - 1));
            } else {
                System.out.println();
            }
        }

        for (int i = n / 2 - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));

            int spaces = n - 2 * i - 2;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            System.out.println(s.charAt(n - i - 1));
        }

        sc.close();
    }
}