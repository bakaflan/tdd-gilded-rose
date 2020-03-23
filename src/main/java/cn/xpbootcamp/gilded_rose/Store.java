package cn.xpbootcamp.gilded_rose;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Store {
    private List<Product> products;

    public Store() {
        this.products = new ArrayList<>();
    }

    public void updateProduct(){
        products.forEach(Product::updateProduct);
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
