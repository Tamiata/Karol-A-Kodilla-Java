package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.math.BigInteger;

public final class Country {

    private final String country;
    private final String numberOfPoeople;


    public Country(final String country,final String numberOfPoeople) {
        this.country = country;
        this.numberOfPoeople = numberOfPoeople;
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal result = new BigDecimal(numberOfPoeople);
        return result;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country='" + country + '\'' +
                ", numberOfPoeople=" + numberOfPoeople +
                '}';
    }
}


//  Klasa Country ma udostępniać metodę getPeopleQuantity() zwracającą liczbę typu BigDecimal.