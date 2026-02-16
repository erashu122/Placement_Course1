package OOPS.NestedClass;
class Outer{
    int x=10;

    class Inner{
        void show(){
            System.out.println("Outer x= "+ x);
        }
    }
}
public class MemberInerClass {
    static void main() {
        Outer obj=new Outer();
        Outer.Inner in=obj.new Inner();
        in.show();
    }
}
