package com.kodilla.good.patterns.flight_base;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightFromService implements FlightFrom{

    @Override
    public List<Flight> findFlightFrom(FlightBase flightBase, String departureAirport) {

        return flightBase.getFlightBase().stream()
                .filter(f->f.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());
    }


}

