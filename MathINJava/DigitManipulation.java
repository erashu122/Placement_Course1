package MathINJava;

public class DigitManipulation {
    public void findDigitUsingFormula(int num){
        int res=(int)Math.log10(num)+1;
        System.out.println("Number of Digit :"+res);
    }
    static void main() {
        DigitManipulation di=new DigitManipulation();
        di.findDigitUsingFormula(12345);
    }
}
