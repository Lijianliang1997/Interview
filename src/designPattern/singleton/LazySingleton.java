package designPattern.singleton;

/**
 * Created by qq940 on 2018/5/22.
 */
public class LazySingleton {
    private static LazySingleton singleton = null;
    private LazySingleton(){};
    public static LazySingleton get (){
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }

    public static LazySingleton doubleCheck () {
        if (singleton == null ){
            synchronized (LazySingleton.class) {
                if (singleton == null) {
                    singleton = new LazySingleton();
                }
            }
        }
        return singleton;
    }
}
