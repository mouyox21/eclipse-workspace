package threads2;


public class TwoThread extends Thread {
    public static void Wait(long milli) {
        System.out.println("pause de " + milli + " ms");
        try {
            Thread.sleep(milli);
        } catch (InterruptedException x) {
            
        }
    }

    public void run() {
        setName("New thread");
        for (int i = 0; i < 10; i++) {
            System.out.println(getName());
            Wait(200);
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        TwoThread tt = new TwoThread();
        tt.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread");
            Wait(200);
        }
    }
}
