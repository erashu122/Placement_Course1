package OOPS;
class Animal{
    int AnimalLeg=4;
    public void eat(){
        System.out.println("Animal are Eating :");
    }
    public void runing(){
        System.out.println("Animal are runing :");
    }
}
class dog extends Animal{

    public void bark(){
        System.out.println("dog is barking :");
    }
    public void playing(){
        System.out.println("dog is playing with his ower :");
    }
}
class cat extends dog{
    public void mau(){
        System.out.println("cat is doing mau");
    }
}

public class SimpleInheritanceDemo {
    static void main() {
        cat c=new cat();
        System.out.println(c.AnimalLeg);
        c.bark();
        c.mau();
        c.eat();
        c.runing();
        c.playing();


    }
}
