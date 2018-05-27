package designPattern.commandPattern;

/**
 * Created by qq940 on 2018/3/7.
 */
public class RemoteLoader {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();
    }
}
