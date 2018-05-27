package designPattern.commandPattern;

/**
 * Created by qq940 on 2018/3/7.
 */
public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand (Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
