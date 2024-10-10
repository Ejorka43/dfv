package functions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class LinkedListTabulatedFunctionTest {
    @Test
    public void testConstructorWithArrays() {
        double[] xValues = {1, 2, 3};
        double[] yValues = {4, 5, 6};
        LinkedListTabulatedFunction function = new LinkedListTabulatedFunction(xValues, yValues);
        assertEquals(3, function.getCount());
        assertEquals(1, function.getX(0), 0.01);
        assertEquals(4, function.getY(0), 0.01);
    }

    @Test
    public void testConstructorWithFunction() {
        MathFunction source = x -> x * x;
        LinkedListTabulatedFunction function = new LinkedListTabulatedFunction(source, 0, 10, 11);
        assertEquals(11, function.getCount());
        assertEquals(0, function.getX(0), 0.01);
        assertEquals(100, function.getX(10), 0.01);
    }

    @Test
    public void testGetCount() {
        double[] xValues = {1, 2, 3};
        double[] yValues = {4, 5, 6};
        LinkedListTabulatedFunction function = new LinkedListTabulatedFunction(xValues, yValues);
        assertEquals(3, function.getCount());
    }

    @Test
    public void testGetX() {
        double[] xValues = {1, 2, 3};
        double[] yValues = {4, 5, 6};
        LinkedListTabulatedFunction function = new LinkedListTabulatedFunction(xValues, yValues);
        assertEquals(1, function.getX(0), 0.01);
        assertEquals(2, function.getX(1), 0.01);
        assertEquals(3, function.getX(2), 0.01);
    }

    @Test
    public void testGetY() {
        double[] xValues = {1, 2, 3};
        double[] yValues = {4, 5, 6};
        LinkedListTabulatedFunction function = new LinkedListTabulatedFunction(xValues, yValues);
        assertEquals(4, function.getY(0), 0.01);
        assertEquals(5, function.getY(1), 0.01);
        assertEquals(6, function.getY(2), 0.01);
    }

    @Test
    public void testLeftBound() {
        double[] xValues = {1, 2, 3};
        double[] yValues = {4, 5, 6};
        LinkedListTabulatedFunction function = new LinkedListTabulatedFunction(xValues, yValues);
        assertEquals(1, function.leftBound(), 0.01);
    }

    @Test
    public void testRightBound() {
        double[] xValues = {1, 2, 3};
        double[] yValues = {4, 5, 6};
        LinkedListTabulatedFunction function = new LinkedListTabulatedFunction(xValues, yValues);
        assertEquals(3, function.rightBound(), 0.01);
    }

    @Test
    public void testIndexOfX() {
        double[] xValues = {1, 2, 3};
        double[] yValues = {4, 5, 6};
        LinkedListTabulatedFunction function = new LinkedListTabulatedFunction(xValues, yValues);
        assertEquals(0, function.indexOfX(1));
        assertEquals(1, function.indexOfX(2));
        assertEquals(2, function.indexOfX(3));
        assertEquals(-1, function.indexOfX(4));
    }

    @Test
    public void testIndexOfY() {
        double[] xValues = {1, 2, 3};
        double[] yValues = {4, 5, 6};
        LinkedListTabulatedFunction function = new LinkedListTabulatedFunction(xValues, yValues);
        assertEquals(0, function.indexOfY(4));
        assertEquals(1, function.indexOfY(5));
        assertEquals(2, function.indexOfY(6));
        assertEquals(-1, function.indexOfY(7));
    }

    @Test
    public void testFloorIndexOfX() {
        double[] xValues = {1, 2, 3};
        double[] yValues = {4, 5, 6};
        LinkedListTabulatedFunction function = new LinkedListTabulatedFunction(xValues, yValues);
        assertEquals(0, function.floorIndexOfX(1));
        assertEquals(1, function.floorIndexOfX(1.5));
        assertEquals(2, function.floorIndexOfX(2.5));
        assertEquals(2, function.floorIndexOfX(3));
    }

    @Test
    public void testExtrapolateLeft() {
        double[] xValues = {1, 2, 3};
        double[] yValues = {4, 5, 6};
        LinkedListTabulatedFunction function = new LinkedListTabulatedFunction(xValues, yValues);
        assertEquals(4, function.extrapolateLeft(0), 0.01);
    }

    @Test
    public void testExtrapolateRight() {
        double[] xValues = {1, 2, 3};
        double[] yValues = {4, 5, 6};
        LinkedListTabulatedFunction function = new LinkedListTabulatedFunction(xValues, yValues);
        assertEquals(6, function.extrapolateRight(4), 0.01);
    }
}
