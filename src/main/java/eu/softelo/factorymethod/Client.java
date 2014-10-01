package eu.softelo.factorymethod;

/**
 * Created by: Damian
 * Date      : 2014-09-30
 */
public class Client {

    public static void main(String[] args) {
        AbstractLoggerCreator creator1 = new XMLLoggerCreator();
        AbstractLoggerCreator creator2 = new FileLoggerCreator();

        Client client = new Client();
        client.someMethodThatLogs(creator1);
        client.someMethodThatLogs(creator2);
    }

    public void someMethodThatLogs(AbstractLoggerCreator loggerCreator) {
        Logger logger = loggerCreator.createLogger();
        logger.log("message");
    }
}
