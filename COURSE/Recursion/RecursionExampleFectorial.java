package COURSE.Recursion;

public class RecursionExampleFectorial {

    static int factorial(int n){
        if (n==0){    //Base Case
            return 1;
        }
        return n* factorial(n-1);  //recursive call
    }

    static void main() {
        System.out.println(factorial(5));
    }
}
