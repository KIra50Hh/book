package tpTestFonctionels;

import java.util.ArrayList;
import java.util.List;

public class ProductSearcher {
    private List<Product> products;

    public ProductSearcher(List<Product> products) {
        this.products = products;
    }

    public List<Product> searchByName(String name) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().contains(name)) {
                result.add(product);
            }
        }
        return result;
    }

    public List<Product> searchByDescription(String description) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getDescription().contains(description)) {
                result.add(product);
            }
        }
        return result;
    }
}
