package logicaProgramacao.E_arrayList.desafios.processamentoPedidosEcommerce;

import java.util.ArrayList;

public class Pedidos_Test {
    public static void main(String[] args) {
        Pedidos pedido1 = new Pedidos();
        pedido1.setNomeDocliente("João da Silva");
        pedido1.setValorDoPedido(250.00);
        pedido1.setQuantidadeDeItens(3);
        pedido1.setStatusDoPedido("PENDENTE");

        Pedidos pedido2 = new Pedidos();
        pedido2.setNomeDocliente("Maria Souza");
        pedido2.setValorDoPedido(780.00);
        pedido2.setQuantidadeDeItens(7);
        pedido2.setStatusDoPedido("PAGO");

        Pedidos pedido3 = new Pedidos();
        pedido3.setNomeDocliente("Carlos Lima");
        pedido3.setValorDoPedido(120.00);
        pedido3.setQuantidadeDeItens(2);
        pedido3.setStatusDoPedido("CANCELADO");

        Pedidos pedido4 = new Pedidos();
        pedido4.setNomeDocliente("Ana Costa");
        pedido4.setValorDoPedido(950.00);
        pedido4.setQuantidadeDeItens(10);
        pedido4.setStatusDoPedido("PAGO");

        Pedidos pedido5 = new Pedidos();
        pedido5.setNomeDocliente("Fernando Alves");
        pedido5.setValorDoPedido(430.00);
        pedido5.setQuantidadeDeItens(5);
        pedido5.setStatusDoPedido("PENDENTE");

        ArrayList<Pedidos> listaDePedidos = new ArrayList<>();
        listaDePedidos.add(pedido1);
        listaDePedidos.add(pedido2);
        listaDePedidos.add(pedido3);
        listaDePedidos.add(pedido4);
        listaDePedidos.add(pedido5);

        Pedidos pedidoMaiorValor = listaDePedidos.get(0);
        Pedidos pedidoMenorValor = listaDePedidos.get(0);

        System.out.println("Lista de Pedidos");
        for (Pedidos pedido : listaDePedidos) {
            System.out.println("cliente: " + pedido.getNomeDocliente()
                    + " | Valor: " + pedido.getValorDoPedido()
                    + " | Quantidade: " + pedido.getQuantidadeDeItens()
                    + " | Status: " + pedido.getStatusDoPedido());
        }

        for (Pedidos pedido : listaDePedidos) {
            if (pedido.getValorDoPedido() > pedidoMaiorValor.getValorDoPedido()) {
                pedidoMaiorValor = pedido;
            }
        }
        System.out.println("Pedido com maior valor: " + pedidoMaiorValor.getValorDoPedido());

        for (Pedidos pedido : listaDePedidos) {
            if (pedido.getValorDoPedido() < pedidoMenorValor.getValorDoPedido()) {
                pedidoMenorValor = pedido;
            }
        }
        System.out.println("Pedido com menor valor: " + pedidoMenorValor.getValorDoPedido());

        ArrayList<Pedidos> listaPedidosPremium = new ArrayList<>();
        for (Pedidos pedido : listaDePedidos) {
            if (pedido.getValorDoPedido() >= 500) {
                listaPedidosPremium.add(pedido);
            }
        }

        double soma = 0;

        for (Pedidos pedido : listaDePedidos) {
            soma += pedido.getValorDoPedido();
        }
        double media = soma / listaDePedidos.size();
        System.out.println("Média dos pedidos: " + media);

        System.out.println("Lista com pedidos premium");
        for (Pedidos pedido : listaPedidosPremium) {
            System.out.println(pedido.getValorDoPedido());
        }

        ArrayList<Pedidos> listaGrandePedidos = new ArrayList<>();
        for (Pedidos pedido : listaDePedidos) {
            if (pedido.getQuantidadeDeItens() > 5) {
                listaGrandePedidos.add(pedido);
            }
        }

        System.out.println("Lista com grandes pedidos");
        for (Pedidos pedidos : listaGrandePedidos) {
            System.out.println(pedidos.getQuantidadeDeItens());
        }

        ArrayList<Pedidos> listaPedidoPagos = new ArrayList<>();
        for (Pedidos pedido : listaDePedidos) {
            if (pedido.getStatusDoPedido().equalsIgnoreCase("PAGO")) {
                listaPedidoPagos.add(pedido);
            }
        }

        System.out.println("\nLista de pedido pagos");
        for (Pedidos pedido : listaPedidoPagos) {
            System.out.println("Cliente: " + pedido.getStatusDoPedido()
                    + " | Valor: " + pedido.getValorDoPedido());
        }
    }

}
