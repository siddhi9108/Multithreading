package javaapplication2;

class Share {

    void show(String msg) {
        try {
            System.out.println("[" + msg);
            Thread.sleep(500);
            System.out.println("]");
        } catch (Exception e) {

        }
    }
}

class asm implements Runnable {

    Thread t;
    String str;
    Share ob;

    asm(String n, Share ob) {
        str = n;
        ob = ob;
        t = newThread(this);
        t.start();
    }

    @Override
    public void run() {
        ob.print(str);
    }
}

public class Without_Synchronization {

    public static void main(String[] args) throws Exception {
        Share ob = new Share();
        asm t1 = new asm("A", ob);
        asm t2 = new asm("B", ob);
        asm t3 = new asm("C", ob);
        try {
            t1.t.join();
            t2.t.join();
            t3.t.join();

        } catch (Exception e) {

        }
    }
}
