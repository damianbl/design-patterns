package eu.softelo.command;

/**
 * Created by: Damian
 * Date      : 2014-10-01
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOff();
    }
}
