package designPattern.commandPattern;

/**
 * Created by qq940 on 2018/3/7.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl () {

    }

    public void setCommand (Command command) {
        this.slot = command;
    }

    public void buttonWasPressed () {
        slot.execute();
    }
}
