public class CheckingAccount extends BankAccount {
    private double limit;

    public CheckingAccount(String accountNumber, double balance, double limit) {
        super(accountNumber, balance);
        this.limit = limit;
    }

    // Getter
    public double getLimit() {
        return limit;
    }

    // Setter
    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "Compte Courant - " + super.toString() + ", Limite: " + limit + "FCFA";
    }
}