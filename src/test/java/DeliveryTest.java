import main.java.org.tpJenkins.exercice3.Delivery;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DeliveryTest {

    @Test
    public void testGetPrixLivraison() {
        Delivery delivery = new Delivery();
        delivery.delivery(5, 25);
        double actualPrix = delivery.getPrixLivraison();
        assertEquals(10.0, actualPrix);
    }
}
