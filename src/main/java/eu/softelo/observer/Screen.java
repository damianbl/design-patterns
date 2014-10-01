package eu.softelo.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by: Damian
 * Date      : 2014-09-29
 */
public class Screen implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Update : " + ((DataStore) o).getData());
    }
}
