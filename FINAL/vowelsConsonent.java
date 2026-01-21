package FINAL;

import java.util.Scanner;

public class vowelsConsonent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name : ");
        String name=sc.nextLine().toLowerCase();
        for (int i=0;i<=name.length();i++){
            char ch=name.charAt(i);
            if (ch>='a' && ch<='z' || ch==' '){
                if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    System.out.println("hii vowel: "+ch);
                } else if (ch==' ') {
                    System.out.println("This is the space character");

                } else {
                    System.out.println("hii Consonant: "+ch);
                }
            }
            else System.out.println("invalid character ");
        }

    }
}
