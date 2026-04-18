package DAY20;

class SampleThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread running using Thread class");
    }
}
class SampleThread2 implements Runnable{
    @Override
    public void run(){//3.RUNNING state
        try{
            System.out.println("Thread running using Runnable");
            Thread.sleep(4000);//4.BLOCKED/WAITING state
            System.out.println("After 4 seconds");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
public class ThreadEx {
    public static void main(String[] args){
        SampleThread t=new SampleThread();
        t.start();
        //Thread t2=new Thread(new SampleThread2());
        SampleThread2 s=new SampleThread2();
        Thread t2=new Thread(s);//1.NEW state
        t2.start();
    }
}