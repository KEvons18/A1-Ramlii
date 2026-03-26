 import java.util.Scanner;
 class BankAccount {

    double balance;
    String ownerName;

    // Constructor
    BankAccount(String name, double initialBalance) {
        ownerName = name;
        balance = initialBalance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("%s, Deposit successful. Current Balance: %.2f\n", ownerName, balance);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("%s, Withdrawal successful. Current Balance: %.2f\n", ownerName, balance);
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    void checkBalance() {
        System.out.printf("%s, Current Balance: %.2f\n", ownerName, balance);
    }
}

public class bank {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = input.nextDouble();

        BankAccount account = new BankAccount(name, initialBalance);

        int choice;

        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw ");
            System.out.println("3. Check Balance ");
            System.out.println("4. Exit ");
            System.out.print("Choose: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    account.deposit(input.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    account.withdraw(input.nextDouble());
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        input.close();
    }
}