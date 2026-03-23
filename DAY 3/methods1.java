import java.util.*;

class method1{
    public int mul(int a, int b){
        return (a*b);
    }
    public int square(int n){
        method1 o = new method1();
        return (o.mul(n,n));
    }
    public void print(int n){
        method1 s = new method1();
        System.out.println(s.square(n));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find square root: ");
        int n = sc.nextInt();
        method1 m = new method1();
        m.print(n);
        sc.close();
    }
}