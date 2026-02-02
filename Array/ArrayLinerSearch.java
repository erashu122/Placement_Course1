package Array;

import java.util.Scanner;

public class ArrayLinerSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayLinerSearch obj=new ArrayLinerSearch();
        System.out.print("Enter the size of Array :");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element number "+i+ " :");
            arr[i]=sc.nextInt();
        }
        obj.printElement(arr,n);
        obj.LinerSearch(arr,n);
        obj.countNumber(arr,n);

    }

    public void printElement(int[] arr,int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("The Element is :"+arr[i]);
        }
    }

    public void LinerSearch(int []arr,int n){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter yor Target Element :" );
        int target=sc.nextInt();
        boolean found =false;
        for (int i = 0; i < n; i++) {
            if (target==arr[i]){
                System.out.println("Element found at index: " + i);
                found =true;
                break;
            }
        }
        if (found==false){
            System.out.println("Element is not found ");
        }
    }
    public void countNumber(int [] arr,int n){
        int odd=0;
        int even=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Number of odd numbers in array is : "+odd);
        System.out.println("Number of even numbers in array is : "+even);
    }
}
