import java.util.Scanner;

public class DepositBalance extends Transaction {
     /**
     * Initialise une nouvelle transaction avec le compte
     * @param account Le compte bancaire associé avec la transaction
     */
    public DepositBalance(BankAccount account) {
        super(account);
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entre le montant du dépot($): ");
        double amount = scanner.nextDouble();
        while (true) {
            if (amount > 0) {
                account.deposit(amount);
                System.out.println("Dépôt réussi.");
            }
            else{
                System.out.println("Le montant doit être plus que 0 $");
                break;
            }
        }

    }
}
