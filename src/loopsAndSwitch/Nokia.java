package loopsAndSwitch;

import java.util.Scanner;


public class Nokia {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.printf("1. Phone book%n2. Messages%n3. Chat%n4. Call register%n5. Tones%n6. Settings%n" +
                "7. Call divert%n8. Games%n9. Calculator%n10. Reminders%n11. Clock%n12. Profiles%n13. Sim services%n%n");


        System.out.printf("Enter number%n%n");
        int number = input.nextInt();


        switch (number) {
            case 1:
                phoneBook();
                break;
        }

        switch (number){
            case 2:
                message();
                break;
        }

        switch (number){
            case 3:
                System.out.println("Chat");
                break;
        }

        switch (number){
            case 4:
                callRegister();
                break;
        }

        switch (number){
            case 5:
                tones();
                break;
        }

        switch (number){
            case 6:
                settings();
                break;
        }

        switch (number){
            case 7:
                System.out.println("Call divert");
                break;
        }

        switch (number){
            case 8:
                System.out.println("Games");
                break;
        }

        switch (number){
            case 9:
                System.out.println("Calculator");
                break;
        }

        switch (number){
            case 10:
                System.out.println("Reminders");
                break;
        }

        switch (number){
            case 11:
                clock();
                break;
        }

        switch (number){
            case 12:
                System.out.println("Profiles");
                break;
        }

