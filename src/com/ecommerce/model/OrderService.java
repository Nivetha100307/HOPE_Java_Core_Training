package src.com.ecommerce.model;

public class OrderService {

    public void placeOrder(Order order) {
        double totalPrice = order.product.price * order.quantity;

        System.out.println("Username: " + order.user.name);
        System.out.println("Product: " + order.product.name);
        System.out.println("Quantity: " + order.quantity);
        System.out.println("Total Price: " + totalPrice);
    }
}
