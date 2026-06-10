package collects.mapping;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Purchase {
    private String customerName;
    private String category;
    private String couponCode;
    private boolean paid;

    public Purchase(String customerName, String category, String couponCode, boolean paid) {
        this.customerName = customerName;
        this.category = category;
        this.couponCode = couponCode;
        this.paid = paid;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCategory() {
        return category;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public boolean isPaid() {
        return paid;
    }

    public static void main(String[] args) {
        Purchase purchase1 = new Purchase("Sérgio", "TECH", "TECH10", true);
        Purchase purchase2 = new Purchase("Ana", "BOOKS", "BOOK20", true);
        Purchase purchase3 = new Purchase("Carlos", "TECH", "TECH10", true);
        Purchase purchase4 = new Purchase("Maria", "HOME", "HOME15", false);
        Purchase purchase5 = new Purchase("Pedro", "BOOKS", "BOOK20", true);
        Purchase purchase6 = new Purchase("Fernanda", "TECH", "TECH30", true);

        List<Purchase> purchases = List.of(purchase1, purchase2, purchase3, purchase4, purchase5, purchase6);
        Map<String,Set<String>> couponCategory = purchases.stream()
                .filter(Purchase::isPaid)
                .collect(Collectors.groupingBy(Purchase::getCategory,
                        Collectors.mapping(Purchase::getCouponCode, Collectors.toSet())));

        System.out.println(couponCategory);
    }

}
