package MathINJava;
import java.util.*;

public class tcsQustion2 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        Set<Character> set=new HashSet<>();
        for (char ch:str2.toCharArray()){
            set.add(ch);
        }
        int coutn=0;
        for (char ch:str1.toCharArray()){
            if (set.contains(ch)){
                coutn++;
            }
        }
        System.out.println(coutn);
        sc.close();

    }
}
