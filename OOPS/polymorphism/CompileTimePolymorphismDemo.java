package OOPS.polymorphism;

class Calculator{
    //Overloaded methods
    int add(int a,int b){
        System.out.println("int int ");
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}

public class CompileTimePolymorphismDemo {
    static void main() {
        Calculator obj=new Calculator();

        System.out.println(obj.add(1,3));     //call int add(int a,int b)
        System.out.println(obj.add(12.2,45.3));     //double add(double a,double b)
        System.out.println(obj.add(12,34,56)); //int add(int a,int b,int c)
    }
}
