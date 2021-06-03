package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> world = new ArrayList<>();

    public void addContinent(Continent continent){
        world.add(continent);
    }

    @Override
    public String toString() {
        return "World{" +
                "world=" + world +
                '}';
    }

    public BigDecimal getPeopleQuantity() {
        return world.stream()
                .flatMap(continent -> continent.getCountires().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

}



//  Klasa World powinna zawierać kolekcję kontynentów.
//  W klasie World napisz metodę getPeopleQuantity() zwracającą liczbę typu BigDecimal,
//  która używając flatMap() oraz reduce() obliczy sumę ludności wszystkich krajów na wszystkich kontynentach.