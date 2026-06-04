package lambdaStream.limit;

import java.util.Comparator;
import java.util.List;

public class Transaction {
    private String type;
    private int value;
    private boolean approved;

    public Transaction(String type, int value, boolean approved) {
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
        Transaction transaction1 = new Transaction("PIX", 1500, true);
        Transaction transaction2 = new Transaction("TED", 5000, true);
        Transaction transaction3 = new Transaction("BOLETO", 300, false);
        Transaction transaction4 = new Transaction("PIX", 200, true);
        Transaction transaction5 = new Transaction("TED", 8000, true);
        Transaction transaction6 = new Transaction("BOLETO", 100, true);

        List<Transaction> transactions = List.of(transaction1, transaction2, transaction3, transaction4,
                transaction5, transaction6);
        List<String> transactionApproved = transactions
                .stream()
                .filter(Transaction::isApproved)
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .map(transaction -> transaction.getType() + " - " + transaction.getValue())
                .limit(3)
                .toList();
        System.out.println(transactionApproved);
    }
}
