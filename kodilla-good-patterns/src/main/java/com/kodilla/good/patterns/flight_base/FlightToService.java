package com.kodilla.good.patterns.flight_base;


import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightToService implements FlightTo{
    @Override
    public List<Flight> findFlightTo(FlightBase flightBase, String destinationAirport) {

        return flightBase.getFlightBase().stream()
                .filter(f->f.getArrivalAirport().equals(destinationAirport))
                .collect(Collectors.toList());
    }
}
