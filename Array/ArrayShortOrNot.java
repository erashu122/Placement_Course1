package Array;

public class ArrayShortOrNot {
    public static void main(String []args){
        int [] arr={1,2,3,4,7,6};
        if (arr.length==1){
            System.out.println("Array is alwas short ");
        }else {
            boolean shot=true;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i]>arr[i+1]){
                    shot=false;
                    break;
                }
            }
            if (shot==true){
                System.out.println("Array is shorted");
            }else {
                System.out.println("Array is not shorted");
            }

        }
    }
}
