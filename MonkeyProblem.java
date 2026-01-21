import java.util.*;
public class MonkeyProblem{
	public static void main (String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of monkey :");
		int n=sc.nextInt();
		System.out.print("Enter the number of bananas :");
		int m=sc.nextInt();
		System.out.print("Enter the number of peanuts :");
		int p=sc.nextInt();
		System.out.print("bananas eating by the monkey :");
		int k=sc.nextInt();
		System.out.print("peanuts eating by the monkey:");
		int j=sc.nextInt();
		
		int bananamonkey=m/k;
		int peanutMonkey=p/j;
		
		int leftoverBananas=m%k;
		int leftoverPeanuts=p%j;
		
		int extraMonky=(leftoverBananas+leftoverPeanuts>0)?1:0;
		
		int fedMonkeys=bananamonkey+peanutMonkey+extraMonky;
		if(fedMonkeys>n) fedMonkeys=n;
		
		int remaining=n-fedMonkeys;
		System.out.println("remaining monkey :"+remaining);
		
		sc.close();
		
		 
	}
}