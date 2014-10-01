package eu.softelo.facade;

import java.util.List;

/**
 * Created by: Damian
 * Date      : 2014-10-01
 */
public class HotelsFlightsVO {
    private List<Hotel> hotels;
    private List<Flight> flights;

    public HotelsFlightsVO(List<Hotel> hotels, List<Flight> flights) {
        this.hotels = hotels;
        this.flights = flights;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public List<Flight> getFlights() {
        return flights;
    }
}
