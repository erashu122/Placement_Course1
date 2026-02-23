package MathINJava;

public class DigitManipulation {
    //this is the solving the number of digit using
    // formula and its time complexity is constant
    public void findDigitUsingFormula(int num){
        if (num==0){
            System.out.println("number of digit :"+1);
            return;
        }
        if (num<0){
            num=-1*num;
        }
        int res=(int)Math.log10(num)+1;
        System.out.println("Number of Digit :"+res);
    }

    public void FindDigitsUsingDivision(int num){
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("Number of digit :"+count);
    }
    static void main() {
        DigitManipulation di=new DigitManipulation();
        di.findDigitUsingFormula(0);
    }
}
