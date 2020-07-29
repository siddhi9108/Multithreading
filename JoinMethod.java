package javaapplication2;

class Tes implements Runnable {

    Thread t;

    Tes(String n) {
        t = new Thread(this);

        t.start();
    }

    @Override
    public void run() {
        int i;
        try {
            for (i = 0; i < 5; i++) {
                System.out.println("Child Thread" + t.getName() + ":" + i);
                Thread.sleep(500);
            }
        } catch (Exception e) {

        }

    }
}

public class JoinMethod {

    public static void main(String[] args) throws Exception {

        Tes t1 = new Tes("A");
        Tes t2 = new Tes("B");
        Tes t3 = new Tes("C");
        int i;
        System.out.println("Before");
        try {
            t1.t.join();
            t2.t.join();
            t3.t.join();

        } catch (Exception e) {

        }
        System.out.println("After");
    }
}
