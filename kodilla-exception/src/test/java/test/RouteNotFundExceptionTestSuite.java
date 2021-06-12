package test;

import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.RouteNotFoundException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RouteNotFundExceptionTestSuite {

    @Test
    void isAccesibleTrueTest() {
        //Given
        Flight flight = new Flight("Dublin", "London");

        //When
        RouteNotFoundException rNFE = new RouteNotFoundException();
        boolean result = rNFE.findFilght(flight);

        //Then
        assertTrue(result);
    }

    @Test
    void isAccesibleNotTrueTest() {
        //Given
        Flight flight = new Flight("Warsaw", "New York");

        //When
        RouteNotFoundException rNFE = new RouteNotFoundException();
        boolean result = rNFE.findFilght(flight);

        //Then
        assertFalse(result);
    }
    @Test
    void isAccesibleNoAirportTest() {
        //Given
        Flight flight = new Flight("Warsaw", "Lisboa");

        //When
        RouteNotFoundException rNFE = new RouteNotFoundException();
        boolean result = rNFE.findFilght(flight);

        //Then
        assertFalse(result);
    }
}
