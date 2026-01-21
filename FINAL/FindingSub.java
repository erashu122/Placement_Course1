package FINAL;

public class FindingSub {
    public static void main(String [] args){
        String email="ashutoshkumar@gmail.com";
        int m=email.lastIndexOf('@');
        int n=email.lastIndexOf('.');
        System.out.print(email.substring(m+1,n));
    }
}
