package logicaProgramacao.F_collections.arrayListAvancado.productList.service;

import logicaProgramacao.F_collections.arrayListAvancado.productList.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                products.remove(i);
                break;
            }
        }

    }

    public List<Product> listProducts() {
        return new ArrayList<>(products);
    }

    public Product findProductByName(String name){

        for (Product product : products) {

            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
}
