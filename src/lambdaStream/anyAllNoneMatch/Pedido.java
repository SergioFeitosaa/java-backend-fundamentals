package lambdaStream.anyAllNoneMatch;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroPedido;
    private boolean pago;

    public Pedido(int numeroPedido, boolean pago) {
        this.numeroPedido = numeroPedido;
        this.pago = pago;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public boolean isPago() {
        return pago;
    }

    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(1001, true);
        Pedido pedido2 = new Pedido(1002, true);
        Pedido pedido3 = new Pedido(1003, false);
        Pedido pedido4 = new Pedido(1004, true);

        List<Pedido> pedidos = List.of(pedido1, pedido2, pedido3, pedido4);
        boolean pedidosPagos = pedidos
                .stream()
                .allMatch(Pedido::isPago);
        if (pedidosPagos) {
            System.out.println("Lote liberado");
        } else {
            System.out.println("Existem pedidos pendentes");
        }
    }
}
