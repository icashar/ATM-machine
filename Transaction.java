/** Répresente une transactin general avec un compte bancaire*/
public class Transaction {

    protected BankAccount account;
    /**
     * Initialise une nouvelle transaction avec le compte
     * @param account Le compte bancaire associé avec la transaction
     */
    public Transaction(BankAccount account) {
        this.account = account;
    }

    /**
     * À remplacer par des types de transactions spécifiques(pour chancune des
     * objets)
     * 
     */
    public void execute() {

    }
}
