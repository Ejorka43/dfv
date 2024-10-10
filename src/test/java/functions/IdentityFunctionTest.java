package functions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IdentityFunctionTest {
    @Test
    void applyTest() {
        IdentityFunction function = new IdentityFunction();
        assertEquals(1.52375654, function.apply(1.52375654));
        assertEquals(-2.53253, function.apply(-2.53253));
        assertEquals(0.0, function.apply(0.0));
    }
}
