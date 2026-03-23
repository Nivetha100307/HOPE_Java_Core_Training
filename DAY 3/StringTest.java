import java.util.*;

class StringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        System.out.println("COUNT OF WORDS: " + arr.length);
        sc.close();
    }
}