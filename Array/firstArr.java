package Array;

import java.util.Scanner;

public class firstArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of Array :");
        int s=sc.nextInt();
        int [] arr=new int[s];

        for (int i = 0; i <s; i++) {
            System.out.print("enter the element no "+i+" :");
            arr[i]=sc.nextInt();
        }

        System.out.print("The element are : ");
        for (int i = 0; i < s; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
