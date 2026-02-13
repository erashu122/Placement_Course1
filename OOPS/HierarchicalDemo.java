package OOPS;
class Appliance{
    void switchOn(){
        System.out.println("Appliance is turned on");
    }
}
class Fan extends Appliance{
    void rotate(){
        System.out.println("Fan is rotating");
    }
}
class light extends Appliance{
    void glow(){
        System.out.println("light is glowing ");
    }
}
public class HierarchicalDemo {
    static void main() {
        Fan f=new Fan();
        f.switchOn();
        f.rotate();
        light l=new light();
        l.glow();
    }
}
