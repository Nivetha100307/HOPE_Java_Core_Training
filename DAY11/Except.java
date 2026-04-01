package DAY11;

public class Except {
    public static void main(String[] args) {
        try {
            System.out.println("Result: " + (10 / 0)); // This will throw an ArithmeticException
            // String s = null;
            // System.out.println(s.length());         // This will throw a NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        } finally {
            System.out.println("This block will always execute.");
        }
    }
}
