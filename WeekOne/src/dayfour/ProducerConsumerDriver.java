package dayfour;

/**
 *
 * @author Liz Richards
 */
public class ProducerConsumerDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProducerConsumer eat = new ProducerConsumer();
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                try {
                    eat.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable t2 = new Runnable() {
            @Override
            public void run() {
                try {
                    eat.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        new Thread(t1).start();
        new Thread(t2).start();
    }

}
