package FINAL;
import java.util.*;


public class LoopTest1 {
    public static void main(String[] args) {

        char ch = 'e';
        while(ch=='e'){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number :");
            int num=sc.nextInt();
            int count =0;
            while (num != 0){

                num=num/2;
                count++;

                if (num % 2==0){
                    continue;
                }

                if (count>=5){
                    break;
                }
                System.out.println("Number ="+num +" count ="+count);
            }
            System.out.println("Loop Ended");
            System.out.println("Final Number="+num);
            System.out.println("Total Devisions ="+count);

        }

    }
}
