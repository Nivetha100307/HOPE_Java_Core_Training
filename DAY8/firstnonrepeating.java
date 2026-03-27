package DAY8;

import java.util.*;

public class firstnonrepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch[] = s.toCharArray();
        int n = ch.length;
        s = s.toLowerCase();
        int count[] = new int[26];
        for (int i = 0; i < n; i++) {
            count[ch[i] - 'a']++;
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            if (count[ch[i] - 'a'] == 1) {
                System.out.println(ch[i]);
                return;
            }
        }
        System.out.println("-1");
    }
}