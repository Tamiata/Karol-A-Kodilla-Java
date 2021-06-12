package com.kodilla.exception.test;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class RouteNotFoundException {

    public boolean findFilght(Flight flight) {

        Map<String, Boolean> isAirportAccessible = new HashMap<>();
        isAirportAccessible.put("London", true);
        isAirportAccessible.put("New York", false);
        isAirportAccessible.put("Wienna", false);
        isAirportAccessible.put("Warsaw", true);

        if (isAirportAccessible.containsKey(flight.getArrivalAirport())) {
            return isAirportAccessible.get(flight.getArrivalAirport());
        } else {
            return false;
        }
    }
}
