package FINAL;

public class UseOfStringDotFormet {
    public static void main(String[] args) {
        double num=123.121;
        String address="bishunpura";
        String ashu=String.format("number is %f address is %s",num,address);
        System.out.println(ashu);
    }
}
