/* Q1. Problem Statement —
Given a string S consisting of the characters '*' and '#'.
The length of the string is variable.
You need to find the difference between the number of * and the number of # in the string.
➕ If number of * > number of #, output should be positive integer
➖ If number of # > number of *, output should be negative integer
0️⃣ If both are equal, output should be 0 */

import java.util.*;
public class countstar{
	public static void main (String []args){
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		int Starcount=0;
		int hashcount=0;
		for(int i=0;i<input.length();i++){
			char ch=input.charAt(i);
			if(ch=='*') Starcount++;
			else if (ch=='#') hashcount++;
			
		}
		int count=Starcount-hashcount;
		System.out.println(count);
		
	}
}