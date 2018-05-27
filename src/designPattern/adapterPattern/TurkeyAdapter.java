package designPattern.adapterPattern;

/**
 * Created by qq940 on 2018/3/7.
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;
    public TurkeyAdapter (Turkey turkey) {
        this.turkey = turkey;
    }
    @Override
    public void quack() {
        turkey.gobble();
    }
}
