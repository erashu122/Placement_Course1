package Array.DAY2;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={1,5,3,6,2,4,3};
        shortArray(arr);
        binarySearch(arr);


    }
    public static void shortArray(int []arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j <arr.length-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void binarySearch(int []arr){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Target Element :");
        int target=sc.nextInt();
        int low=0;
        int high=arr.length-1;
        boolean found= false;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            }else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }
}
