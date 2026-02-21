package OOPS.ExpraacionHandling;

import java.util.Scanner;

public class multiTryCatchBlock {
    public static void main(String abs[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        try{
            int val=sc.nextInt();
            System.out.println("your number is :"+val);

            int [] arr={2,3,4,5};
            System.out.println(arr[3]);

            System.out.println(5/3);
        }
        catch (Exception e){
            System.out.println("all are in this chatch :"+e);
        }
//        catch (IndexOutOfBoundsException e){
//            System.out.println(" write the correct index :"+e);
//        }
//        catch (ArithmeticException e){
//            System.out.println("given number is Mathematically wrong ");
//        }
    }
}
