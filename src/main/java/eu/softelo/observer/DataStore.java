package eu.softelo.observer;

import java.util.Observable;

/**
 * Created by: Damian
 * Date      : 2014-09-29
 */
public class DataStore extends Observable {
    private String data;

    public String getData() {
        return data;
    }

    public void changeData(String data) {
        this.data = data;
        setChanged();
        notifyObservers();
    }
}
