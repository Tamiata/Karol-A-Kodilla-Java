//package com.kodilla.testing.shape;
//
//import org.junit.jupiter.api.*;
//
//public class ShapeCollectorTestSuite {
//
//    private static int testCounter = 0;
//    @BeforeEach
//    public void beforeEveryTest() {
//        testCounter++;
//        System.out.println("Preparing to execute test #" + testCounter);
//    }
//
//    @Nested
//    @DisplayName("Tests for shapes")
//
//        class TestForShapes {
//
//            @Test
//            void testShapeName() {
//                //Given
//                Shape shape = new Square(5);
//                //When
//                String expectedResult = "Square";
//                //Then
//                Assertions.assertEquals(expectedResult, shape.getShapeName());
//            }
//
//            @Test
//            void testShapeField() {
//                //Given
//                Shape shape = new Square(5);
//                //When
//                double expectedResult = 25;
//                //Then
//                Assertions.assertEquals(expectedResult, shape.getField());
//            }
//        }
//        @Nested
//        @DisplayName("Test for shape collection")
//
//        class TestsForShapeCollection {
//
//            @Test
//            void TestAddFigure() {
//                Circle circle = new Circle(5);
//                ShapeCollector sC = new ShapeCollector();
//                sC.addFigure(circle);
//                Assertions.assertEquals(1,sC.getShapesQuantity());
//            }
//            @Test
//            void TestGetFigure() {
//                Triangle triangle = new Triangle(3,5);
//                ShapeCollector sC = new ShapeCollector();
//                sC.addFigure(triangle);
//                sC.getFigure(0);
//           //     boolean result = sC.getFigure(0) instanceof Shape;
//           //     Assertions.assertEquals(true,result);
//            }
//
//            @Test
//            void TestRemoveFigure() {
//                Circle circle = new Circle(5);
//                ShapeCollector sC = new ShapeCollector();
//                sC.addFigure(circle);
//                sC.removeFigure(circle);
//                Assertions.assertEquals(0,sC.getShapesQuantity());
//            }
//
//            @Test
//            void TestShowFigures() {
//                Square square = new Square(5);
//                ShapeCollector sC = new ShapeCollector();
//                sC.addFigure(square);
//             //   Assertions.assertEquals("Square", sC.showFigures());
//
//            }
//
//        }
//    }
