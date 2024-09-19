package OOPs_Concept;

public class DataHiding {  
    private double balance;  
    public DataHiding (double initialBalance) 
    {  
        this.balance = initialBalance;  
    }  
    // Getter for balance  
    public double getBalance() {  
        return balance;  
    }  
    // Method to deposit money  
    public void deposit(double amount) {  
        if (amount > 0) {  
            balance += amount;  
            System.out.println(amount + " deposited. New balance: " + balance);  
        } else {  
            System.out.println("Invalid deposit amount.");  
        }  
    }  
    // Method to withdraw money  
    public void withdraw(double amount) {  
        if (amount > 0 && amount <= balance) {  
            balance -= amount;  
            System.out.println(amount + " withdrawn. New balance: " + balance);  
        } else {  
            System.out.println("Invalid withdrawal amount or insufficient funds.");  
        }  
    }  
    public static void main(String[] args) {  
        // Example usage  
        DataHiding account = new DataHiding (1000.0);  
        System.out.println("Initial balance: " + account.getBalance());  
        account.deposit(500.0);  
        account.withdraw(200.0);  
    }  
}  