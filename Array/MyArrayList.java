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

        //Find the sum of all elements in an ArrayList.
        int sum=0;
        for (int i = 0; i < s; i++) {
            sum=sum+ arrayList.get(i);

        }
        System.out.println("the sum of element is : " + sum);


        //Find the largest and smallest element in an ArrayList.

        int larg=0;
        for (int i = 0; i < s; i++) {
            if (larg<= arrayList.get(i)){
                larg=arrayList.get(i);
            }

        }
        System.out.println("the large number is : "+larg);

        int small=arrayList.get(0);
        for (int i = 1; i < s; i++) {
            if (small>= arrayList.get(i)){
                small=arrayList.get(i);
            }

        }
        System.out.println("the smallest number is : "+small);

    }
}
