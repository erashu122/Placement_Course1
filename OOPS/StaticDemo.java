package OOPS;

class Student{
    static String canteen;
    static String university;
    static {
        System.out.println("Static block Invoke ");
        canteen=" mess";
        university="jis";
        greetStudent();

    }
    String name;
    int rollNumber;
    Student(String name,int rollNumb){
        this.name=name;
        this.rollNumber=rollNumb;
    }
    static void greetStudent(){
        System.out.println("Hello and welcome to "+ university);
    }
    public int getRollNumber(){
        return rollNumber;
    }
    public String getName(){
        return name;
    }
}
public class StaticDemo {
     static void main() {
         System.out.println(Student.canteen);
         Student stu=new Student("ashu",12);

         System.out.println(stu.getRollNumber()+" "+stu.getName());

    }
}
