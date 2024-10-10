package functions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitFunctionTest {

    @Test
    void applyTest() {
        UnitFunction unitFunction = new UnitFunction();
        assertEquals(1, unitFunction.apply(0));
        assertEquals(1, unitFunction.apply(14323));
        assertEquals(1, unitFunction.apply(-123654));
    }
}