package designPattern.adapterPattern;

/**
 * Created by qq940 on 2018/3/7.
 */
public class DuckTestDriver {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        duck.quack();
    }
}
