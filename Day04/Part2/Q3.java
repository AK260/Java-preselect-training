/*Lets create a bank account. Create a class named 'BankAccount' with the following data members
1 - Name of depositor
2 - Address of depositor
3 - Type of account
4 - Balance in account
5 - Number of transactions
Class 'BankAccount' has a method for each of the following 1 - Generate a unique account number for each depositor
For first depositor, account number will be BA1000, for second depositor it will be BA1001 and so on
2 - Display information and balance of depositor
3 - Deposit more amount in balance of any depositor
4 - Withdraw some amount from balance deposited
5 - Change address of depositor
After creating the class, do the following operations
1 - Enter the information (name, address, type of account, balance) of the depositors. Number of depositors are to be entered by user.
2 - Print the information of any depositor.
3 - Add some amount to the account of any depositor and then display final informaion of that depositor
4 - Remove some amount from the account of any depositor and then display final informaion of that depositor
5 - Change the address of any depositor and then display the final information of that depositor
6 - Randomly repeat these processes for some other bank accounts and after that print the total number of transactions*/


import java.util.Scanner;

class BankAccount {
    private static int accountCounter = 1000;

    private String depositorName;
    private String depositorAddress;
    private String accountType;
    private double accountBalance;
    private int numberOfTransactions;

    public BankAccount(String depositorName, String depositorAddress, String accountType, double accountBalance) {
        this.depositorName = depositorName;
        this.depositorAddress = depositorAddress;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
        this.numberOfTransactions = 0;
    }

    private String generateAccountNumber() {
        return "BA" + accountCounter++;
    }

    public void displayInformation() {
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Depositor Address: " + depositorAddress);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Number: " + generateAccountNumber());
        System.out.println("Account Balance: $" + accountBalance);
        System.out.println("Number of Transactions: " + numberOfTransactions);
    }

    public void depositAmount(double amount) {
        accountBalance += amount;
        numberOfTransactions++;
    }

    public void withdrawAmount(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            numberOfTransactions++;
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    public void changeAddress(String newAddress) {
        depositorAddress = newAddress;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of depositors: ");
        int numDepositors = scanner.nextInt();
        scanner.nextLine();

        BankAccount[] bankAccounts = new BankAccount[numDepositors];

        for (int i = 0; i < numDepositors; i++) {
            System.out.println("\nEnter details for Depositor " + (i + 1) + ":");
            System.out.print("Depositor Name: ");
            String name = scanner.nextLine();

            System.out.print("Depositor Address: ");
            String address = scanner.nextLine();

            System.out.print("Account Type: ");
            String accountType = scanner.nextLine();

            System.out.print("Initial Balance: $");
            double balance = scanner.nextDouble();
            scanner.nextLine();

            bankAccounts[i] = new BankAccount(name, address, accountType, balance);
        }

        System.out.print("\nEnter the depositor number to display information: ");
        int depositorNumber = scanner.nextInt();
        bankAccounts[depositorNumber - 1].displayInformation();

        System.out.print("\nEnter the depositor number to deposit amount: ");
        depositorNumber = scanner.nextInt();
        System.out.print("Enter the amount to deposit: $");
        double depositAmount = scanner.nextDouble();
        bankAccounts[depositorNumber - 1].depositAmount(depositAmount);

        System.out.println("\nFinal Information after deposit:");
        bankAccounts[depositorNumber - 1].displayInformation();

        System.out.print("\nEnter the depositor number to withdraw amount: ");
        depositorNumber = scanner.nextInt();
        System.out.print("Enter the amount to withdraw: $");
        double withdrawAmount = scanner.nextDouble();
        bankAccounts[depositorNumber - 1].withdrawAmount(withdrawAmount);

        System.out.println("\nFinal Information after withdrawal:");
        bankAccounts[depositorNumber - 1].displayInformation();

        System.out.print("\nEnter the depositor number to change address: ");
        depositorNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the new address: ");
        String newAddress = scanner.nextLine();
        bankAccounts[depositorNumber - 1].changeAddress(newAddress);

        System.out.println("\nFinal Information after address change:");
        bankAccounts[depositorNumber - 1].displayInformation();

        for (int i = 0; i < 2; i++) {
            int randomDepositor = (int) (Math.random() * numDepositors);
            bankAccounts[randomDepositor].depositAmount(Math.random() * 1000);
            bankAccounts[randomDepositor].withdrawAmount(Math.random() * 500);
            bankAccounts[randomDepositor].changeAddress("NewRandomAddress");

            System.out.println("\nFinal Information after random operations:");
            bankAccounts[randomDepositor].displayInformation();
        }

        int totalTransactions = 0;
        for (BankAccount account : bankAccounts) {
            totalTransactions += account.getNumberOfTransactions();
        }
        System.out.println("\nTotal Number of Transactions for all depositors: " + totalTransactions);

    }
}
