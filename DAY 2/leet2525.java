public class leet2525 {

    public static void main(String[] args) {
        Solution2525 sol = new Solution2525();

        int l1 = 1000, w1 = 35, h1 = 700, m1 = 300;
        int l2 = 200, w2 = 50, h2 = 800, m2 = 50;
        int l3 = 10000, w3 = 10000, h3 = 10000, m3 = 150;

        System.out.println("Category = " + sol.categorizeBox(l1, w1, h1, m1));
        System.out.println("Category = " + sol.categorizeBox(l2, w2, h2, m2));
        System.out.println("Category = " + sol.categorizeBox(l3, w3, h3, m3));
    }
}

class Solution2525 {
    public String categorizeBox(int length, int width, int height, int mass) {
        final boolean isBulky = length >= 10000 || width >= 10000 || height >= 10000 ||
                (long) length * width * height >= 1_000_000_000;

        final boolean isHeavy = mass >= 100;

        if (isBulky && isHeavy)
            return "Both";
        if (isBulky)
            return "Bulky";
        if (isHeavy)
            return "Heavy";

        return "Neither";
    }
}