package OOPS.AccessModifire;
class Human{
    Human(){
        System.out.println("Every human is taking breath ...");
    }
}
class Student extends Human{
    Student(){
        super();
        System.out.println("A good student is a future of his country ...");
    }
}
class Employ extends Student{
    Employ(){
        super();
        System.out.println("Every Student make a good employ for a company...");
    }
}


public class SuperkeyWords {
    static void main() {
        Employ e=new Employ();

    }
}
