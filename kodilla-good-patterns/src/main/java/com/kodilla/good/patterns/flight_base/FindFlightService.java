package com.kodilla.good.patterns.flight_base;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindFlightService implements  FlightService{
    private FlightBase flightBase;
    private FlightFrom flightFrom;
    private FlightTo flightTo;
    private FlightFromTo flightFromTo;
    private Information information;

    public FindFlightService(final FlightBase flightBase,
                             final FlightFrom flightFrom,
                             final FlightTo flightTo,
                             final FlightFromTo flightFromTo,
                             final Information information) {
        this.flightBase = flightBase;
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
        this.flightFromTo = flightFromTo;
        this.information = information;
    }

    @Override
    public void findFlightTo(String destinationAirport) {
        information.inform(flightTo.findFlightTo( flightBase,destinationAirport));
    }

    @Override
    public void findFlightFrom(String departureAirport) {
        information.inform(flightFrom.findFlightFrom(flightBase,departureAirport));
    }

    @Override
    public void findFlightFromTo(String departureAirport, String destinationAirport) {
        information.inform(flightFromTo.findFlightFromTo(flightFrom.findFlightFrom(flightBase,departureAirport),flightTo.findFlightTo( flightBase,destinationAirport)));
    }

}

