package eu.softelo.observer;

/**
 * Created by: Damian
 * Date      : 2014-09-29
 */
public class DataScreen {
    public static void main(String[] args) {
        Screen screen = new Screen();
        DataStore dataStore = new DataStore();
        dataStore.addObserver(screen);

        dataStore.changeData("new Data");
    }
}
