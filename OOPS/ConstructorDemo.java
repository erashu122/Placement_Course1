package OOPS;


class Vehicle{
    String model;
    private int speed;
    void accelerate(int delta){
        speed+=delta;
    }
    Vehicle(){
        model="ford";
        speed=100;
    }
    Vehicle(String model,int speed){
        this.model=model;
        this.speed=speed;
    }
    Vehicle(Vehicle that){
        this.model=that.model;
        this.speed=that.speed;
    }
    int getSpeed(){
        return speed;
    }
}
public class ConstructorDemo {
    static void main() {
        //default constructor
        Vehicle v=new Vehicle();
        System.out.println("Default "+v.getSpeed());

        //parameterized constructor
        Vehicle v1=new Vehicle("suzuci",90);
        System.out.println("Parameterize "+ v1.getSpeed()+" model "+ v1.model);

        //copy constructor
        Vehicle v2=new Vehicle(v1);
        System.out.println("copy "+v2.getSpeed());

    }
}
