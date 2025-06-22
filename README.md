# Projet Gestion de Comptes Bancaires (Java)

Ce projet Java simule un système de gestion de comptes bancaires à travers une hiérarchie de classes orientées objet.

## 🏦 Fonctionnalités

- Gestion de différents types de comptes :
    - Compte courant (`CheckingAccount`)
    - Compte épargne (`SavingsAccount`)
    - Certificat de dépôt (`COD`)
- Affichage d'informations détaillées sur chaque compte.
- Modification des soldes.
- Exemple d'utilisation dans une méthode `main()`.

## 📁 Structure du projet

```text
.
├── BankAccount.java        // Classe de base commune à tous les comptes
├── CheckingAccount.java    // Compte courant avec limite de découvert
├── SavingsAccount.java     // Compte épargne simple
├── COD.java                // Certificat de dépôt avec durée
└── BankManager.java        // Classe principale avec la méthode main()


###🚀 Comment exécuter? C'est simple  : 
Cloner le dépôt :
git clone https://github.com/votre_nom_utilisateur/GestionComptesBancaires.git
cd BankManager
clic src pour voir les fichiers et double ciic sur BankManager.java

Compiler les fichiers Java :
javac *.java

Exécuter le programme principal :
java BankManager

***Vous devriez avoir ce résultat  : 
--- Informations Initiales des Comptes ---
Compte Courant - Compte N°: CHK001, Solde: 1500.0FCFA, Limite: 500.0FCFA
Compte Épargne - Compte N°: SAV002, Solde: 5000.0FCFA
Certificat de Dépôt (COD) - Compte N°: COD003, Solde: 10000.0FCFA, Durée: 12 mois

--- Modification des Soldes ---
Nouveau solde pour CHK001: 1200.5FCFA
Nouveau solde pour SAV002: 5250.75FCFA
Nouveau solde pour COD003: 10500.0FCFA

--- Vérification finale des Comptes ---
Compte Courant - Compte N°: CHK001, Solde: 1200.5FCFA, Limite: 500.0FCFA
Compte Épargne - Compte N°: SAV002, Solde: 5250.75FCFA
Certificat de Dépôt (COD) - Compte N°: COD003, Solde: 10500.0FCFA, Durée: 12 mois



