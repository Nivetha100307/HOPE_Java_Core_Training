package DAY7;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;

        if (str.length() == 0) {
            System.out.println("0");
            sc.close();
            return;
        }

        char[] ch = str.toCharArray();

        if (ch[0] != ' ') {
            count++;
        }

        for (int i = 1; i < ch.length; i++) {
            if (ch[i] != ' ' && ch[i - 1] == ' ') {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}