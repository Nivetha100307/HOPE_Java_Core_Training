package DAY10;

class Locker {
    private int lockerid, lockerpin;
    private boolean islocked;
    private String[] items;

    public Locker(int lockerid, int lockerpin) {
        this.lockerid = lockerid;
        this.lockerpin = lockerpin;
        this.islocked = true; 
        this.items = new String[0]; 
    }

    public void storeItems(String[] items, int lockerpin) {
        if (lockerpin == this.lockerpin) {
            if (!islocked) {
                this.items = items;
            } else {
                System.out.println("Locker is locked!");
            }
        } else {
            System.out.println("Invalid locker pin");
        }
    }

    public void retrieveItems(int lockerpin) {
        if (lockerpin == this.lockerpin) {
            if (!islocked) {
                for (String item : items) {
                    System.out.println(item);
                }
            } else {
                System.out.println("Locker is locked!");
            }
        } else {
            System.out.println("Invalid locker pin");
        }
    }

    public void lock(int lockerpin) {
        if (lockerpin == this.lockerpin) {
            islocked = true;
            System.out.println("Locker locked");
        } else {
            System.out.println("Invalid locker pin");
        }
    }

    public void unlock(int lockerpin) {
        if (lockerpin == this.lockerpin) {
            islocked = false;
            System.out.println("Locker unlocked");
        } else {
            System.out.println("Invalid locker pin");
        }
    }

    public int getLockerid() {
        return lockerid;
    }

    public boolean getIslocked() {
        return islocked;
    }

    public String[] getItems() {
        return items;
    }
}

public class LockerSystem {
    public static void main(String[] args) {

        Locker locker = new Locker(101, 1234);

        locker.unlock(1234); 
        locker.storeItems(new String[]{"Book", "Laptop"}, 1234);

        locker.lock(124);   
        locker.unlock(1234);

        locker.retrieveItems(1234);
    }
}