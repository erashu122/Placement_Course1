package COURSE.Recursion;

public class RecursionExamplePrintingNto1 {

    static void PrintNumber(int n){
        if (n==0){
            return;
        }
        System.out.println(n+" ");
        PrintNumber(n-1);


    }

     static void main() {
        PrintNumber(10);
    }
}
