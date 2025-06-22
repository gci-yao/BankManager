public class COD extends BankAccount {
    private int termMonths; // Durée du certificat de dépôt en mois

    public COD(String accountNumber, double balance, int termMonths) {
        super(accountNumber, balance);
        this.termMonths = termMonths;
    }

    // Getter
    public int getTermMonths() {
        return termMonths;
    }

    // Setter
    public void setTermMonths(int termMonths) {
        this.termMonths = termMonths;
    }

    @Override
    public String toString() {
        return "Certificat de Dépôt (COD) - " + super.toString() + ", Durée: " + termMonths + " mois";
    }
}