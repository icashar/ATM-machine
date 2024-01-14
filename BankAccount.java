/**Représente un compte bancaire avec un solde et des opérations de base */
public class BankAccount{
    private double balance;
/**
 * Initialise un nouveau compte bancaire avec le solde initial donné.
 * @param initialBalance Le montant initial d'argent dans le code.
 */
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
/**
 * Obtient le montant actuel du compte bancaire.
 * @return le montant actuel du compte bancaire.
 */
    public double getBalance() {
        return balance;
    }
/**
 * Dépose le montant spécifié sur le compte bancaire.
 * @param amount Le montant qui doit être déposé.
 */
    public void deposit(double amount) {
        if(amount > 0){
        balance += amount;
        }
        else{
            System.out.println("Ce montant ne peut pas être pris en charge");
        }
    }
/**
 * Retire le montant spécifie du compte bancaire,si les fonds sont suffisants.
 * @param amount Montant à retirer.
 */
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Retrait réussi.");
        } else {
            System.out.println("Fonds insuffisants.");
        }
    }

}