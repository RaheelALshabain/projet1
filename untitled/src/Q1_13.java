public class Q1_13 {
    private String cardNumber;
    private double balance;
    private double creditLimit;

    public Q1_13(String cardNumber, double creditLimit) {
        this.cardNumber = cardNumber;
        this.creditLimit = creditLimit;
        this.balance = 0.0;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
    public void makePurchase(double amount) {
        if (amount + balance <= creditLimit) {
            balance += amount;
            System.out.println("Purchase successful on " + cardNumber + ": $" + amount);
        } else {
            System.out.println("Purchase declined on " + cardNumber + ": exceeds credit limit.");
        }
    }
    public static void main(String[] args) {
        Q1_13 card1 = new Q1_13("1234-5678-9012-3456", 2000.0);
        Q1_13 card2 = new Q1_13("2345-6789-0123-4567", 3000.0);
        Q1_13 card3 = new Q1_13("3456-7890-1234-5678", 4000.0);

        Q1_13[] cards = {card1, card2, card3};


        double[] purchaseAmounts = {1800.0, 2500.0, 5000.0};

        for (int i = 0; i < cards.length; i++){
            cards[i].makePurchase(purchaseAmounts[i]);}


    }


}

