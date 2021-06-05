package world;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){

        //Given
        Country PL = new Country("Poland","38000000");
        Country DE = new Country("Germany", "83000000");
        Country FR = new Country("France", "67000000");
        Continent europe = new Continent();
        europe.addCountry(PL);
        europe.addCountry(DE);
        europe.addCountry(FR);

        Country CN = new Country("China","1398000000");
        Country JPN = new Country("Japan", "126000000");
        Country IR = new Country("Iran","81000000" );
        Continent asia = new Continent();
        asia.addCountry(CN);
        asia.addCountry(JPN);
        asia.addCountry(IR);

        Country USA = new Country("USA", "328000000");
        Country CA = new Country("Canada","38000000");
        Country MX = new Country("Mexico","126000000");
        Continent northAmerica = new Continent();
        northAmerica.addCountry(USA);
        northAmerica.addCountry(CA);
        northAmerica.addCountry(MX);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(northAmerica);

        //When
        BigDecimal worldPopulation = world.getPeopleQuantity();
        BigDecimal expectedWorldPopulation = new BigDecimal("2285000000");

        //Then
        assertEquals(expectedWorldPopulation, worldPopulation);

    }
}

