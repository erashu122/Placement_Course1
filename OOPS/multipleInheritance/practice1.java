package OOPS.multipleInheritance;

interface flyable{
    void fly();
}

interface Swimmable{
    void swim();
}
class duck implements flyable,Swimmable{
    public void fly(){
        System.out.println("duck can fly !");
    }
    public void swim(){
        System.out.println("duck can swim !");
    }
}
public class practice1 {
    static void main() {
        duck d=new duck();
        d.fly();
        d.swim();
    }
}
