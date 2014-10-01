package eu.softelo.facade;

import java.util.Collections;
import java.util.Date;

/**
 * Created by: Damian
 * Date      : 2014-10-01
 */
public class TravelFacade {
    private HotelBroker hotelBroker;
    private FlightBroker flightBroker;

    public TravelFacade() {
    }

    public TravelFacade(HotelBroker hotelBroker, FlightBroker flightBroker) {
        this.hotelBroker = hotelBroker;
        this.flightBroker = flightBroker;
    }

    public HotelsFlightsVO retrieveFlightsAndHotels(Date from, Date to) {
        return new HotelsFlightsVO(hotelBroker.getHotelNamesFor(from, to), flightBroker.getFlightsFor(from, to));
    }
}
