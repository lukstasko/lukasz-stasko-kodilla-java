package com.kodilla.good.patterns.flight_base;

import java.util.List;


public interface FlightFrom {
    List<Flight> findFlightFrom(FlightBase flightBase, String departureAirport);
}
