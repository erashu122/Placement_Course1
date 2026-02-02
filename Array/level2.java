package Array;

import java.util.Arrays;

public class level2 {
    public static void main(String[] args) {
        level2 obj=new level2();
        int[] arr = {10, 20, 30, 40, 50};
        obj. reverseArray(arr);
        obj.secondLargest(arr);



    }
    public void reverseArray(int arr[]){
        int start=0;
        int end =arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public void secondLargest(int []arr){
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                smax=max;
                max=arr[i];
            } else if (arr[i]>smax && arr[i]!=max) {
                smax=arr[i];

            }
        }
        if (smax==Integer.MIN_VALUE){
            System.out.println("Second largest element does not exist");
        }else {
            System.out.println("Second largest element is: " + smax);
        }
    }
}
