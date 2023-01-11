package com.kodilla.good.patterns.flight_base;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface FlightFrom {
    List<Flight> findFlightFrom(FlightBase flightBase, String departureAirport);
}
