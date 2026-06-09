package collects.mapping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderFood {
    private String customerName;
    private String restaurant;
    private double value;
    private boolean delivered;

    public OrderFood(String customerName, String restaurant, double value, boolean delivered) {
        this.customerName = customerName;
        this.restaurant = restaurant;
        this.value = value;
        this.delivered = delivered;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public double getValue() {
        return value;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public static void main(String[] args) {
        OrderFood orderFood1 = new OrderFood("Sérgio", "Mcdonalds", 45, true);
        OrderFood orderFood2 = new OrderFood("Ana", "Burguer", 60, true);
        OrderFood orderFood3 = new OrderFood("Carlos", "Mcdonalds", 35, true);
        OrderFood orderFood4 = new OrderFood("Maria", "Pizza Hut", 90, false);
        OrderFood orderFood5 = new OrderFood("Pedro", "Burger King", 50, true);
        OrderFood orderFood6 = new OrderFood("Fernanda", "Mcdonalds", 70, true);

        List<OrderFood> orderFoods = List.of(orderFood1, orderFood2, orderFood3, orderFood4, orderFood5, orderFood6);
        Map<String,List<String>> groupingRestaurant = orderFoods.stream()
                .filter(OrderFood::isDelivered)
                .collect(Collectors.groupingBy(OrderFood::getRestaurant,
                        Collectors.mapping(OrderFood::getCustomerName, Collectors.toList())));

        System.out.println(groupingRestaurant);
    }
}
