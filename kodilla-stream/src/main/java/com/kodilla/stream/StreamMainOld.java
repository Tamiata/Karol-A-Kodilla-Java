package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMainOld {

    public static void main(String[] args) {

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Ala ma kota", abc -> abc.toUpperCase());
        poemBeautifier.beautify("Ala ma kota", abc -> "*** " + abc + " ***");
        poemBeautifier.beautify("Ala ma kota", abc -> abc.substring(0, 4).toUpperCase() + abc.substring(4,7).toLowerCase() + abc.substring(7,11).toUpperCase());
        poemBeautifier.beautify("Ala ma kota", abc -> abc.substring(7,11) + abc.substring(3,7) + abc.substring(0,4));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);


    }
}

//  public static void main(String[] args) {
//       BookDirectory theBookDirectory = new BookDirectory();
//
//       Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//              .filter(book -> book.getYearOfPublication() > 2005)
//              .collect(Collectors.toMap(Book::getSignature, book -> book));
//
//       System.out.println("# elements: " + theResultMapOfBooks.size());
//
//       theResultMapOfBooks.entrySet().stream()
//              .map(entry -> entry.getKey() + ": " + entry.getValue())
//              .forEach(System.out::println);
//  }
//}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//  public static void main(String[] args) {
//        BookDirectory theBookDirectory = new BookDirectory();
//
//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n","<<",">>"));
//
//        System.out.println(theResultStringOfBooks);
//  }
//}
