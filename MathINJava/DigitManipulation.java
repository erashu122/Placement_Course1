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
    //when the digit is mor then one digit
    public void AppendDigitMoreThen1(int num,int digit){
        boolean isNeg=false;
        if (num<0){
            isNeg=true;
            num=-1*num;
        }
        int d=1;
        int temp=digit;
        while (temp>0){
            temp/=10;
            d=d*10;
        }

        int append=num*d+digit;
        if (isNeg){
            append=-1*append;
        }
        System.out.println("your number after the append digit :"+append);


    }

    //insert at front of the number
    public void InsertAtFront(int num,int digit){
        int digits=1;
        if (num > 0) {
            digits=(int)Math.log10(num)+1;
        }

        int insert=digit*(int)Math.pow(10,digits)+num;
        System.out.println(insert);

    }

    public  void ReverseNumber(int num){
        int res=0;
        while (num>0){
             int digit=num%10;
            res=res*10+digit;
            num=num/10;
        }
        System.out.println(res);
    }
    static void main() {
        DigitManipulation di=new DigitManipulation();
//        di.findDigitUsingFormula(0);
//        di.FindDigitsUsingDivision(0);
//        di.AppendDigit(12345,3);
//        di.AppendDigitMoreThen1(-123,12);
//        di.InsertAtFront(0,3);
        di.ReverseNumber(1234);
    }
}
