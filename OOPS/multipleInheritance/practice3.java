package OOPS.multipleInheritance;

interface A{
    default void show(){
        System.out.println("A");
    }
}
interface B{
    static void show(){
        System.out.println("B");
    }
}
class c implements A,B{

}
public class practice3 {
    static void main() {
        c obj=new c();
        obj.show();
        B.show();
    }
}
