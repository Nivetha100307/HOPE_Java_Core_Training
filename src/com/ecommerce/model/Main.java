package src.com.ecommerce.model;

public class Main {
    public static void main(String[] args) {

        User user = new User("Nivetha", "Chennai");
        Product product = new Product("Laptop", 50000);

        Order order = new Order(user, product, 2);

        OrderService service = new OrderService();
        service.placeOrder(order);
    }
}

// CMD to run
// PS C:\nive\DSA+HOPE\JAVA> javac -d . src/com/ecommerce/model/*.java
// PS C:\nive\DSA+HOPE\JAVA> java src.com.ecommerce.model.Main
// Username: Nivetha
// Product: Laptop
// Quantity: 2
// Total Price: 100000.0