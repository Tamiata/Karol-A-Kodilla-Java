package test;

import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ExceptionHandligTestSuite {

    @Test
    void testExceptionHandlingWithTwo(){

        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertAll(
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5,0)),
                () -> assertThrows(ExceptionHandling.class, ()-> secondChallenge.probablyIWillThrowException(0.5,1.5)),
                () -> assertThrows(ExceptionHandling.class, ()-> secondChallenge.probablyIWillThrowException(2,1.5)),
                () -> assertThrows(ExceptionHandling.class, ()-> secondChallenge.probablyIWillThrowException(3,1.5)),

                () -> assertThrows(ExceptionHandling.class, ()->secondChallenge.probablyIWillThrowException(0.5,0)),
                () -> assertThrows(ExceptionHandling.class, ()->secondChallenge.probablyIWillThrowException(2,0)),
                () -> assertThrows(ExceptionHandling.class, ()->secondChallenge.probablyIWillThrowException(3,0))
        );
    }
}
