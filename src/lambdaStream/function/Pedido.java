package lambdaStream.function;

import java.util.List;

public class Pedido {
    private String produto;
    private double valor;

    public Pedido(String produto, double valor) {
        this.produto = produto;
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public double getValor() {
        return valor;
    }

    public static void main(String[] args) {
        Pedido produto1 = new Pedido("Notebook", 3500);
        Pedido produto2 = new Pedido("Mouse", 80);
        Pedido produto3 = new Pedido("Teclado", 200);
        Pedido produto4 = new Pedido("Monitor", 1200);

        List<Pedido> produtos = List.of(produto1, produto2, produto3, produto4);
        List<String> produtosFiltrados =
                produtos.stream()
                        .filter(produto -> produto.getValor() > 100)
                        .map(produto -> "PRODUTOS: " + produto.getProduto().toUpperCase())
                        .toList();
        System.out.println(produtosFiltrados);
    }
}
