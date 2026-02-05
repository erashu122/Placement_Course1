package Array.DAY2;

public class linerSearch {
    public static void main(String [] args) {
        int [] arr={12,34,2,35,67,4};
        int target=35;
        linearSearch(arr,target);

    }
    public static void linearSearch(int[] arr, int target) {

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }

}
