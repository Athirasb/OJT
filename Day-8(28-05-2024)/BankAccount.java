public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = Math.max(initialBalance, 0);
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance");
        }
    }
    public double checkBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "John Doe", 500.0);
        System.out.println("Initial balance: " + account.checkBalance());
        account.deposit(150.0);
        account.withdraw(100.0);
        account.withdraw(600.0);
        System.out.println("Final balance: " + account.checkBalance());
    }
}
