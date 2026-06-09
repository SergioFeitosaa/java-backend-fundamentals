package collects.grouping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Transaction2 {
    private String type;
    private int value;
    private boolean approved;

    public Transaction2(String type, int value, boolean approved) {
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
        Transaction2 transaction1 = new Transaction2("PIX", 1500, true);
        Transaction2 transaction2 = new Transaction2("TED", 5000, true);
        Transaction2 transaction3 = new Transaction2("BOLETO", 300, false);
        Transaction2 transaction4 = new Transaction2("PIX", 200, true);
        Transaction2 transaction5 = new Transaction2("TED", 8000, true);
        Transaction2 transaction6 = new Transaction2("BOLETO", 100, true);
        Transaction2 transaction7 = new Transaction2("PIX", 50, false);
        Transaction2 transaction8 = new Transaction2("TED", 1200, true);

        List<Transaction2> transaction2s = List.of(transaction1, transaction2, transaction3, transaction4,
                transaction5, transaction6, transaction7, transaction8);
        Map<String, Integer> groupTransaction = transaction2s
                .stream()
                .filter(Transaction2::isApproved)
                .collect(Collectors.groupingBy
                        (Transaction2::getType, Collectors.summingInt
                                 (Transaction2::getValue)));

        System.out.println(groupTransaction);

    }

}
