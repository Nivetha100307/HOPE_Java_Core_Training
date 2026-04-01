package DAY11;

class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

class PaymentFailedException extends Exception {
    public PaymentFailedException(String message) {
        super(message);
    }
}

class OrderProcessingException extends Exception {
    public OrderProcessingException(String message) {
        super(message);
    }
}

class Product {
    String name;
    int stock;
    double price;

    Product(String name, int stock, double price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }
}

class User {
    String name;
    String address;

    User(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

class Order {
    Product product;
    User user;
    int quantity;

    Order(Product product, User user, int quantity) {
        this.product = product;
        this.user = user;
        this.quantity = quantity;
    }
}

class OrderService {

    public void placeOrder(Order order)
            throws OutOfStockException, PaymentFailedException, OrderProcessingException {

        if (order.product.stock < order.quantity) {
            throw new OutOfStockException("Product out of stock!");
        }

        if (!processPayment(order)) {
            throw new PaymentFailedException("Payment failed!");
        }

        if (!processOrder(order)) {
            throw new OrderProcessingException("Order processing failed!");
        }

        order.product.stock -= order.quantity;

        System.out.println("Order placed successfully for " + order.user.name);
    }

    private boolean processPayment(Order order) {
        return Math.random() > 0.3; // 70% success
    }

    private boolean processOrder(Order order) {
        return Math.random() > 0.2; // 80% success
    }
}

public class OrderSystem {
    public static void main(String[] args) {

        Product p = new Product("Laptop", 5, 50000);
        User u = new User("Nivetha", "Chennai");

        Order order = new Order(p, u, 2);

        OrderService service = new OrderService();

        try {
            service.placeOrder(order);
        } catch (OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (OrderProcessingException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
