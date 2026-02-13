package OOPS;

//Interface ,it is not a class in any interface we can't use  the constructor
interface Payment{
    void pay(double amount );
}
//upi payment
class  UPIPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid $"+amount+" using UPI");
    }
}
class CreditCard implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("Paid $"+amount+ " using Credit card ");
    }
}

public class InterfacesDemo {
    static void main() {
        Payment p1=new UPIPayment();
        Payment p2=new CreditCard();
        p1.pay(500);
        p2.pay(700);
    }
}
