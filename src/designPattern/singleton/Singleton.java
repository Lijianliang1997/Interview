package designPattern.singleton;

/**
 * Created by qq940 on 2018/5/26.
 */
public class Singleton {
    private volatile static Singleton instance;
    private Singleton(){}

    public static Singleton getInstance () {
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
