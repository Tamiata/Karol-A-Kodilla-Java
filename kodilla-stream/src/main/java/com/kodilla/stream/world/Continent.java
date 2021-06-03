package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final List<Country> continent = new ArrayList<>();

    public void addCountry(Country country){
        continent.add(country);
    }

    public List<Country> getCountires () {
        return continent;

    }

    @Override
    public String toString() {
        return "Continent{" +
                "continent=" + continent +
                '}';
    }
}


//  Klasa Continent powinna zawierać kolekcję krajów leżących na tym kontynencie.
