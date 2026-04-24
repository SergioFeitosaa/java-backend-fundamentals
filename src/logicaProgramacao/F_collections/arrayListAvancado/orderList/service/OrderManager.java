package logicaProgramacao.F_collections.arrayListAvancado.orderList.service;

import logicaProgramacao.F_collections.arrayListAvancado.orderList.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> listOrders() {
        return new ArrayList<>(orders);
    }

    public Order findOrderByName(String name) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getProductName().equals(name)) {
                return orders.get(i);
            }
        }
        return null;
    }

    public void updateOrder(String name, String newName, int newQuantity) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getProductName().equals(name)){
                orders.get(i).setProductName(newName);
                orders.get(i).setQuantity(newQuantity);
                break;
            }
        }
    }

    public void removeOrder(String name) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getProductName().equals(name)) {
                orders.remove(i);
                break;
            }
        }
    }
}
