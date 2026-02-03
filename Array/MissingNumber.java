package Array;

public class MissingNumber {
    public static void main(String[] args) {
        int [] arr={2,0,1,4};
        int asum=0;
        int esum=0;
        for (int i = 0; i < arr.length; i++) {
             asum+=arr[i];
        }
        for (int i = 0; i <=arr.length; i++) {
            esum+=i;
        }
        int missingNumber=esum-asum;
        System.out.println("Missing Number is :"+missingNumber);

    }
}
