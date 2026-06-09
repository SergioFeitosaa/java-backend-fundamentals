package collects.collectingAndThen;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Order {

    private String customerName;
    private String category;
    private double price;
    private boolean delivered;

    public Order(String customerName, String category, double price, boolean delivered) {
        this.customerName = customerName;
        this.category = category;
        this.price = price;
        this.delivered = delivered;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public static void main(String[] args) {
        Order order1 = new Order("Sérgio", "ELETRONICS", 3500, true);
        Order order2 = new Order("Ana", "BOOKS", 120, true);
        Order order3 = new Order("Carlos", "ELETRONICS", 4200, true);
        Order order4 = new Order("Fernanda", "FASHION", 300, false);
        Order order5 = new Order("Pedro", "BOOKS", 180, true);
        Order order6 = new Order("Maria", "ELETRONICS", 6000, true);

        List<Order> customer = List.of(order1, order2, order3, order4, order5, order6);
        Map<String, String> customerOrders = customer.stream()
                .collect(Collectors.groupingBy(Order::getCategory, Collectors.collectingAndThen
                        (Collectors.maxBy(Comparator.comparing(Order::getPrice)),
                        optional -> optional.orElseThrow().getCustomerName())));
        System.out.println(customerOrders);

    }
}
