package FINAL;

import java.util.Scanner;

public class PlayWithString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String word1=sc.next();
        System.out.println("Enter a word please ");
        String word2=sc.next();

        System.out.println("Enter a line");
        String line1=sc.nextLine();
        System.out.println("Enter a word please ");
        String line2=sc.nextLine();

        System.out.println("word1:"+word1+",");
        System.out.println("word2:"+word2+",");
        System.out.println("line1:"+line1+",");
        System.out.println("line2:"+line2+",");
    }

}
