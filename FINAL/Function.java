package FINAL;

class MyFunctionClass{
    public void printNumber(int number ,int number2){
        int add=number+number2;
        System.out.println("Add of two number "+ add);
    }
    public void multiply(int a,int b){
        int res=a*b;
        System.out.println("multiplication of two number "+res);
    }
}

public class Function {
    public static void main(String[] args) {
        MyFunctionClass obj =new MyFunctionClass();
        obj.printNumber(12,13);
    }
}
