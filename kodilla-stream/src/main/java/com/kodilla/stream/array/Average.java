package com.kodilla.stream.array;


import java.util.stream.IntStream;

public final class Average implements ArrayOperations{

    @Override
    public double getAverage(int[] numbers) {

        IntStream.range(0,numbers.length)
                .forEach(n -> System.out.println("Table[" + n + "] = " + numbers[n]));

        return IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average().getAsDouble();
    }


}



//  Metoda getAverage(int[] numbers) powinna:
//      przy pomocy strumienia IntStream oraz metody range(int startInclusive, int endExclusive)
//      wyświetlić kolejne elementy tablicy, a następnie:
//
//      przy pomocy drugiego strumienia IntStream oraz metody range(int startInclusive, int endExclusive),
//      a także kolektora average() obliczyć średnią. Na końcu metoda powinna zwracać średnią jako wynik typu double.