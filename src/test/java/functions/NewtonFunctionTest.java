package functions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewtonFunctionTest {
    @Test
    public void testApply() {
        MathFunction f = new SqrFunction();
        MathFunction fDerivative = new IdentityFunction();
        MathFunction newtonFunction = new NewtonFunction(f, fDerivative);
        double x = 5.0;
        double result = newtonFunction.apply(x);
        assertEquals(0.0, result);
    }
}