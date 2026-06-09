package collects.grouping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupTransaction {
    private String type;
    private int value;
    private boolean approved;

    public GroupTransaction(String type, int value, boolean approved) {
        this.type = type;
        this.value = value;
        this.approved = approved;
    }

    public String getType() {
        return type;
    }

    public int getValue() {
        return value;
    }

    public boolean isApproved() {
        return approved;
    }

    public static void main(String[] args) {
        GroupTransaction transaction1 = new GroupTransaction("PIX", 1500, true);
        GroupTransaction transaction2 = new GroupTransaction("TED", 5000, true);
        GroupTransaction transaction3 = new GroupTransaction("BOLETO", 300, false);
        GroupTransaction transaction4 = new GroupTransaction("PIX", 200, true);
        GroupTransaction transaction5 = new GroupTransaction("TED", 8000, true);
        GroupTransaction transaction6 = new GroupTransaction("BOLETO", 100, true);
        GroupTransaction transaction7 = new GroupTransaction("TED", 1200, true);

        List<GroupTransaction> groupTransactions = List.of(transaction1, transaction2, transaction3, transaction4, transaction5,
                transaction6, transaction7);
        Map<String, Long> transactions = groupTransactions
                .stream()
                .filter(GroupTransaction::isApproved)
                .collect(Collectors.groupingBy(
                        GroupTransaction::getType,
                        Collectors.counting()));
        System.out.println(transactions);
    }
}
