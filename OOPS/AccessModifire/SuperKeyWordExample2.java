package OOPS.AccessModifire;

class Parent{
    void display(){
        System.out.println("Every parent is a good person for his child");
    }
}
class child extends Parent{
    void display(){
        System.out.println("every child respect to our parents ");
    }
    void show(){
        super.display();
        display();

    }
}
public class SuperKeyWordExample2 {
    static void main() {
        child c=new child();
        c.show();
    }
}
