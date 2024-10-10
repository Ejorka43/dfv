package functions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompositeFunctionTest {

    @Test
    void applyTest_simpleFunctions() { //две простые
        MathFunction firstFunction = new IdentityFunction(); // отображение в себя
        MathFunction secondFunction = new SqrFunction(); // возведение в квадрат
        CompositeFunction compositeFunction = new CompositeFunction(firstFunction, secondFunction); // итого: x->x^2

        assertEquals(0, compositeFunction.apply(0));
        assertEquals(1, compositeFunction.apply(1));
        assertEquals(4, compositeFunction.apply(2));
    }
    @Test
    void applyTest_compositeFunctions() { //композиция двух сложных
        MathFunction firstFunction = new CompositeFunction(new SqrFunction(), new IdentityFunction()); // x->x^2
        MathFunction secondFunction = new CompositeFunction(new IdentityFunction(), new SqrFunction()); // x^2->x^2
        CompositeFunction compositeFunction = new CompositeFunction(firstFunction, secondFunction);

        assertEquals(16, compositeFunction.apply(2));
        assertEquals(50625, compositeFunction.apply(15));
        assertEquals(81, compositeFunction.apply(-3));
    }
    @Test
    void applyTest_sameFunction() { // одна и та же ф-ия
        MathFunction firstFunction = new SqrFunction();
        CompositeFunction compositeFunction = new CompositeFunction(firstFunction, firstFunction); // x^2->(x^2)^2

        assertEquals(0, compositeFunction.apply(0));
        assertEquals(1, compositeFunction.apply(1));
        assertEquals(16, compositeFunction.apply(2));
    }
}