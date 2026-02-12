package OOPS;

class BankAccount{
    //private data (hidden from outside)
    private String accountNumber;
    private double balance;
    BankAccount(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;

    }
    // getter for accountNumber
    public String getAccountNumber(){
        return accountNumber;
    }
    //getter for balance
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if (amount>0){
            balance+=amount;
            System.out.println("Deposited: "+amount);
        }
        else System.out.println("invilad amount for deposit");
    }
    public void withdraw(double amount){
        if (amount> 0 && amount<=balance){
            balance-=amount;
            System.out.println("withdraw : "+amount);
        }
        else System.out.println("your balance is less then your amount please enter vailed amount :");
    }
}
public class EncapsulationDemo {
    static void main() {
        BankAccount b1=new BankAccount("12322",500);
        System.out.println("Account number :"+b1.getAccountNumber());
        System.out.println("balance number :"+b1.getBalance());
        b1.deposit(200);
        System.out.println("after deposit :"+ b1.getBalance());
        b1.withdraw(1000);
        System.out.println("after withdraw :"+b1.getBalance());

    }
}
