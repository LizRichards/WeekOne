package dayfour;

/**
 *
 * @author Liz Richards
 */
public class Deadlock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RandomObject oOne = new RandomObject("happy", 4);
        RandomObject oTwo = new RandomObject("ambivilous", 7);
        System.out.println("Creating Threads.");
        Runnable thread1 = new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (oOne) {
                        Thread.sleep(100);
                        synchronized (oTwo) {
                            System.out.println("Thread One has both objects!");
                        }

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        };
        Runnable thread2 = new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (oTwo) {
                        Thread.sleep(100);
                        synchronized (oOne) {
                            System.out.println("Thread Two has both objects!");
                        }

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        };
        System.out.println("Starting Threads");
        new Thread(thread1).start();
        new Thread(thread2).start();
        System.out.println("Deadlocked");
    }

}
