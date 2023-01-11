package com.kodilla.good.patterns.flight_base;

public class SampleFlightBase {

    public FlightBase retriever() {
        FlightBase flightBase=new FlightBase();
        flightBase.addFlightToBase (new Flight( "Cracow","Warsaw"));
        flightBase.addFlightToBase(new Flight("Cracow","London"));
        flightBase.addFlightToBase(new Flight("Warsaw", "London"));
        flightBase.addFlightToBase(new Flight("Cracow","Berlin"));
        flightBase.addFlightToBase(new Flight("Cracow","Paris"));
        flightBase.addFlightToBase(new Flight("Paris","New York"));
        flightBase.addFlightToBase(new Flight("Warsaw","Cracow"));
        flightBase.addFlightToBase(new Flight("Cracow","Berlin"));
    return flightBase;
    }
}
