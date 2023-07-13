public class BankAccount {
    private User user;

    public BankAccount(User user) {
        this.user = user;
    }

    public void deposit(double amount) {
        user.setAccountBalance(user.getAccountBalance() + amount);
        System.out.println("Montant déposé avec succès !");
    }

    public void withdraw(double amount) {
        if (amount <= user.getAccountBalance()) {
            user.setAccountBalance(user.getAccountBalance() - amount);
            System.out.println("Retrait réussi !");
        } else {
            System.out.println("Fonds insuffisants !");
        }
    }

    public void checkBalance() {
        System.out.println("Solde du compte : " + user.getAccountBalance() + "€");
    }
}
