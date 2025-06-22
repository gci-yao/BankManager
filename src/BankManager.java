public class BankManager {
    public static void main(String[] args) {
        // Création d'instances des 3 classes enfants
        CheckingAccount checkingAcc = new CheckingAccount("CHK001", 1500.00, 500.00);
        SavingsAccount savingsAcc = new SavingsAccount("SAV002", 5000.00);
        COD codAcc = new COD("COD003", 10000.00, 12);

        // Accéder et définir les attributs account et balance
        System.out.println("--- Informations Initiales des Comptes ---");
        System.out.println(checkingAcc);
        System.out.println(savingsAcc);
        System.out.println(codAcc);

        System.out.println("\n--- Modification des Soldes ---");

        // Modification du solde du compte courant
        checkingAcc.setBalance(1200.50);
        System.out.println("Nouveau solde pour " + checkingAcc.getAccountNumber() + ": " + checkingAcc.getBalance() + "FCFA");

        // Modification du solde du compte épargne
        savingsAcc.setBalance(5250.75);
        System.out.println("Nouveau solde pour " + savingsAcc.getAccountNumber() + ": " + savingsAcc.getBalance() + "FCFA");

        // Modification du solde du COD
        codAcc.setBalance(10500.00);
        System.out.println("Nouveau solde pour " + codAcc.getAccountNumber() + ": " + codAcc.getBalance() + "FCFA");

        System.out.println("\n--- Vérification finale des Comptes ---");
        System.out.println(checkingAcc);
        System.out.println(savingsAcc);
        System.out.println(codAcc);
    }
}