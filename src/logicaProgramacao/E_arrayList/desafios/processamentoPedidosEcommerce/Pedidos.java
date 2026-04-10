package logicaProgramacao.E_arrayList.desafios.processamentoPedidosEcommerce;

public class Pedidos {
    private String nomeDocliente;
    private double valorDoPedido;
    private int quantidadeDeItens;
    private String statusDoPedido;

    public void setNomeDocliente(String nomeDocliente) {
        this.nomeDocliente = nomeDocliente;
    }

    public String getNomeDocliente() {
        return nomeDocliente;
    }

    public void setValorDoPedido(double valorDoPedido) {
        this.valorDoPedido = valorDoPedido;
    }

    public double getValorDoPedido() {
        return valorDoPedido;
    }

    public void setQuantidadeDeItens(int quantidadeDeItens) {
        this.quantidadeDeItens = quantidadeDeItens;
    }

    public int getQuantidadeDeItens() {
        return quantidadeDeItens;
    }

    public void setStatusDoPedido(String statusDoPedido) {
        this.statusDoPedido = statusDoPedido;
    }

    public String getStatusDoPedido() {
        return statusDoPedido;
    }
}
