import java.security.PublicKey;

public class Test {
    public static void main(String[] args) {
        Table obj = new Table();

//        MyThread1 t1 = new MyThread1(obj);
//
//        MyThread2 t2 = new MyThread2(obj);
//        t1.start();
//        t2.start();

        Thread test1 = new Thread() {
            public void run() {
                obj.printTable(5);
            }
        };

        Thread test23 = new Thread(){
            public void  run(){
                obj.printTable(100);
            }
        };

        test1.start();
        test23.start();

    }
}
