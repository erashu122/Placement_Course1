package Array;

public class ArrayClass2 {
    public static void main(String[] args) {
        ArrayClass2 obj=new ArrayClass2();
        int [] arr={12,23,45,67,89,34,56};
        obj.printElement(arr);
        obj.SumOfOdd(arr);
        obj.minElement(arr);
    }
    public void printElement(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The Element is : "+arr[i]);
        }
    }
    public void SumOfOdd(int []arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0){
                System.out.println("the odd number is  :" +arr[i]);
                sum+=arr[i];
            }
        }
        System.out.println("Sum of Odd number :"+sum);
    }
    public void minElement(int []arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The minimum Element is :"+min);
    }

}
