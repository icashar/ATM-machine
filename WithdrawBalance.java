import java.util.Scanner;

public class WithdrawBalance extends Transaction {
     /**
     * Initialise une nouvelle transaction avec le compte
     * @param account Le compte bancaire associé avec la transaction
     */
    public WithdrawBalance(BankAccount account) {
        super(account);
    }
    
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

            System.out.print("Entrez le montant du retrait ($):");
            double amount = scanner.nextDouble();
            account.withdraw(amount);
  
    }

}
