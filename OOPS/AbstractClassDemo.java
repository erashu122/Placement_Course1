package OOPS;
abstract class Shape{
    Shape(){
        System.out.println("i am shape");
    }
    //abstract method have no body it is difind by the chield class
    abstract void area();

    //normal method
    void display(){
        System.out.println("Thish is a shape");
    }

}
class Circle extends Shape{
    double radius;
    Circle(double r){
        this.radius=r;
    }
    //if we are not difine the area method it gives the compile time error in the circle classs

    void area(){
        double area=Math.PI *radius *radius;
        System.out.println("Area of Circle is:  "+area);
    }

}
class Rectengle extends Shape{
    double length,width;
    Rectengle(double l,double w){
        this.length=l;
        this.width=w;
    }

    void area(){
        double area=length*width;
        System.out.println("Area of Rectengle is :"+area);
    }
}
public class AbstractClassDemo {
    static void main() {
        //we can't make the direct object of any one class ,it can be giving the compile time error
        /*Shape s=new Shape(); -->compile time Error*/
        //correct method to create object is
        Shape s1=new Circle(3);
        Shape s2=new Rectengle(12,4);
        //for calling the method is same rule not change
        s1.area();
        s2.area();
        s1.display(); //--->this display method call to any object because it is into the shape class

    }
}
