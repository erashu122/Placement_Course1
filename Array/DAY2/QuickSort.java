package Array.DAY2;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {12, 34, 78, 65, 45, 33};
        quickSort(arr, 0, arr.length - 1);
        for (int v : arr) {
            System.out.print(v + " ");
        }
    }

    public static void quickSort(int[] arr, int lb, int ub) {
        if (lb < ub) {
            int p = partition(arr, lb, ub);
            quickSort(arr, lb, p - 1);
            quickSort(arr, p + 1, ub);
        }
    }

    public static int partition(int[] arr, int lb, int ub) {
        int pivot = arr[ub];
        int i = lb - 1;
        for (int j = lb; j < ub; j++) {
            if (arr[j] <= pivot) {
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        int tmp = arr[i + 1];
        arr[i + 1] = arr[ub];
        arr[ub] = tmp;
        return i + 1;
    }
}
