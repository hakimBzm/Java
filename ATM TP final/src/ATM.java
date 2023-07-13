import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Création d'un utilisateur
        System.out.print("Nom: ");
        String firstName = scanner.nextLine();
        System.out.print("Prénom: ");
        String lastName = scanner.nextLine();
        System.out.print("Adresse: ");
        String address = scanner.nextLine();
        System.out.print("Code postal: ");
        String postalCode = scanner.nextLine();
        System.out.print("Ville: ");
        String city = scanner.nextLine();
        System.out.print("Montant du compte: ");
        double accountBalance = scanner.nextDouble();
        scanner.nextLine(); // Clear the newline character

        User user = new User(firstName, lastName, address, postalCode, city, accountBalance);

        // Création du compte bancaire
        BankAccount bankAccount = new BankAccount(user);

        // Interaction avec l'ATM
        int choice;
        double amount;

        do {
            System.out.println("ATM ");
            System.out.println("1. Déposer de l'argent");
            System.out.println("2. Retirer de l'argent");
            System.out.println("3. Consulter le solde du compte");
            System.out.println("0. Quitter");
            System.out.print("Choix: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Montant à déposer: ");
                    amount = scanner.nextDouble();
                    bankAccount.deposit(amount);
                    break;
                case 2:
                    System.out.print("Montant à retirer: ");
                    amount = scanner.nextDouble();
                    bankAccount.withdraw(amount);
                    break;
                case 3:
                    bankAccount.checkBalance();
                    break;
                case 0:
                    System.out.println("Merci d'avoir utilisé notre Banque pigeons :)");
                    break;
                default:
                    System.out.println("Choix invalide");
            }
        } while (choice != 0);

        scanner.close();
    }
}
