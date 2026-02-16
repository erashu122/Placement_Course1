package OOPS.NestedClass;

class outer{
    void display() {

        class Inner {
            void show() {
                System.out.println("Inside method");
            }
        }

        Inner obj = new Inner();
        obj.show();
    }
}
public class LocalInnerClass {
    static void main() {
        outer o=new outer();
        o.display();
    }

}
