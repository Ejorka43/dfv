package functions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZeroFunctionTest {
    @Test
    void applyTest() {
        ZeroFunction zeroFunction = new ZeroFunction();
        assertEquals(0, zeroFunction.apply(0));
        assertEquals(0, zeroFunction.apply(14326));
        assertEquals(0, zeroFunction.apply(-1263));
    }
}