public class Q1_11 {
    private final String cardNumber;
    private double balance;
    private double creditLimit;

    public Q1_11(String cardNumber, double creditLimit) {
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
            System.out.println("Purchase successful: $" + amount);
        } else {
            System.out.println("Purchase declined: exceeds credit limit.");
        }
    }
    public void makePayment(double amount) {
        balance -= amount;
        System.out.println("Payment successful: $" + amount);
    }

    public void updateCreditLimit(double newLimit) {
        this.creditLimit = newLimit;
        System.out.println("Credit limit updated to: $" + newLimit);
    }
    public static void main(String[] args) {
        Q1_11 myCard = new Q1_11("1234-5678-9012-3456", 5000.0);

        myCard.makePurchase(1500.0);
        System.out.println("Current Balance: $" + myCard.getBalance());

        myCard.updateCreditLimit(6000.0);
        System.out.println("Current Credit Limit: $" + myCard.getCreditLimit());

        myCard.makePayment(500.0);
        System.out.println("Current Balance: $" + myCard.getBalance());

    }

}

