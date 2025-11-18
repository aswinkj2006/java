public class BankAcc { 
String accountHolder, bankName; 
int accountNumber; 
double balance; 
// Default constructor 
public BankAcc() { 
this.balance = 0; 
} 
// Parameterized constructor 
public BankAcc(String accountHolder, String bankName, int accountNumber, double balance) { 
this.accountHolder = accountHolder; 
this.bankName = bankName; 
this.accountNumber = accountNumber; 
this.balance = balance; 
} 
// Copy constructor 
public BankAcc(BankAcc o) { 
this.accountHolder = o.accountHolder; 
this.bankName = o.bankName; 
this.accountNumber = o.accountNumber; 
this.balance = o.balance; 
} 
public void deposit(double amount) { 
if (amount > 0) balance += amount; 
} 
public void withdraw(double amount) { 
if (amount > 0 && balance >= amount) balance -= amount; 
} 
public double getBalance() { 
return balance; 
} 
public static void main(String[] args) { 
BankAcc acc1 = new BankAcc(); // Default 
BankAcc acc2 = new BankAcc("John", "SBI", 12345, 1000.0); // Parameterized 
BankAcc acc3 = new BankAcc(acc2); // Copy 
acc2.deposit(500); 
acc2.withdraw(200); 
System.out.println("Acc1 balance: " + acc1.getBalance()); // 0.0 
System.out.println("Acc2 balance: " + acc2.getBalance()); // 1300.0 
System.out.println("Acc3 balance: " + acc3.getBalance()); // 1000.0 
} 
} 