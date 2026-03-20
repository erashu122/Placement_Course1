package MathINJava;
import java.util.*;


public class tcsqustion {
    static void main (String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while (temp>0){
            sum+=temp%10;
            temp/=10;
        }
        if (num%sum==0){
            System.out.println("good number ");
        }else {
            System.out.println("bad number");
        }

        sc.close();
    }
}
