package com.kodilla.good.patterns.flight_base;

public interface FlightService {
    void findFlightTo(String destinationAirport);
    void findFlightFrom(String departureAirport);
    void findFlightFromTo(String destinationAirport, String transferAirport);
}
