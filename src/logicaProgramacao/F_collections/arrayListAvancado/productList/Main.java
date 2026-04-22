package logicaProgramacao.F_collections.arrayListAvancado.productList;

import logicaProgramacao.F_collections.arrayListAvancado.productList.model.Product;
import logicaProgramacao.F_collections.arrayListAvancado.productList.service.ShoppingCart;

public class Main {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Product product1 = new Product("Livro: O Sedutor do Sertão", 45.50);
        Product product2 = new Product("Mouse Vertical Ergonômico Sem Fio", 76.99);
        Product product3 = new Product("Luminária Barra de LED", 129.10);

        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        System.out.println("Products:");
        for (Product product : cart.listProducts()) {
            System.out.println(product);
        }

        cart.findProductByName("Livro: O Sedutor do Sertão");

        System.out.println("Remove Product");
        cart.removeProduct("Mouse Vertical Ergonômico Sem Fio");
        for (Product product : cart.listProducts()) {
            System.out.println(product);
        }

    }
}