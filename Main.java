import java.util.Scanner;

/**
 * Ce projet implemente une machine ATM
 * 
 * @icashar (2024-01)
 */
public class Main {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000.0);

        Transaction[] transactions = {
                new CheckBalance(userAccount),
                new DepositBalance(userAccount),
                new WithdrawBalance(userAccount),
                new Exit()
        };

        System.out.println("~~~ Bienvenue dans la bank central ~~~");

        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean runL = true;
        
        while (true) {
            // pour verifier si l'utilisateur a bien saisi un nombre
            while (runL) {
            System.out.println("1. Voir ma balance");
            System.out.println("2. dépôt");
            System.out.println("3. Retirer");
            System.out.println("4. Quitter");

            System.out.print("Choisissez une option (1-4): ");

                if (scanner.hasNextInt()) {
                    runL = false;
                } else {
                    System.out.println("Ce n'est pas un nombre entier, veuillez réessayer.");
                    
                }
            }
            choice = scanner.nextInt();
            if (choice >= 1 && choice <= 4) {
                transactions[choice - 1].execute();

            } else {
                System.out.println("Choix invalide. Veuillez choisir à nouveau.");
            }
        }
    }
}
