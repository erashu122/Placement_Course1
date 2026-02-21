package OOPS.ExpraacionHandling;

import java.util.Scanner;

public class TryCatchExample {
    public int getUserInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int val=0;
        try{
            val=sc.nextInt();
        }
        catch (Exception e){
            System.out.println("failed :"+e);
        }
        return val;
    }

    static void main() {
        TryCatchExample t=new TryCatchExample();
        int value=t.getUserInput();
        System.out.println("your input Value is :"+value);
    }

}
