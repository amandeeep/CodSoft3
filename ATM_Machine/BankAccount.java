package ATM_Machine;

// this class handle all code related to deposit and withdraw
public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("✅ ₹%.2f deposited successfully.%n", amount);
        } else {
            System.out.println("❌ Deposit amount must be greater than zero.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Withdrawal amount must be greater than zero.");
            return false;
        } else if (amount > balance) {
            System.out.println("❌ Insufficient balance.");
            return false;
        } else {
            balance -= amount;
            System.out.printf("✅ ₹%.2f withdrawn successfully.%n", amount);
            return true;
        }
    }
}
