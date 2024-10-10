package functions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrFunctionTest {
    @Test
    void applyTest() {
        SqrFunction sqrfunc = new SqrFunction();
        assertEquals( 0, sqrfunc.apply(0));
        assertEquals(4, sqrfunc.apply(-2));
        assertEquals(4, sqrfunc.apply(2));
        assertEquals(6.25, sqrfunc.apply(2.5));
    }
}

