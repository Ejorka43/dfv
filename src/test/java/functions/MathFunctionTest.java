package functions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathFunctionTest {
    @Test
    public void testAndThenSimple() {
        MathFunction f = new SqrFunction();
        MathFunction g = new IdentityFunction();
        MathFunction composite = f.andThen(g);
        double x = 2.0;
        double result = composite.apply(x);
        assertEquals(4.0, result);
    }

    @Test
    public void testAndThenComposite() {
        MathFunction f = new SqrFunction();
        MathFunction g = new CompositeFunction(new IdentityFunction(), new SqrFunction());
        MathFunction composite = f.andThen(g);
        double x = 2.0;
        double result = composite.apply(x);
        assertEquals(16.0, result);
    }

    @Test
    public void testAndThenChain() {
        MathFunction f = new SqrFunction();
        MathFunction g = new IdentityFunction();
        MathFunction h = new SqrFunction();
        MathFunction composite = f.andThen(g).andThen(h);
        double x = 2.0;
        double result = composite.apply(x);
        assertEquals(16.0, result);
    }
}