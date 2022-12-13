package com.kodilla.testing.shape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {


        private static int testCounter = 0;

        @BeforeAll
        public static void beforeAllTests() {
            System.out.println("This is the beginning of tests.");
        }

        @AfterAll
        public static void afterAllTests() {
            System.out.println("All tests are finished.");
        }

        @BeforeEach
        public void beforeEveryTest() {
            testCounter++;
            System.out.println("Preparing to execute test #" + testCounter);
        }
    @Nested
    @DisplayName("Test  for Shape Collector")
    class TestShapeCollectorMethod {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle();

            //When
            shapeCollector.addFigure(circle);

            //Then
            assertEquals(circle, shapeCollector.getFigure(0));
        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle();
            shapeCollector.addFigure(circle);

            //When
            boolean result = shapeCollector.removeFigure(circle);

            //Then
            assertTrue(result);
        }

        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle();
            shapeCollector.addFigure(circle);

            //When
            Shape retrievedshape;
            retrievedshape = shapeCollector.getFigure(0);

            //Then
            assertEquals(circle, retrievedshape);
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle();
            shapeCollector.addFigure(circle);

            //When
            String result = shapeCollector.showFigure();

            //Then
            assertNotNull(result);
            assertEquals(circle.getShapeNames(), result);
        }
    }
}


