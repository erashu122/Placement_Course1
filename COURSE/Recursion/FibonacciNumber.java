package COURSE.Recursion;

public class FibonacciNumber {
    static int Fibonacci(int n){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);


    }

    static void main() {
        int n=10;
        for (int i = 0; i <=n ; i++) {
            System.out.println(Fibonacci(i));
        }


    }
}
