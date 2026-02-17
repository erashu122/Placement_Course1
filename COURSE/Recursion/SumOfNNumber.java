package COURSE.Recursion;

public class SumOfNNumber {
    static int SumOfN(int n){
        if (n == 0) {
            return 0;
        }
        return n+SumOfN(n-1);

    }

    public static void main(String []arg){
        System.out.println(SumOfN(10));
    }
}
