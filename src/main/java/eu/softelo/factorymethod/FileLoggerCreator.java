package eu.softelo.factorymethod;

/**
 * Created by: Damian
 * Date      : 2014-09-30
 */
public class FileLoggerCreator extends AbstractLoggerCreator {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
