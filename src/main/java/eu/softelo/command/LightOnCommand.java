package eu.softelo.command;

/**
 * Created by: Damian
 * Date      : 2014-10-01
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light =light;
    }

    @Override
    public void execute() {
        light.switchOn();
    }
}
