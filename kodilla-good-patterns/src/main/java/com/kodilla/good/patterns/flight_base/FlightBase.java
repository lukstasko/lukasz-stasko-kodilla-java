package com.kodilla.good.patterns.flight_base;

import java.util.HashSet;


public class FlightBase  {
    private final HashSet<Flight> flightBase=new HashSet<>();

    public void addFlightToBase(Flight flight){
        flightBase.add(flight);
    }

    public HashSet<Flight> getFlightBase() {
        return flightBase;
    }
}
