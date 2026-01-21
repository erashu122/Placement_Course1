import java.util.*;
public class main{
 public static void main (String args[]){
	 Scanner sc=new Scanner(System.in);
	 String input=sc.nextLine();
	 String[] s=input.split(" ");
	 ArrayList<Integer> arr=new ArrayList<>();
	 
	 for (String token:s){
		 int num=Integer.parseInt(token);
		 arr.add(num);
		 
	 }
	 for (int i:arr){
		 System.out.print(i+" ");
	 }
 }
}