package functions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IterationFunctionTest {
    @Test
    public void testApply() {
        MathFunction g = new IdentityFunction();
        MathFunction IterationFunction = new IterationFunction(g);
        double x = 5.0;
        double result = IterationFunction.apply(x);
        assertEquals(x, result);
    }
}