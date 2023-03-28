import main.java.org.exercice1.Factorielle;
import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;
import static org.testng.AssertJUnit.assertEquals;

public class testFactorielle {

    @Test
    public void testFactorielle() {
        Factorielle f = new Factorielle();
        assertEquals(1, f.factorielle(0));
        assertEquals(1, f.factorielle(1));
        assertEquals(120, f.factorielle(5));
        assertEquals(3628800, f.factorielle(10));
    }

    @Test
    public void testFactorielleWithNegativeInput() {
        Factorielle f = new Factorielle();
        assertThrows(IllegalArgumentException.class, () -> {
            f.factorielle(-5);
        });
    }

}
