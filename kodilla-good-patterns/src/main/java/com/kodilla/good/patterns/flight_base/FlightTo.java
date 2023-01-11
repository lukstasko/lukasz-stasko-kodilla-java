package com.kodilla.good.patterns.flight_base;

import java.util.List;
import java.util.Set;

public interface FlightTo {
    List<Flight> findFlightTo(FlightBase flightBase, String destinationAirport);
}
