package eu.softelo.factorymethod;

/**
 * Created by: Damian
 * Date      : 2014-09-30
 */
public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("logging message: '" + message + "' to a file...");
    }
}
