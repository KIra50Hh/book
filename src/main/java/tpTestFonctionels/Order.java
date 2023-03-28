package tpTestFonctionels;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;

    public Order() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
