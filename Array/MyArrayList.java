package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int s = sc.nextInt();

        for (int i = 0; i <s; i++) {
            System.out.print("element no "+ i+ ": ");
            arrayList.add(sc.nextInt());
        }

        for (int i = 0; i < s; i++) {
            System.out.println("element at "+i+ " index is "+arrayList.get(i));
        }

        int sum=0;
        for (int i = 0; i < s; i++) {
            sum=sum+ arrayList.get(i);

        }
        System.out.println("the sum of element is : " + sum);


    }
}
