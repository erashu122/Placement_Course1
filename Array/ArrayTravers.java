package Array;

public class ArrayTravers {
    public static void main(String[] args) {
        ArrayTravers obj=new ArrayTravers();

        int[] arr = {5, 10, 15};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        obj.sumOfArray(arr);
    }
    public void sumOfArray(int[] arr){
        int sum=0;
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        System.out.println("sum :"+sum);

    }
}
