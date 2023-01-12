package com.kodilla.good.patterns.flight_base;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFromToService implements FlightFromTo {

    @Override
    public List<Flight> findFlightFromTo(List<Flight> departureFlight, List<Flight> arrivalAirport) {
        List<Flight> resultList=new ArrayList<>();
        for(Flight flight1:departureFlight) {
            for (Flight flight2 : arrivalAirport) {
                if (flight1.getArrivalAirport().equals(flight2.getDepartureAirport())) {
                    resultList.add(flight1);
                    resultList.add(flight2);
                }
            }
        }
        return resultList;
    }
}


