package eu.softelo.command;

/**
 * Created by: Damian
 * Date      : 2014-10-01
 */
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
}
