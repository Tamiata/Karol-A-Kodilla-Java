package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFilght {

    public void findFilght (Flight flight) throws ProperRouteNotFoundExeption {

        Map<String, Boolean> isAirportAccessible = new HashMap<>();
        isAirportAccessible.put("London", true);
        isAirportAccessible.put("New York", false);
        isAirportAccessible.put("Wienna", false);
        isAirportAccessible.put("Warsaw", true);

        if (isAirportAccessible.containsKey(flight.getArrivalAirport())) {
            if (isAirportAccessible.get(flight.getArrivalAirport())) {
                System.out.println(flight.getArrivalAirport() + " Airport is available");
            } else {
                System.out.println(flight.getArrivalAirport() + " Airport is not available");
            }
        } else {
            throw new ProperRouteNotFoundExeption("No such an airport");
        }


    }
}
