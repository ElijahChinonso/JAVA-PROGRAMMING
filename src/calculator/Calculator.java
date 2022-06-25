package calculator;

public class Calculator {

    public int addTwoNumbers(int fNumber, int sNumber){
        int sum = fNumber + sNumber;
        System.out.println("The result is:" + sum);
        return sum;
    }
    ///

    public int subTwoNumbers(int fNumber, int sNumber){
        int sub = fNumber - sNumber;
        System.out.println("The result is:" + sub);
        return sub;
    }

    public int mulTwoNumbers(int fNumber, int sNumber){
        int mul = fNumber * sNumber;
        System.out.println("The result is:" + mul);
        return mul;
    }
    public int divTwoNumbers(int fNumber, int sNumber){
        int div = fNumber / sNumber;
        System.out.println("the result is:" + div);
        return div;
    }
}
