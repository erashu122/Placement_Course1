package FINAL;

import java.sql.SQLOutput;
import java.util.Locale;

public class StringToCharArray {
    public static void main(String[] args) {
        String str="Ashutosh kumar pandit";
        char ch[]=str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]+" ");
        }
        System.out.println( );
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(5));
        System.out.println(str.indexOf('t'));
        System.out.println(str.length());
        System.out.println(str.lastIndexOf('t'));
    }
}
