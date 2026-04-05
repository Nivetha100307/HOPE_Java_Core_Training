package src.com.ecommerce.model;

public class Order {
    User user;
    Product product;
    int quantity;

    Order(User user, Product product, int quantity) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
    }
}
