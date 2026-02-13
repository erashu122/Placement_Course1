package OOPS;

interface print{
    void print (String document);
    void swithOn();
}

interface  scan{
    void scan(String document);
    void swithOn();
}

class page implements print,scan{
    @Override
    public void print(String document) {
        System.out.println("print the page "+document);
    }
    @Override
    public void scan(String document){
        System.out.println("scan the page :"+document);
    }
    @Override
    public void swithOn(){
        System.out.println("Switch is on ");
    }
}

public class MultipleInheritanceUsingInheritance {
    static void main() {
        /* in multiple inheritance only making the object bye
         the children class not use the int interface*/
        page p=new page();
        p.swithOn();
        p.print("pg.pdf");
        p.scan("pg.pdf");
    }
}
