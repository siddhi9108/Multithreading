package javaapplication2;

class com implements Runnable {

    Thread t;

    com(String n) {
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

public class isAlive_Method {

    public static void main(String[] args) throws Exception {

        com t1 = new com("A");
        com t2 = new com("B");
        com t3 = new com("C");
        int i;
        System.out.println("Child thread A is Alive" + t1.t.isAlive());
        System.out.println("Child thread B is alive" + t2.t.isAlive());
        System.out.println("Child thread C is alive" + t3.t.isAlive());
        try {
            t1.t.join();
            t2.t.join();
            t3.t.join();

        } catch (Exception e) {

        }
        System.out.println("Child thread A is alive" + t1.t.isAlive());
        System.out.println("Child thread B is alive" + t2.t.isAlive());
        System.out.println("Child thread C is alive" + t3.t.isAlive());
    }
}
