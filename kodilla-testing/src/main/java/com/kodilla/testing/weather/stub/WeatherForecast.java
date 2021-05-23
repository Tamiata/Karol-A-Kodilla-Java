package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateAverageTemperature(){

        double sum = 0;
        int i = 0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            sum = sum + temperature.getValue();
            i++;
        }
        return sum / i;
    }

    public double calculateMedianTemperature() {

        List<Double> temperaturesList = new LinkedList<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            temperaturesList.add(temperature.getValue());
        }
        Collections.sort(temperaturesList);;
        if (temperaturesList.size() % 2 != 0 ) {
            double medianTemperature = temperaturesList.get(temperaturesList.size()/2);
            return medianTemperature;
        } else {
            double medianTemperature = (temperaturesList.get(temperaturesList.size()/2) + temperaturesList.get((temperaturesList.size()/2)-1)) / 2;
            return medianTemperature;
        }
    }
}