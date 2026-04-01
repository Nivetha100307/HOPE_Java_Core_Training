package DAY11;

public class CompileTimeException {
    public static void main(String[] args) {
        Thread T = new Thread(() -> {
            try {
                System.out.println("thread sleep");
                Thread.sleep(2000);
                System.out.println("thread awake");
            } catch (InterruptedException e) {
                System.out.println("sleep interrupted");
            }
        });
        T.start();
        T.interrupt();
        try{
            Thread.sleep(4000);
        } catch(Exception e){
            System.out.println("Not T");
        }
    }
}
