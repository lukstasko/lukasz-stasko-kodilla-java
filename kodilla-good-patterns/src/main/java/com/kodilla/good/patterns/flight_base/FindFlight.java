package com.kodilla.good.patterns.flight_base;

public class FindFlight {
    public static void main(String[] args) {
        SampleFlightBase sampleFlightBase=new SampleFlightBase();

        FindFlightService findFlightService=new FindFlightService(sampleFlightBase.retriever(),
                new FlightFromService(),new FlightToService(),new FlightFromToService(),new InformService());

        findFlightService.findFlightFrom("Cracow");
        findFlightService.findFlightTo("Cracow");
        findFlightService.findFlightFromTo("Cracow","New York");

    }
}
