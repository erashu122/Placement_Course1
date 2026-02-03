package Array;

public class FrequencyCount {
    public static void main(String[] args) {
        int []arr={1,2,3,2,4,3,1,4};

        for (int i = 0; i < arr.length; i++) {
            boolean alreadyCount=false;
            for (int j = 0; j < i; j++) {
                if (arr[j]==arr[i]){
                    alreadyCount=true;
                    break;
                }
            }
            if (alreadyCount){
                continue;
            }
            int count=0;
            for (int k = 0; k < arr.length; k++) {
                if (arr[i]==arr[k]){
                    count++;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times");
        }

    }
}
