package functions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstantFunctionTest {
    @Test
    void applyTest_constantFunction() {
        ConstantFunction constantFunction = new ConstantFunction(5);
        assertEquals(5, constantFunction.apply(0));
        assertEquals(5, constantFunction.apply(564343));
        assertEquals(5, constantFunction.apply(-1347));
    }

    @Test
    void getConstantTest() {
        ConstantFunction constantFunction = new ConstantFunction(5);
        assertEquals(5, constantFunction.getConstant());
    }
}