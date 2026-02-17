package COURSE.Recursion;

public class ReverseANumber {
    static void  reverse(int n){
        if (n==0){
            return ;
        }
        System.out.print(n%10);
        reverse(n/10);
    }

    static void main() {
        reverse(1234);
    }
}
