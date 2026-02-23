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

    // with modulus
    public void FindDigitsUsingDivision(int num){
        if (num<0){
            num=num*-1;
        }
        try{
            if (num==0){
                System.out.println("Enter the spasfic number !");
            }
        }catch (Exception e){
            System.out.println(e);
        }
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("Number of digit :"+count);
    }

    //append the digit
    public void AppendDigit(int num,int digit){
        int append=num*10+digit;
        System.out.println("your number after the append digit :"+append);
    }
    static void main() {
        DigitManipulation di=new DigitManipulation();
//        di.findDigitUsingFormula(0);
//        di.FindDigitsUsingDivision(0);
        di.AppendDigit(12345,3);
    }
}
