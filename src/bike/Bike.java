package bike;

public class Bike {

    public String isOn(String on) throws Exception {
        if (on == "on") {
            System.out.println("Bike is on");
        }
        else {
            throw new Exception("Enter the right on");
        }
        return on;
    }


    public String isOff(String off) throws Exception {
        if (off == "off") {
            System.out.println("Bike is off");
        }
        else {
            throw new Exception("Off properly");
        }
        return off;
    }

    public int accelerateGearOne(int gear , int speedLimit ) throws Exception {
        if(gear == 1){
            System.out.println("Hello you are on gear one");
        }
        else{
            throw new Exception("Not on gear  1");
        }

        if (speedLimit >= 0 && speedLimit <= 20){
            speedLimit++;
        }

        if (speedLimit >= 21 && speedLimit <= 30){
            speedLimit+=2;
            System.out.println("you are on gear two");
        }

        if (speedLimit >= 31 && speedLimit <= 40){
            speedLimit+=3;
            System.out.println("you are on gear three");
        }

        if (speedLimit >= 41){
            speedLimit+=4;
            System.out.println("you are on gear four");
        }
        return speedLimit;
    }


    public int accelerateGearTwo(int gear , int speedLimit ) throws Exception {
        if(gear == 2){
            System.out.println("Hello you are on gear Two");
        }
        else{
            throw new Exception("Not on gear  2");
        }

        if (speedLimit >= 21 && speedLimit <= 30){
            speedLimit+=2;
        }

        if (speedLimit >= 0 && speedLimit <= 20){
            speedLimit++;
            System.out.println("you are on gear one");
        }

        if (speedLimit >= 31 && speedLimit <= 40){
            System.out.println("you are on gear three");
            speedLimit+=3;
        }

        if (speedLimit >= 41){
            speedLimit+=4;
            System.out.println("you are on gear four");
        }
        return speedLimit;
    }

    public int accelerateGearThree(int gear , int speedLimit ) throws Exception {
        if(gear == 3){
            System.out.println("Hello you are on gear Three");
        }
        else{
            throw new Exception("Not on gear  3");
        }

        if (speedLimit >= 31 && speedLimit <= 40){
            speedLimit+=3;
        }

        if (speedLimit >= 0 && speedLimit <= 20){
            speedLimit++;
            System.out.println("You are already on gear one");
        }

        if (speedLimit >= 21 && speedLimit <= 30){
            speedLimit+=2;
            System.out.println("You are already on gear two");
        }

        if (speedLimit >= 41){
            speedLimit+=4;
            System.out.println("you are already on gear four");
        }
        return speedLimit;
    }

    public int accelerateGearFour(int gear , int speedLimit ) throws Exception {
        if(gear == 4){
            System.out.println("Hello you are on gear Four");
        }
        else{
            throw new Exception("Not on gear  4");
        }

        if (speedLimit >= 41){
            speedLimit+=4;
        }
        if (speedLimit >= 0 && speedLimit <= 20){
            speedLimit++;
            System.out.println("You are already in gear one");
        }

        if (speedLimit >= 21 && speedLimit <= 30){
            speedLimit+=2;
            System.out.println("You are already in gear two");
        }

        if (speedLimit >= 31 && speedLimit <= 40){
            speedLimit+=3;
            System.out.println("You are already in gear three");
        }
        return speedLimit;
    }



    public int decelerateGearOne(int gear , int speedLimit ) throws Exception {
        if(gear == 1){
            System.out.println("Hello you are on gear one");
        }
        else{
            throw new Exception("Not on gear  1");
        }

        if (speedLimit >= 0 && speedLimit <= 20){
            speedLimit--;
        }

        if (speedLimit >= 21 && speedLimit <= 30){
            System.out.println("you are now on gear two");
            speedLimit-=2;
        }

        if (speedLimit >= 31 && speedLimit <= 40){
            speedLimit-=3;
            System.out.println("you are now on gear three");
        }

        if (speedLimit >= 41){
            speedLimit-=4;
            System.out.println("you are now on gear four");
        }
        return speedLimit;
    }


    public int decelerateGearTwo(int gear , int speedLimit ) throws Exception {
        if(gear == 2){
            System.out.println("Hello you are on gear two");
        }
        else{
            throw new Exception("Not on gear  2");
        }

        if (speedLimit >= 0 && speedLimit <= 20){
            speedLimit--;
        }

        if (speedLimit >= 0 && speedLimit <= 20){
            speedLimit--;
            System.out.println("you are now on gear one");
        }

        if (speedLimit >= 31 && speedLimit <= 40){
            System.out.println("you are now on gear three");
            speedLimit-=3;

        }

        if (speedLimit >= 41){
            speedLimit-=4;
            System.out.println("you are now on gear four");
        }
        return speedLimit;
    }


    public int decelerateGearThree(int gear , int speedLimit ) throws Exception {
        if(gear == 3){
            System.out.println("Hello you are on gear three");
        }
        else{
            throw new Exception("Not on gear  3");
        }

        if (speedLimit >= 31 && speedLimit <= 40){
            speedLimit-=3;
        }

        if (speedLimit >= 0 && speedLimit <= 20){
            speedLimit--;
            System.out.println("you are now on gear one");
        }

        if (speedLimit >= 21 && speedLimit <= 30){
            speedLimit-=2;
            System.out.println("you are now on gear two");
        }

        if (speedLimit >= 41){
            speedLimit-=4;
            System.out.println("you are now on gear four");
        }
        return speedLimit;
    }


    public int decelerateGearFour(int gear , int speedLimit ) throws Exception {
        if(gear == 4){
            System.out.println("Hello you are on gear four");
        }
        else{
            throw new Exception("Not on gear  4");
        }

        if (speedLimit >= 41){
            speedLimit-=4;
        }

        if (speedLimit >= 0 && speedLimit <= 20){
            System.out.println("you are now on gear one");
            speedLimit--;
        }

        if (speedLimit >= 21 && speedLimit <= 30){
            speedLimit-=2;
            System.out.println("you are now on gear two");
        }

        if (speedLimit >= 31 && speedLimit <= 40){
            speedLimit-=3;
            System.out.println("you are now on gear three");
        }
        return speedLimit;
    }
}

