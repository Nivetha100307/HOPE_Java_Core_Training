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
    @Override
    void send() {
        System.out.println("Sending Email to: " + name);
        System.out.println("Message: " + message);
    }
}

class SMSNotification extends Notification {

    SMSNotification(String name, String message) {
        super(name, message);
    }
    @Override
    void send() {
        System.out.println("Sending SMS to: " + name);
        System.out.println("Message: " + message);
    }
}

public class Notify1 {
    public static void main(String[] args) {

        Notification n1 = new EmailNotification("test", "Hello Email!");
        Notification n2;
        n2 = new SMSNotification("test", "Hello SMS!");
        Notification notify[] = {n1, n2};
        for (Notification n : notify) {
            n.send();
        }
    }
}