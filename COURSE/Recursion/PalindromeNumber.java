package COURSE.Recursion;

import java.util.Scanner;

public class PalindromeNumber {

    static int reverse(int n,int rev){
        if (n==0){
            return rev;
        }
        return reverse(n/10,rev*10+n%10);
    }

    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Original Number :");
        int original=sc.nextInt();
        int reversed=reverse(original,0);

        if (original==reversed){
            System.out.println("Palindrome");
        }
        else System.out.println("Not Palindrome");

    }
}