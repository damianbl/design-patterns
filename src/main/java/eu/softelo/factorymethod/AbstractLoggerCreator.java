package eu.softelo.factorymethod;

/**
 * Created by: Damian
 * Date      : 2014-09-30
 */
public abstract class AbstractLoggerCreator {
    public abstract Logger createLogger();

    public Logger getLogger() {
        return createLogger();
    }
}
