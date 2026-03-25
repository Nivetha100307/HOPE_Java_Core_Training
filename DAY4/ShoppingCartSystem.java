package DAY4;

class Shopping {
    int id;
    String name;
    double price;
    int qty;

    Shopping(int id, String name, double price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
        System.out.println("Item ID: " + id + ", Name: " + name + ", Price: $" + price
                + ", Quantity: " + qty);
        getTotalPrice(price, qty);
    }

    void getTotalPrice(double price, int qty) {
        double totalPrice = price * qty;
        System.out.println("Total Price: $" + totalPrice + "\n");
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        new Shopping(1, "Laptop", 999.99, 1);
        new Shopping(2, "Headphones", 199.99, 2);
        new Shopping(3, "Mouse", 49.99, 1);
    }
}