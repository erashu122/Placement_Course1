package Array;

public class ArrayWithShifting {
    public static void main(String[] args) {
        ArrayWithShifting obj=new ArrayWithShifting();
        int arr[] = new int[4];
        arr[0]=2;
        arr[1]=3;
        arr[2]=4;
        arr[3]=6;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index "+ i+ " is "+arr[i]);
        }
        obj.insertWithsift(arr,9,2);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index after insert"+ i+ " is "+arr[i]);
        }
        obj.deletWithshift(arr,2);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index after deletion"+ i+ " is "+arr[i]);
        }


    }
    public void insertWithsift(int arr[],int element ,int index){
        int len=arr.length;
        if (index<0 || index>=len){
            System.out.println("index out of bond ");
            return;
        }
        for (int i = len-2; i >=index ; i--) {
            arr[i+1]=arr[i];
            
        }
        arr[index]=element;
    }
    public void deletWithshift(int arr[],int index){
        int len=arr.length;
        if (index<0 || index>=len){
            System.out.println("index out of bond ");
            return;
        }
        for (int i = index+1; i <len ; i++) {
            arr[i-1]=arr[i];
        }
        arr[len-1]=0;
    }
}
