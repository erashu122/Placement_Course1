package OOPS.multipleInheritance;

interface e {
    static void display() {
        System.out.println("Interface A");
    }
}

class d implements e {
}

public class Practice4 {
    public static void main(String[] args) {
        e.display();
    }
}
