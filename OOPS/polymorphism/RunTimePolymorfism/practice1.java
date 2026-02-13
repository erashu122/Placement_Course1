package OOPS.polymorphism.RunTimePolymorfism;

class Battery{
    Battery(){
        System.out.println("Device battery ");
    }
}
class LithiumIon extends Battery{
    LithiumIon(){
        System.out.println("LithiumIon Battery");
    }
}

class device{
    void charge(){
        System.out.println("Device is charging.....");
    }
    Battery battery(){
        return new Battery();
    }
}
class phone extends device{
    @Override
    void charge(){
        System.out.println("Phone is charging....");
    }
    @Override
    LithiumIon battery(){
        return new LithiumIon();
    }
}
class Laptop extends device{
    @Override
    void charge(){
        System.out.println("Laptop have one type charger like pin ....");
    }
}
class watch extends device{
    @Override
    void charge(){
        System.out.println("Watch have wireless charger .....");
    }
}
public class practice1 {
    static void main() {
        device d ;
        d=new Laptop();
        d.charge();
        d.battery();
        d=new phone();
        d.charge();
        d.battery();
        d=new watch();
        d.charge();
        d.battery();
    }
}
