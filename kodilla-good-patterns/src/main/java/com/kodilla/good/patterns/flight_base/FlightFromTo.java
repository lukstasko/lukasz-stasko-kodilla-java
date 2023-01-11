package com.kodilla.good.patterns.flight_base;

import java.util.List;

public interface FlightFromTo {
    List<Flight> findFlightFromTo(FlightBase flightBase, String departureAirport, String destinationAirport);
}
