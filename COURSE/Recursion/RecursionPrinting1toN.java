package COURSE.Recursion;

import java.util.Scanner;

public class RecursionPrinting1toN {
    static void print1toN(int n){
        if (n == 0) {
            return;
        }
        print1toN(n-1);
        System.out.println(n);
    }

    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int m=sc.nextInt();
        print1toN(m);
    }

}
