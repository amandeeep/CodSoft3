package ATM_Machine;

// Main Class or User Class
public class Main {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(10000);
        ATM atm = new ATM(userAccount);
        atm.start();
        // differen emoji are added to make console more attractive
        // all code are written by Amandeep Singh
    }
}
