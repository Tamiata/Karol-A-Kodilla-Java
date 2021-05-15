package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator adding = new Calculator(5.5, 17.3);

        if (adding.add()==22.8) {
            System.out.println("Dodawanie poprawne");
        } else {
            System.out.println("Dodawanie nie działa");
        }

        Calculator subtracting = new Calculator(70.5, 20.3);

        if (subtracting.subtract()==50.2) {
            System.out.println("Odejmowanie poprawne");
        } else {
            System.out.println("Odejmowanie nie działa");
        }

    }
}