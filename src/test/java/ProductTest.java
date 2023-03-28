import main.java.org.tpTestFonctionels.Product;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ProductTest {
    @Test
    public void testProduct() {
        Product product = new Product("iPhone", "Smartphone from Apple", 999.99);
        assertEquals("iPhone", product.getName());
        assertEquals("Smartphone from Apple", product.getDescription());
        assertEquals(999.99, product.getPrice(), 0.01);
    }
}
