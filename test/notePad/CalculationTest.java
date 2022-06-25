package notePad;

public class CalculationTest {

    public static void main(String[] args){

        Calculation ways = new Calculation();

        int aResult = ways.addNumber(5,4);
        System.out.println(aResult);

        int sResult = ways.subtractNumber(3,6);
        System.out.println(sResult);

        int dResult = ways.divideNumber(2,7);
        System.out.println(dResult);

        int mResult = ways.multiplyNumber(9,3);
        System.out.println(mResult);
    }
}