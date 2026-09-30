interface bank{
    void deposit(double amount);
    void withdraw(double amount);
    void displayBalance();
}
class account implements bank{
    int accountNumber;
    String Name;
    double balance;
    account(int accountNumber, String Name, double balance){
        this.accountNumber = accountNumber;
        this.Name = Name;
        this.balance = balance;
    }
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
    }
    public void withdraw(double amount){
        if(amount <= balance){
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    public void displayBalance(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + Name);
        System.out.println("Current Balance: " + balance);
    }
}
public class interfacedemo{
    public static void main(String[] args){
        account obj = new account(101, "arun", 5000);
        System.out.println("\n...Account Details...");
        obj.displayBalance();
        System.out.println("\n...Depositing Amount...");
        obj.deposit(2000);
        System.out.println("\n...Withdrawing Amount...");
        obj.withdraw(500);
        obj.displayBalance();
    }
}