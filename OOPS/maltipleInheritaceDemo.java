package OOPS;
class LivingThing{
    void breathe(){
        System.out.println("Living thing breathes");
    }
}
class Human extends LivingThing{
    void walk(){
        System.out.println("Human walks");
    }
}
class Employee extends Human{
    void work(){
        System.out.println("Employee works in office");
    }
}
public class maltipleInheritaceDemo {
    static void main() {
        Employee e=new Employee();
        e.breathe();
        e.walk();
        e.work();
    }

}
