package eu.softelo.facade;

import java.util.Date;

/**
 * Created by: Damian
 * Date      : 2014-10-01
 */
public class Client {

    public static void main(String[] args) {
        TravelFacade facade = new TravelFacade();

        HotelsFlightsVO hotelsFlights = facade.retrieveFlightsAndHotels(new Date(), new Date());
    }
}
