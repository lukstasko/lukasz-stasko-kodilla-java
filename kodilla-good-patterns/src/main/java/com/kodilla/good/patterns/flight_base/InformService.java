package com.kodilla.good.patterns.flight_base;

import java.util.List;

public class InformService implements Information{
    @Override
    public void inform(List<Flight> flightBase) {
        System.out.println("Search results:");
        int no=1;
        for( Flight flight: flightBase){
            System.out.println(no +". Flight from "+flight.getDepartureAirport()+" to "+flight.getArrivalAirport());
            no+=1;
        }
        System.out.println("End of results.");
    }
}
