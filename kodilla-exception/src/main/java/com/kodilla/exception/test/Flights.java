package com.kodilla.exception.test;

import java.util.HashMap;

public class Flights {

    public void findFlight(Flight flight) throws RouteNotFoundException{
        HashMap<String,Boolean> flightsMap=new HashMap<>();
        flightsMap.put("Paris", true);
        flightsMap.put("London", true);
        flightsMap.put ("Berlin",false);

        if (flightsMap.containsKey(flight.getDepartureAirport()) && flightsMap.containsKey(flight.getArrivalAirport())) {
            if (flightsMap.get(flight.getArrivalAirport())) {
                System.out.println("Flight found.");
            }else{
                System.out.println("Can't land in "+ flight.getArrivalAirport()+"." );
            }
           }else{
            throw new RouteNotFoundException();
        }
    }

    public static void main(String[] args) {
        Flight flight=new Flight("Tokio","Paris");
        Flights flights=new Flights();

     try {
         flights.findFlight(flight);
     }catch(RouteNotFoundException e){
         System.out.println("Flight from "+flight.getDepartureAirport()+" to "+flight.getArrivalAirport()+" not found" );
     }

    }
}
