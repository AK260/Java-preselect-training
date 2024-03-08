/*create a java application to manage bank accounts, there are three diffrent type of bank accounts - saving account, current account and demat account.
only the saving account gives the interest.*/


import java.util.Scanner;

interface InterestEarning {
    double getInterestRate();
}

class BankAccount {
    private static int accountCounter = 1000;

    private String accountHolderName;
    private double balance;
    private String accountType;
    private int accountNumber;

    public BankAccount(String accountHolderName, double balance, String accountType) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
        this.accountNumber = accountCounter++;
    }

    public void displayAccountInfo() {
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}

class SavingAccount extends BankAccount implements InterestEarning {
    private static final double INTEREST_RATE = 0.05;

    public SavingAccount(String accountHolderName, double balance) {
        super(accountHolderName, balance, "Saving Account");
    }

    @Override
    public double getInterestRate() {
        return INTEREST_RATE;
    }

    public void calculateInterest() {
        double interest = getInterestRate() * getBalance();
        deposit(interest);
        System.out.println("Interest earned: $" + interest);
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountHolderName, double balance) {
        super(accountHolderName, balance, "Current Account");
    }
}

class DematAccount extends BankAccount {
    public DematAccount(String accountHolderName, double balance) {
        super(accountHolderName, balance, "Demat Account");
    }
}

public class AdditionalAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SavingAccount savingAccount = new SavingAccount("John Doe", 1000.0);
        CurrentAccount currentAccount = new CurrentAccount("Jane Doe", 2000.0);
        DematAccount dematAccount = new DematAccount("Alice", 1500.0);

        savingAccount.displayAccountInfo();
        savingAccount.deposit(500.0);
        savingAccount.calculateInterest();
        savingAccount.withdraw(200.0);

        System.out.println("\n-------------------------");

        currentAccount.displayAccountInfo();
        currentAccount.deposit(1000.0);
        currentAccount.withdraw(500.0);

        System.out.println("\n-------------------------");

        dematAccount.displayAccountInfo();
        dematAccount.deposit(800.0);
        dematAccount.withdraw(300.0);

        scanner.close();
    }
}
