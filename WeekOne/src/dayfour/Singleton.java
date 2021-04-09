package dayfour;

/**
 *
 * @author Liz Richards
 */
public class Singleton {

    private static volatile Singleton instance;

    /**
     *
     * @return the one instance of Singleton
     */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
