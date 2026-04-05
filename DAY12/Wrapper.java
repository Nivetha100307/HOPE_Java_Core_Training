package DAY12;

public class Wrapper {
    public static int test1(String s) {
        return Integer.valueOf(s);
    }

    public static void main(String[] args) {
        // Integer b = Integer.valueOf("10"); // return type -> object(Integer)
        // Integer c = Integer.parseInt("20"); // return type -> int(int)
        // int a = b.intValue(); //unboxing -> return type -> int
        // System.out.println(b);
        // System.out.println(c);
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y); // false
        System.out.println(test1("123"));
    }
}
