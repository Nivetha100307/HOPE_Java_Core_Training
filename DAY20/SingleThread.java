package DAY20;

import java.util.Scanner;

public class SingleThread {
    public static void main(String[] args) {
        // single threaded
        task1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        task2();
        sc.close();
    }

    static void task1() {
        for (int i = 0; i < 5; i++) {
            System.out.println("From Task 1: " + i);
        }
    }

    static void task2() {
        for (int i = 0; i < 5; i++) {
            System.out.println("From Task 2: " + i);
        }
    }
}