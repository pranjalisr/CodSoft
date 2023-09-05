import java.util.Scanner;

class Bankaccount {
    private double balance; 

    public Bankaccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited " + amt + ". Current balance: " + balance);
    }

    public boolean withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
            System.out.println("Withdrew " + amt + ". Current balance: " + balance);
            return true;
        } else {
            System.out.println("Insufficient funds.");
            return false;
        }
    }
}

class ATM {
    private Bankaccount BA;
    private Scanner sc;

    public ATM(Bankaccount account) {
        BA = account;
        sc = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void run() {
        while (true) {
            displayMenu();
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + BA.getBalance());
                    break;
                case 2:
                    System.out.println("Enter the deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    BA.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Enter the required withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    BA.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Exiting ATM. Thank you! Please visit again.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}

public class TaskAT {
    public static void main(String[] args) {
        double initialBalance = 1000.0;  
        Bankaccount userAccount = new Bankaccount(initialBalance);
        ATM atm = new ATM(userAccount);
        atm.run();
    }
}
