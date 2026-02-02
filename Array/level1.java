package Array;

public class level1 {
    public static void main(String[] args) {
        level1 asu=new level1();
        int []arr={3,7,2,9};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        asu.sumOfArray(arr);
        asu.maxMin(arr);
    }

    private void sumOfArray(int[] arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];

        }
        System.out.println("sum of Array :"+sum);
    }
    public void maxMin(int [] arr){
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max ){
                max=arr[i];

            }else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
