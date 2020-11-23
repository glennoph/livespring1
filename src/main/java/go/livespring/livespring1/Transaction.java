package go.livespring.livespring1;

public class Transaction {
    private int type;
    private int accountNumber;
    private int currency;
    private String merchantName;
    private int merchantLogo;

    public Transaction(int type, int accountNumber, int currency, String merchantName, int merchantLogo) {
        this.type = type;
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.merchantName = merchantName;
        this.merchantLogo = merchantLogo;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "type=" + type +
                ", accountNumber=" + accountNumber +
                ", currency=" + currency +
                ", merchantName='" + merchantName + '\'' +
                ", merchantLogo=" + merchantLogo +
                '}';
    }
}
