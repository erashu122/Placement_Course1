public class TreeSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,-2,-3};
        int target=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length  ; j++) {
                for (int k = j+1; k <arr.length ; k++) {
                    if (arr[i]+arr[j]+arr[k]==target){
                        System.out.println(i+" "+j+" "+k);
                    }

                }
            }
        }
    }
}
