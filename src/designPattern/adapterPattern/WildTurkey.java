package designPattern.adapterPattern;

/**
 * Created by qq940 on 2018/3/7.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobble!");
    }
}
