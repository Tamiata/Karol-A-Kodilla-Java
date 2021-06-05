package array;


import com.kodilla.stream.array.Average;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given

        int[] table = new int[20];

        table[0] = 12;
        table[1] = 31;
        table[2] = 50;
        table[3] = 49;
        table[4] = 57;
        table[5] = 11;
        table[6] = 99;
        table[7] = 45;
        table[8] = 35;
        table[9] = 32;
        table[10] = 1;
        table[11] = 44;
        table[12] = 10;
        table[13] = 13;
        table[14] = 65;
        table[15] = 21;
        table[16] = 29;
        table[17] = 3;
        table[18] = 70;
        table[19] = 99;

        //When
        double average = new Average().getAverage(table);

        //Then
        System.out.println("Expected value: 38.8");
        System.out.println("Actual value: " + average);
        assertEquals(38.8, average,0.01);


    }
}

//  Test powinien przygotować tablicę z przykładowymi wartościami typu int
//  i wywołać metodę getAverage(int[] numbers) interfejsu ArrayOperations.