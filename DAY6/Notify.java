package DAY6;
class Notification{
    void send(){
        System.out.println("Sending Notification from parent class");
    }
}

class EmailNotification extends Notification{
    void send(){
        System.out.println("Sending Email Notification");
    }
    void ChangeReceiver(){
        System.out.println("Changing Receiver");
    }
}
class SMSNotification extends Notification{
    void send(){
        System.out.println("Sending SMS Notification");
    }
}
public class Notify {
    public static void main(String[] args){
        Notification n = new EmailNotification();
        n.send();
        // n.ChangeReceiver(); // This will cause a compile-time error because the reference type is Notification, which does not have the ChangeReceiver method.
        Notification nn;
        nn = new EmailNotification();
        nn.send();
        nn = new SMSNotification();
        nn.send();
        // In the above code, we are creating a reference of type Notification and assigning it to an object of type EmailNotification and SMSNotification. 
        // This is an example of polymorphism in Java, where a parent class reference can point to a child class object. 
        // However, we cannot call the ChangeReceiver method using the Notification reference because it is not defined in the Notification class. 
        // To call the ChangeReceiver method, we would need to cast the reference to EmailNotification like this: ((EmailNotification) n).ChangeReceiver();

    }
}
