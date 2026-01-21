public class twosum {
    public static void main(String[] args) {
        int [] arr={12,34,23,5,3};
        int target =39;
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (target==arr[i]+arr[j]){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
