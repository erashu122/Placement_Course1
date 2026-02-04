package Array.DAY2;


import java.util.Arrays;

import static Array.DAY2.selectionSort.swap;

public class bubbleSort {
    public static void main(String[] args) {
        int [] arr={1,16,17,15,14,4};
        for (int i = 0; i < arr.length; i++) {
            int flag=0;
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    flag=1;
                }
            }
            if (flag==0){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
