package OOPS;

class Car{
    String model;
    private int speed;
    void accelerate(int delta){
        speed+=delta;
    }
    int getSpeed(){
        return speed;
    }
}
public class ClassDemo {
    public static void main(String[] args){
        //heap memory
        Car car=new Car(); //default constructor
        car.model="honda city";
        car.accelerate(60);
        System.out.println(car.getSpeed());
    }
}
