package com.kodilla.exception.test;

public class Main {

    public static void main(String[] Args) {

        Flight flight1 = new Flight("Dublin", "London");
        Flight flight2 = new Flight("Dublin", "New York");
        Flight flight3 = new Flight("Dublin", "Lisboa");
        FindFilght findFilght = new FindFilght();

        try {
            findFilght.findFilght(flight1);
        } catch (ProperRouteNotFoundExeption e) {
            System.out.println(e);
        }

        try {
            findFilght.findFilght(flight2);
        } catch (ProperRouteNotFoundExeption e) {
            System.out.println(e);
        }

        try {
            findFilght.findFilght(flight3);
        } catch (ProperRouteNotFoundExeption e) {
            System.out.println(e);
        }
    }
}