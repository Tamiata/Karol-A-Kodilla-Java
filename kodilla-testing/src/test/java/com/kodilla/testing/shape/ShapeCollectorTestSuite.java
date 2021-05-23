package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;
    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for shapes")

        class TestForShapes {

            @Test
            void testSquareName() {
                //Given
                Shape shape = new Square(5);
                //When
                String expectedResult = "Square";

                //Then
                Assertions.assertEquals(expectedResult, shape.getShapeName());
            }

            @Test
            void testSquareField() {
                //Given
                Shape shape = new Square(5);
                //When
                double expectedResult = 25;
                //Then
                Assertions.assertEquals(expectedResult, shape.getField());
            }

            @Test
            void testCircleName() {
                //Given
                Shape shape = new Circle(3);
                //When
                String expectedResult = "Circle";
                //Then
                Assertions.assertEquals(expectedResult, shape.getShapeName());
            }

            @Test
            void testCircleField() {
                //Given
                Shape shape = new Circle(3);
                //When
                double expectedResult = Math.PI * 3 * 3;
                //Then
                Assertions.assertEquals(expectedResult, shape.getField());
            }

            @Test
            void testTriangleleName() {
                //Given
                Shape shape = new Triangle(3, 4);
                //When
                String expectedResult = "Triangle";
                //Then
                Assertions.assertEquals(expectedResult, shape.getShapeName());
            }

            @Test
            void testTriangleField() {
                //Given
                Shape shape = new Triangle(3, 4);
                //When
                double expectedResult = (3 * 4) / 2;
                //Then
                Assertions.assertEquals(expectedResult, shape.getField());
            }


        }
        @Nested
        @DisplayName("Test for shape collection")

        class TestsForShapeCollection {

            @Test
            void TestAddFigure() {
                Circle circle = new Circle(5);
                ShapeCollector shapeCollector = new ShapeCollector();
                shapeCollector.addFigure(circle);
            }
        }
    }
