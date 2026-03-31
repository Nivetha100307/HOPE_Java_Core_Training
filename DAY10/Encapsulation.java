package DAY10;

class BankAccount {
    private double balance;

    public void setBalance(double balance) { // setterss
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }
    public double getBalance() { // getters
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setBalance(1000);
        System.out.println(b.getBalance());
        b.withdraw(200);
        b.deposit(500);
        System.out.println(b.getBalance());
    }
}
