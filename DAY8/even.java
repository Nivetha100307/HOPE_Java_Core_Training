package DAY8;

import java.util.*;

public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch[] = s.toCharArray();
        int n = ch.length;
        int diff = 0, a = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                if (ch[i] != ' ' && ch[i + 1] == ' ') {
                    diff = (i + 1) - a;
                    if (diff % 2 == 0) {
                        for (int k = a; k < i + 1; k++) {
                            sb.append(ch[k]);
                        }
                        sb.append(" ");
                    }
                }
                if (i != 0) {
                    if (ch[i] != ' ' && ch[i - 1] == ' ') {
                        a = i;
                    }
                }
            } else {
                diff = n - a;
                if (diff % 2 == 0) {
                    for (int k = a; k < n; k++) {
                        sb.append(ch[k]);
                    }
                }
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}