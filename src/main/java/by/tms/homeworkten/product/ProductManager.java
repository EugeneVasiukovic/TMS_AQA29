package by.tms.homeworkten.product;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> products = new ArrayList<>();
    private List<String> uniqueNames = new ArrayList<>();

    public void addProduct(Product product) throws Exception {
        if (uniqueNames.contains(product.getName())) {
            throw new Exception("Name must be unique!");
        }
        uniqueNames.add(product.getName());
        products.add(product);
    }

    public Product findByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public List<Product> findByPriceGreaterThan(double price) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() > price) {
                result.add(product);
            }
        }
        return result;
    }

    public int getTotalCount() {
        return products.size();
    }

    public void addProductInMiddle(Product product) throws Exception {
        if (uniqueNames.contains(product.getName())) {
            throw new Exception("Name must be unique!");
        }
        uniqueNames.add(product.getName());
        products.add(products.size() / 2, product);
    }

    public boolean containsProduct(Product product) {
        return products.contains(product);
    }

    public List<Product> getProductsFromStartToLastAdded() {
        return new ArrayList<>(products);
    }

    public List<Product> getReversedProducts() {
        List<Product> reversed = new ArrayList<>(products);
        java.util.Collections.reverse(reversed);
        return reversed;
    }
}
