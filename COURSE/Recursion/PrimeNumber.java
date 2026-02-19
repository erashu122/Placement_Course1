package COURSE.Recursion;

import java.util.Scanner;

public class PrimeNumber {
    static boolean primeNumber(int n,int i){
        if (n<=1){
            return false;
        }
        if (i*i>n){
            return true;
        }
        if (n%i==0){
            return false;
        }
        return primeNumber(n,i+1);
    }

    static void main() {
        Scanner sc=new Scanner(System.in);
        char ch='e';
        while( ch=='e'){
            System.out.print("Enter a number ");
            int m=sc.nextInt();
            boolean flage=primeNumber(m,2);
            if (flage){
                System.out.println("prime number");
            }else {
                System.out.println("it is not a prime number");
            }


        }

    }
}
