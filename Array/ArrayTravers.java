package Array;

public class ArrayTravers {
    public static void main(String[] args) {
        ArrayTravers obj=new ArrayTravers();

        int[] arr = {5, 10, 15,22,45,20,65,23};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        obj.sumOfArray(arr);
        obj.SumOfEven(arr,n);
        obj.maxElement(arr,n);
    }
    public void sumOfArray(int[] arr){
        int sum=0;
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        System.out.println("sum :"+sum);

    }
    public void SumOfEven(int arr[],int n){
        int esum=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]%2==0){
                System.out.println("The even numbers are :"+arr[i]);
                esum+=arr[i];
            }
        }
        System.out.println("Sum of even number :"+esum);

    }
    //max element
    public void maxElement(int []arr,int n){
        int max=arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The max Element in Array :"+max);
    }
}
