package OOPS.Generics;

public class MyGenerics {
    static void main() {
//        IntegerDisplayer obj=new IntegerDisplayer();
//        obj.setNum(20);
//        obj.display();
//
//        DoubleDisplayer obj1=new DoubleDisplayer();
//        obj1.setNum(20.0);
//        obj1.display();

        Displayer<Integer> obj2=new Displayer();
        obj2.setNum(20);
        obj2.display();
    }

}
class Displayer<T>{
    T num;
    public void setNum(T num){
        this.num=num;
    }
    public void display(){
        System.out.println("element ->"+this.num);
    }
}
//class IntegerDisplayer{
//    Integer num;
//
//    public void setNum(Integer num){
//        this.num=num;
//    }
//    public void display(){
//        System.out.println("element ->"+this.num);
//    }
//
//}
//class DoubleDisplayer{
//    double num;
//
//    public void setNum(Double num){
//        this.num=num;
//    }
//    public void display(){
//        System.out.println("element ->"+this.num);
//    }
//
//}

