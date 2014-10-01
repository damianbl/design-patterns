package eu.softelo.singleton;

/**
 * Created by: Damian
 * Date      : 2014-09-30
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton instance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }

        return instance;
    }
}
