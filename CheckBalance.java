/**
 * Représente une transaction pour vérifier le montant d'argent dans le compte
 */
public class CheckBalance extends Transaction {
    /**
     * Initialise une nouvelle transaction avec le compte
     * @param account Le compte bancaire associé avec la transaction
     */
    public CheckBalance(BankAccount account) {
        super(account);
    }
    /**
     * Imprime le montant actuel contenu dans le compte
     */
    @Override
    public void execute() {
        System.out.println("Balance actuel dans le compte " + account.getBalance()+" $");
    }

    
}
