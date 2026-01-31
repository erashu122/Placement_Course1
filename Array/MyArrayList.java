package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayList {
    public static void main(String[] args) {
        MyArrayList obj=new MyArrayList();
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(23);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(73);
        arrayList.add(93);
        arrayList.add(25);
        arrayList.add(27);
        arrayList.add(29);

        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter number of elements: ");
        int s = arrayList.size();
//
//        for (int i = 0; i <s; i++) {
//            System.out.print("element no "+ i+ ": ");
//            arrayList.add(sc.nextInt());
//        }

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

    //Count how many even and odd numbers are present.
        int count1=0;
        int count2=0;

        for (int i = 0; i < s; i++) {
            if (arrayList.get(i)%2==0){
                count1 =count1+1;
            }else {
                count2=count2+1;
            }

        }
        System.out.println("the even numbers are : "+count1);
        System.out.println("the odd numbers are :"+count2);

        //Search an element entered by user and print its index (or -1 if not found).
        System.out.println("Enter the element what you want :");
        int elm=sc.nextInt();
        obj.searchElement(arrayList,elm);
        obj.deleteven(arrayList);


    }
    public void searchElement(ArrayList<Integer>list,int elm ){
        int index=-1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)==elm){
                index=i;
                break;

            }
        }
        if (index!=-1){
            System.out.println("Element found at index: " +index);
        }else {
            System.out.println("-1(Element is not found)");
        }
    }
    public void deleteven(ArrayList<Integer>list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2==0){
                list.remove(i);
            }
        }
        System.out.println("after removing ALL even element ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("element at "+i+ " index is "+list.get(i));
        }
    }

}
