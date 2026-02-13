package OOPS.multipleInheritance;

interface BankAccount{
    void deposit(double amount);
}
interface Lone{
    void applyLone(String name ,int amount);
}
class  Customer implements BankAccount,Lone{
    public void deposit(double amount){
        System.out.println("your deposit mony is :"+amount);
    }
    public void applyLone(String name ,int amount){
        System.out.println("Hello ! "+name);
        System.out.println(name+" your lone is applied ");
        System.out.println("your lone amount is :"+amount);
    }
}
public class practice2 {
    static void main() {
        Customer c=new Customer();
        c.deposit(122212);
        c.applyLone("Ashutosh",500000);
    }
}
