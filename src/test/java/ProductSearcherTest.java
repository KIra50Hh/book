import main.java.org.tpTestFonctionels.Product;
import main.java.org.tpTestFonctionels.ProductSearcher;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

import java.util.ArrayList;
import java.util.List;

public class ProductSearcherTest {

    @Test
    public void testSearchByName() {
        Product p1 = new Product("Laptop", "Dell Inspiron 15", 899.99);
        Product p2 = new Product("Phone", "Samsung Galaxy S10", 699.99);
        Product p3 = new Product("Headphones", "Beats Solo 3", 299.99);
        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        ProductSearcher searcher = new ProductSearcher(products);
        List<Product> result = searcher.searchByName("Laptop");
        assertEquals(1, result.size());
        assertEquals(p1, result.get(0));
    }

    @Test
    public void testSearchByDescription() {
        Product p1 = new Product("Laptop", "Dell Inspiron 15", 899.99);
        Product p2 = new Product("Phone", "Samsung Galaxy S10", 699.99);
        Product p3 = new Product("Headphones", "Beats Solo 3", 299.99);
        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        ProductSearcher searcher = new ProductSearcher(products);
        List<Product> result = searcher.searchByDescription("Beats");
        assertEquals(1, result.size());
        assertEquals(p3, result.get(0));
    }

    @Test
    public void testSearchByNameNotFound() {
        Product p1 = new Product("Laptop", "Dell Inspiron 15", 899.99);
        Product p2 = new Product("Phone", "Samsung Galaxy S10", 699.99);
        Product p3 = new Product("Headphones", "Beats Solo 3", 299.99);
        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        ProductSearcher searcher = new ProductSearcher(products);
        List<Product> result = searcher.searchByName("Tablet");
        assertTrue(result.isEmpty());
    }

    @Test
    public void testSearchByDescriptionNotFound() {
        Product p1 = new Product("Laptop", "Dell Inspiron 15", 899.99);
        Product p2 = new Product("Phone", "Samsung Galaxy S10", 699.99);
        Product p3 = new Product("Headphones", "Beats Solo 3", 299.99);
        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        ProductSearcher searcher = new ProductSearcher(products);
        List<Product> result = searcher.searchByDescription("Apple");
        assertTrue(result.isEmpty());
    }

}