package by.tms.homeworkten;


import by.tms.homeworkten.product.Product;
import by.tms.homeworkten.product.ProductManager;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        try {
            ProductManager manager = new ProductManager();

            Product product1 = new Product("Laptop", 999.99, 10);
            Product product2 = new Product("Smartphone", 499.99, 20);
            Product product3 = new Product("Tablet", 105.5, 15);

            manager.addProduct(product1);
            manager.addProduct(product2);
            manager.addProduct(product3);


            Product foundProduct = manager.findByName("Smartphone");
            if (foundProduct != null) {
                foundProduct.displayInfo();
            } else {
                System.out.println("Product not found");
            }

            List<Product> expensiveProducts = manager.findByPriceGreaterThan(300);
            for (Product product : expensiveProducts) {
                product.displayInfo();
            }


            System.out.println("Total products count: " + manager.getTotalCount());


            Product newProduct = new Product("Headphones", 199.99, 50);
            manager.addProductInMiddle(newProduct);


            System.out.println("Total products count after adding: " + manager.getTotalCount());


            System.out.println("Is the last added product in the list? " + manager.containsProduct(newProduct));


            List<Product> allProducts = manager.getProductsFromStartToLastAdded();
            for (Product product : allProducts) {
                product.displayInfo();
            }


            List<Product> reversedProducts = manager.getReversedProducts();
            System.out.println("Reversed product list:");
            for (Product product : reversedProducts) {
                product.displayInfo();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

