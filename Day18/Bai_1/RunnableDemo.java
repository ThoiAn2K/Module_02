import java.io.IOException;

public class RunnableDemo implements Runnable {
    private Thread t;
    private final String threadName;

    public RunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }
    public void run(){
        System.out.println("Running " + threadName);

        try{
                for (int i = 4; i >0; i--){
            System.out.println("theard: " + threadName + "," + i );
            Thread.sleep(50);
        }
                 } catch (InterruptedException e){
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }
    public void starts(){
        System.out.println("Startting " + threadName );
        if (t==null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
    public static void main(String[] args) {
        System.out.println("Main thread running... ");

        RunnableDemo runnableDemo1 = new RunnableDemo("Thread-1-HR-Database");
        runnableDemo1.starts();

        RunnableDemo runnableDemo2 = new RunnableDemo("Thread-2-Send-Email");
        runnableDemo2.starts();

        System.out.println("Main thread stopped!!! ");
    }
}




