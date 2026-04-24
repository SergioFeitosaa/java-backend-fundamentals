package logicaProgramacao.F_collections.arrayListAvancado.orderList;

import logicaProgramacao.F_collections.arrayListAvancado.orderList.model.Order;
import logicaProgramacao.F_collections.arrayListAvancado.orderList.service.OrderManager;

public class Main {

    public static void main(String[] args) {

        // 1. Inicialização
        OrderManager orderManager = new OrderManager();
        Order order1 = new Order("Mouse", 100, 2);
        Order order2 = new Order("Teclado", 200.0, 1);
        Order order3 = new Order("Monitor", 900.0, 1);

        // 2. CREATE (Adicionar)
        System.out.println("=== ADD ORDER ===");
        orderManager.addOrder(order1);
        orderManager.addOrder(order2);
        orderManager.addOrder(order3);
        for (Order order : orderManager.listOrders()) {
            System.out.println(order);
        }

        // 3. READ (Listar todos)
        System.out.println("\n=== LIST ALL ORDER ===");
        for (Order order : orderManager.listOrders()) {
            System.out.println(order);
        }

        // 4. READ (Buscar por nome)
        System.out.println("\n=== FIND ORDER BY NAME ===");

        Order foundOrder = orderManager.findOrderByName("Teclado");

        if (foundOrder != null){
            System.out.println(foundOrder);
        }else {
            System.out.println("Order not found");
        }

        // 5. UPDDATE (Atualizar)
        System.out.println("=== ATUALIZAR ORDER ===");
        orderManager.updateOrder("Mouse", "Mouse Ergonomico", 4);
        for (Order order : orderManager.listOrders()){
            System.out.println(order);
        }

        // 6. REMOVE (Remover)
        System.out.println("=== REMOVE ORDER ===");
        orderManager.removeOrder("Teclado");
        for (Order order : orderManager.listOrders()){
            System.out.println(order);
        }

    }
}