        switch (number){
            case 13:
                System.out.println("SIM services");
                break;
        }
    }

        public static void phoneBook () {
            System.out.printf("1. Search%n2. Service Nos%n3. Add name%n4. Erase%n" +
                    "5. Edit%n6. Assign tone%n7. Send b`card%n8. Options%n9. Speed dials%n10. Voice tags%n%n ");

            System.out.printf("Enter number%n%n");
            int number = input.nextInt();
            switch (number){
                case 1:
                    System.out.println("Search");
                    break;

                case 2:
                    System.out.println("Service Nos");
                    break;

                case 3:
                    System.out.println("Add name");
                    break;

                case 4:
                    System.out.println("Erase");
                    break;

                case 5:
                    System.out.println("Edit");
                    break;

                case 6:
                    System.out.println("Assign tone");
                    break;

                case 7:
                    System.out.println("Send b' card");
                    break;

                case 8:
                    options();
                    break;

                case 9:
                    System.out.println("Speed dials");
                    break;

                case 10:
                    System.out.println("Voice tags");
                    break;
            }
        }

        public static void options () {
            System.out.printf("1. Type of view%n2. Memory status%n%n");

            System.out.printf("Enter number%n%n");
            int number = input.nextInt();

            switch (number){
                case 1:
                    System.out.println("Type of view");
                    break;

                case 2:
                    System.out.println("Memory status");
                    break;
            }
        }

        public static void message(){
            System.out.printf("1. Write messages%n2. Inbox%n3. Outbox%n4. Picture message%n5. Templates%n6. Smileys%n" +
                    "7. Message settings%n8. Info service%n9. Voice mailbox number%n10. Service command number%n%n");

            System.out.printf("Enter number%n%n");
            int number = input.nextInt();

            switch (number){
                case 1:
                    System.out.println("Write message");
                    break;

                case 2:
                    System.out.println("Inbox");
                    break;

                case 3:
                    System.out.println("Outbox");
                    break;

                case 4:
                    System.out.println("Picture message");
                    break;

                case 5:
                    System.out.println("Templates");
                    break;

                case 6:
                    System.out.println("Smileys");
                    break;

                case 7:
                    messageSettings();
                    break;

                case 8:
                    System.out.println("Info service");
                    break;

                case 9:
                    System.out.println("Voice mailbox number");
                    break;

                case 10:
                    System.out.println("Service command number");
                    break;
            }
        }

        public static void messageSettings(){
            System.out.printf("1. Set 1%n2. Common 3%n%n");

            System.out.printf("Enter number%n%n");
            int number = input.nextInt();

            switch (number){
                case 1:
                    set1();
                    break;
            }


            switch (number){
                case 2:
                    common3();
                    break;
            }
        }

        public static void set1(){
            System.out.printf("1. Message centre number%n2. Message sent as%n3. Message validity%n%n");

            System.out.printf("Enter number%n%n");
            int number = input.nextInt();

            switch (number){
                case 1:
                    System.out.println("Message centre number");
                    break;

                case 2:
                    System.out.println("Message sent as");
                    break;

                case 3:
                    System.out.println("Message validity");
                    break;
            }
        }

        public static void common3(){
            System.out.printf("1. Delivery reports%n2. Reply via same centre%n3. Character support%n%n");

            System.out.printf("Enter number%n%n");
            int number = input.nextInt();

            switch (number){
                case 1:
                    System.out.println("Delivery reports");
                    break;

                case 2:
                    System.out.println("Reply via same control");
                    break;

                case 3:
                    System.out.println("Character support");
                    break;
            }
        }

        public static  void callRegister(){
            System.out.printf("1. Missed calls%n2. Received calls%n3. Dialled numbers%n4. Erase recent call list%n" +
                    "5. Show call duration%n6. Show call costs%n7. Call cost settings%n8. Prepaid credit%n%n");

            System.out.printf("Enter number%n%n");
            int number = input.nextInt();

            switch (number) {
                case 1:
                    System.out.println("Missed calls");
                    break;

                case 2:
                    System.out.println("Received calls");
                    break;

                case 3:
                    System.out.println("Dialled numbers");
                    break;

                case 4:
                    System.out.println("Erase recent call list");
                    break;

                case 5:
                    showCallDuration();
                    break;

                case 6:
                    showCallCosts();
                    break;

                case 7:
                    callCostSettings();
                    break;

                case 8:
                    System.out.println("Prepaid credit");
            }
        }

        public static void showCallDuration(){
            System.out.printf("1. Last call duration%n2. All calls' duration%n3. Received calls' duration%n4. Dialled calls' duration%n%n");

            System.out.printf("Enter number%n%n");
            int number = input.nextInt();

            switch (number){
                case 1:
                    System.out.println("Last call duration");
                    break;

                case 2:
                    System.out.println("All calls' duration");
                    break;

                case 3:
                    System.out.println("Received calls' duration");
                    break;

                case 4:
                    System.out.println("Dialled calls' duration");
                    break;
            }
        }

        public static void showCallCosts(){
            System.out.printf("1. Last call cost%n2. All calls' cost%n3. Clear counters%n%n");

            System.out.printf("Enter number%n%n");
            int number = input.nextInt();

            switch (number){
                case 1:
                    System.out.println("Last call cost");
                    break;

                case 2:
                    System.out.println("All calls' cost");
                    break;

                case 3:
                    System.out.println("Clear counters");
                    break;
            }
        }

        public static  void callCostSettings(){
            System.out.printf("1. Call cost limit%n2. Show costs in%n%n");

            System.out.printf("Enter number");
            int number = input.nextInt();

            switch (number){
                case 1:
                    System.out.println("Call cost limit");
                    break;

                case 2:
                    System.out.println("Show cost in");
                    break;
            }
        }

        public static void tones(){
            System.out.printf("1. Ringing tone%n2. Ringing volume%n3. Incoming call alert%n4. Composer%n" +
                    "5. Message alert tone%n6. Keypad tones%n7. Warning and game tones%n8. Vibrating alert%n9. Screen saver%n%n");

            System.out.printf("Enter number%n%n");
            int number = input.nextInt();

            switch (number){
                case 1:
                    System.out.println("Ringing tone");
                    break;

                case 2:
                    System.out.println("Ringing volume");
                    break;

                case 3:
                    System.out.println("Incoming call alert");
                    break;

                case 4:
                    System.out.println("Composer");
                    break;

                case 5:
                    System.out.println("Message alert tone");
                    break;

                case 6:
                    System.out.println("Keypad tone");
                    break;

                case 7:
                    System.out.println("Warning and game tones");
                    break;

                case 8:
                    System.out.println("Vibrating alert");
                    break;

                case 9:
                    System.out.println("Screen saver");
                    break;
            }
        }

        public static void settings(){
            System.out.printf("1. Call settings%n2. Phone settings%n3. Security settings%n4. Restore factory setting%n%n");

            System.out.printf("Enter number%n%n");
            int number = input.nextInt();

            switch (number){
                case 1:
                callSettings();
                break;

                case 2:
                    phoneSetting();
                    break;

                case 3:
                    securitySettings();
                    break;

                case 4:
                    System.out.println("Restore factory setting");
                    break;
            }
        }

        public static void callSettings(){
            System.out.printf("1. Automatic redial%n2. Speed dialling%n3. Call waiting options%n" +
                    "4. Own number sending%n5. Phone line in use%n6. Automatic answer%n%n");

            System.out.printf("Enter number%n%n");
            int number = input.nextInt();

            switch (number){
                case 1:
                    System.out.println("Automatic redial");
                    break;

                case 2:
                    System.out.println("Speed dialling");
                    break;

                case 3:
                    System.out.println("Call waiting option");
                    break;

                case 4:
                    System.out.println("Own number sending");
                    break;

                case 5:
                    System.out.println("phone line in use");
                    break;

                case 6:
                    System.out.println("Automatic answer");
                    break;
            }
        }

        public static void phoneSetting(){
            System.out.printf("1. Language%n2. Cell info display%n3. Welcome note%n" +
                    "4. Network selection%n5.Lights 2%n6. Confirm SIM service actions%n%n");

            System.out.printf("Enter number%n%n");
            int number = input.nextInt();

            switch (number){
                case 1:
                    System.out.println("Language");
                    break;

                case 2:
                    System.out.println("Cell info display");
                    break;

                case 3:
                    System.out.println("Welcome note");
                    break;

                case 4:
                    System.out.println("Network selection");
                    break;

                case 5:
                    System.out.println("Lights 2");
                    break;

                case 6:
                    System.out.println("Confirm SIM service action");
                    break;
            }
        }

        public static void securitySettings(){
            System.out.printf("1. PIN code request%n2. Call barring service%n3. Fixed dialling%n" +
                    "4. Closed user group%n5. Phone security%n6. Change access codes%n%n");

            System.out.printf("Enter number%n%n");
            int number = input.nextInt();

            switch (number){
                case 1:
                    System.out.println("PIN code request");
                    break;

                case 2:
                    System.out.println("Call barring service");
                    break;

                case 3:
                    System.out.println("Fixed dialling");
                    break;

                case 4:
                    System.out.println("Closed user groups");
                    break;

                case 5:
                    System.out.println("Phone security");
                    break;

                case 6:
                    System.out.println("Change access code");
                    break;
            }
        }

        public static void clock(){
            System.out.printf("1. Alarm clock%n2. Clock settings%n3. Date setting%n" +
                    "4. Stopwatch%n5. Countdown timer%n6. Auto update of date and time%n%n");

            System.out.printf("Enter number%n%n");
            int number = input.nextInt();

            switch (number){
                case 1:
                    System.out.println("Alarm clock");
                    break;

                case 2:
                    System.out.println("Clock settings");
                    break;

                case 3:
                    System.out.println("Date settings");
                    break;

                case 4:
                    System.out.println("Stopwatch");
                    break;

                case 5:
                    System.out.println("Countdown timer");
                    break;

                case 6:
                    System.out.println("Auto update of date and time");
                    break;
            }
        }
}