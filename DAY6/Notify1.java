package DAY6;

class Notification {
    String name;
    String message;

    Notification(String name, String message) {
        this.name = name;
        this.message = message;
    }

    void send() {
        System.out.println("Sending Notification from parent class");
    }
}

class EmailNotification extends Notification {

    // constructor must call super
    EmailNotification(String name, String message) {
        super(name, message);
    }

    void send() {
        System.out.println("Sending Email to: " + name);
        System.out.println("Message: " + message);
    }
}

class SMSNotification extends Notification {

    SMSNotification(String name, String message) {
        super(name, message);
    }

    void send() {
        System.out.println("Sending SMS to: " + name);
        System.out.println("Message: " + message);
    }
}

public class Notify1 {
    public static void main(String[] args) {

        Notification n = new EmailNotification("test", "Hello Email!");
        n.send();

        n = new SMSNotification("test", "Hello SMS!");
        n.send();
    }
}