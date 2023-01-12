package com.kodilla.good.patterns.flight_base;

import java.util.List;

public interface FlightFromTo {
    List<Flight> findFlightFromTo(List<Flight> departureFlight, List<Flight> arrivalAirport);
}
