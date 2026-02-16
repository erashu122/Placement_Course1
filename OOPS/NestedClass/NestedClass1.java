package OOPS.NestedClass;
class A{
     public int  age=21;
     private String name="Ashutosh Kumar Pandit ";
     private static String schoolName="Gandhi Shewa Ashram ";

     static class B{
          void Schoolname(){
               System.out.println("my school name is "+schoolName);

          }
//          void name(){          ------> it will be give the compile time error because of name variable is private so cannot access it ;
//               System.out.println("my name is :"+name);
//          }
//          void age(){             ------>is there age variable is public
//               System.out.println("My age is "+age);
//          }
     }
}
public class NestedClass1 {
     static void main() {
          A.B c=new A.B();
          c.Schoolname();
     }
}
