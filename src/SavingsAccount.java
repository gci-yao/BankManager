public class SavingsAccount extends BankAccount {
    // Aucune nouvelle propriété spécifique requise pour l'exercice,
    // mais vous pourriez ajouter un taux d'intérêt par exemple.
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public String toString() {
        return "Compte Épargne - " + super.toString();
    }
}

