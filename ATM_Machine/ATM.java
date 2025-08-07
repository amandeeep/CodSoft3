package ATM_Machine;
import java.util.Scanner;

// this class implement different features of a ATM machine
public class ATM {
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("🏧 Welcome to the ATM!");

        while (true) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. 💸 Withdraw");
            System.out.println("2. 💰 Deposit");
            System.out.println("3. 📊 Check Balance");
            System.out.println("4. ❌ Exit");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    handleWithdraw();
                    break;
                case "2":
                    handleDeposit();
                    break;
                case "3":
                    handleCheckBalance();
                    break;
                case "4":
                    System.out.println("👋 Thank you for using the ATM. Goodbye!");
                    return;
                default:
                    System.out.println("❌ Invalid choice. Please select a valid option.");
            }
        }
    }

    public void handleWithdraw() {
        System.out.print("Enter amount to withdraw: ₹");
        double amount = readAmount();
        account.withdraw(amount);
    }

    private void handleDeposit() {
        System.out.print("Enter amount to deposit: ₹");
        double amount = readAmount();
        account.deposit(amount);
    }

    private void handleCheckBalance() {
        System.out.printf("💼 Your current balance is: ₹%.2f%n", account.getBalance());
    }

    private double readAmount() {
        try {
            return Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("❌ Invalid amount. Please enter a number.");
            return 0;
        }
    }
}
