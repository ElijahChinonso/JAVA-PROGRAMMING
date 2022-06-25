package notePad;

public class Account {
    private String firstName;
    private String lastName;
    private int age;
    private String  amount;

    public static void main(String[] args){
    }

    public Account(){}
    public Account(String firstName, String lastName, int age, String amount){

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.amount = amount;
    }


    public int withdraw (int amount){
        if(amount < 0){
            System.out.print("Amount can not be less than 0");
        }
        if(amount > 0){
            System.out.print("Successful");
        }
        return amount;
    }

    public int sendAmount(int debitAmount){
        if(debitAmount < 0){
            System.out.print("Insufficient balance");
        }
        if(debitAmount > 0){
            System.out.print("Deposit successful");
        }
        return debitAmount;
    }
}