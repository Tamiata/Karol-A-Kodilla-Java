package com.kodilla.stream.beautifier;


public class PoemBeautifier {

    public void beautify(String abc, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(abc);
        System.out.println("Beautified expression is: " + result);
    }
}
