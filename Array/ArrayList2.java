package Array;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(92);
        arrayList.add(16);
        arrayList.add(-18);
        arrayList.add(17);
        arrayList.add(-15);
        arrayList.add(14);
        arrayList.add(-13);
        arrayList.add(12);
        arrayList.add(11);

        System.out.println("Before Reverse:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("element at " + i + " index is " + arrayList.get(i));
        }

        ArrayList2 obj = new ArrayList2();
        obj.reverseArrayList(arrayList);
        obj.replaceNegativeNumber(arrayList);
    }

//Reverse an ArrayList without using Collections.reverse().

    public void reverseArrayList(ArrayList<Integer> list) {
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);

            start++;
            end--;
        }
        System.out.println("\nAfter Reverse:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("element at " + i + " index is " + list.get(i));
        }
    }
   // Replace all negative numbers with 0.
    public void replaceNegativeNumber(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)<0){
                list.set(i,0);
            }
        }
        System.out.println("\n After Replace");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("element at " + i + " index is " + list.get(i));
        }
    }
}
