import java.util.*;
public class OddBalloon{
	public static void main (String []args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String [] ballons=new String[n];
		
		for(int i=0;i<n;i++){
			ballons[i]=sc.next();
		}
		Map<String,Integer>countMap=new LinkedHashMap<>();
		
		for (String colour :ballons){
			countMap.put(colour,countMap.getOrDefault(colour,0)+1);
		}
		boolean foundOdd=false;
		for (String colour :countMap.keySet()){
			if (countMap.get(colour)%2!=0){
				System.out.println("OddBalloon :" +colour);
				foundOdd=true;
				break;
			}
		}
		if (!foundOdd){
			System.out.println("All are even");
		}
		sc.close(); 
	}
}