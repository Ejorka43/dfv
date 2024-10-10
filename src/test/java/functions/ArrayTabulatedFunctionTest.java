package functions;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ArrayTabulatedFunctionTest {

    @Test
    public void testGetX() {
        double[] xValues = {1, 2, 3, 4, 5};
        double[] yValues = {10, 20, 30, 40, 50};
        ArrayTabulatedFunction function = new ArrayTabulatedFunction(xValues, yValues);

        for (int i = 0; i < xValues.length; i++) {
            assertEquals(xValues[i], function.getX(i), 1e-9);
        }
    }

    @Test
    public void testGetY() {
        double[] xValues = {1, 2, 3, 4, 5};
        double[] yValues = {10, 20, 30, 40, 50};
        ArrayTabulatedFunction function = new ArrayTabulatedFunction(xValues, yValues);

        for (int i = 0; i < yValues.length; i++) {
            assertEquals(yValues[i], function.getY(i), 1e-9);
        }
    }

    @Test
    public void testSetY() {
        double[] xValues = {1, 2, 3, 4, 5};
        double[] yValues = {10, 20, 30, 40, 50};
        ArrayTabulatedFunction function = new ArrayTabulatedFunction(xValues, yValues);

        function.setY(2, 35);
        assertEquals(35, function.getY(2), 1e-9);
    }

    @Test
    public void testApply() {
        double[] xValues = {1, 2, 3, 4, 5};
        double[] yValues = {10, 20, 30, 40, 50};
        ArrayTabulatedFunction function = new ArrayTabulatedFunction(xValues, yValues);

        assertEquals(10, function.apply(1), 1e-9);
        assertEquals(20, function.apply(2), 1e-9);
        assertEquals(30, function.apply(3), 1e-9);
        assertEquals(40, function.apply(4), 1e-9);
        assertEquals(50, function.apply(5), 1e-9);

        assertEquals(25, function.apply(2.5), 1e-9);
        assertEquals(35, function.apply(3.5), 1e-9);
    }

    @Test
    public void testFloorIndexOfX() {
        double[] xValues = {1, 2, 3, 4, 5};
        double[] yValues = {10, 20, 30, 40, 50};
        ArrayTabulatedFunction function = new ArrayTabulatedFunction(xValues, yValues);

        assertEquals(0, function.floorIndexOfX(1));
        assertEquals(1, function.floorIndexOfX(2));
        assertEquals(2, function.floorIndexOfX(3));
        assertEquals(3, function.floorIndexOfX(4));
        assertEquals(4, function.floorIndexOfX(5));

        assertEquals(1, function.floorIndexOfX(2.5));
        assertEquals(2, function.floorIndexOfX(3.5));
    }
}