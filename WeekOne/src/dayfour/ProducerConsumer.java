package dayfour;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Liz Richards
 */
public class ProducerConsumer {

    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 4;

    // Function called by producer thread
    public void produce() throws InterruptedException {
        int value = 0;
        Random gen = new Random();
        while (true) {
            synchronized (this) {
                while (list.size() == capacity) {
                    wait();
                }

                System.out.println("Producer produced the value: "
                        + value);
                list.add(value);
                value = gen.nextInt(100) + 1;
                notify();
                Thread.sleep(1000);
            }
        }
    }

    // Function called by consumer thread
    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (list.size() == 0) {
                    wait();
                }
                int val = list.removeFirst();

                System.out.println("Consumer consumed the value: "
                        + val);
                notify();
                Thread.sleep(1000);
            }
        }
    }
}
