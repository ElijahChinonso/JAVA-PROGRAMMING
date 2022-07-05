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
                chat();
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
                callDivert();
                break;
        }

        switch (number){
            case 8:
                games();
                break;
        }

        switch (number){
            case 9:
                calculator();
                break;
        }

        switch (number){
            case 10:
                reminders();
                break;
        }

        switch (number){
            case 11:
                clock();
                break;
        }

        switch (number){
            case 12:
                profiles();
                break;
        }

        switch (number){
            case 13:
                simServices();
                break;
        }
    }

        public static void phoneBook () {
            System.out.printf("1. Search%n2. Service Nos%n3. Add name%n4. Erase%n" +
                    "5. Edit%n6. Assign tone%n7. Send b`card%n8. Options%n9. Speed dials%n10. Voice tags%n%n ");

            System.out.printf("Enter number%n%n");
            int number = input.nextInt();
            switch (number){
                case 8:
                    options();
                    break;
            }
        }

        public static void options () {
            System.out.printf("1. Type of view%n2. Memory status%n");
        }

        public static void message(){
            System.out.printf("1. Write messages%n2. Inbox%n3. Outbox%n4. Picture message%n5. Templates%n6. Smileys%n" +
                    "7. Message settings%n8. Info service%n9. Voice mailbox number%n10. Service command number%n%n");

            System.out.printf("Enter number%n%n");
            int number = input.nextInt();

            switch (number){
                case 7:
                    messageSettings();
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
        }

        public static void common3(){
            System.out.printf("1. Delivery reports%n2. Reply via same centre%n3. Character support%n%n");
        }

        public static  void chat(){
        }

        public static  void callRegister(){
            System.out.printf("1. Missed calls%n2. Received calls%n3. Dialled numbers%n4. Erase recent call list%n" +
                    "5. Show call duration%n6. Show call costs%n7. Call cost settings%n8. Prepaid credit%n%n");

            System.out.printf("Enter number%n%n");
            int number = input.nextInt();

            switch (number){
                case 5:
                    showCallDuration();
                    break;
            }

            switch (number){
                case 6:
                    showCallCosts();
                    break;
            }

            switch (number){
                case 7:
                    callCostSettings();
                    break;
            }

        }

        public static void showCallDuration(){
            System.out.printf("1. Last call duration%n2. All calls' duration%n3. Received calls' duration%n4. Dialled calls' duration%n%n");
        }

        public static void showCallCosts(){
            System.out.printf("1. Last call cost%n2. All calls' cost%n3. Clear counters%n%n");
        }

        public static  void callCostSettings(){
            System.out.printf("1. Call cost limit%n2. Show costs in%n%n");
        }

        public static void tones(){
            System.out.printf("1. Ringing tone%n2. Ringing volume%n3. Incoming call alert%n4. Composer%n" +
                    "5. Message alert tone%n6. Keypad tones%n7. Warning and game tones%n8. Vibrating alert%n9. Screen saver%n%n");
        }

        public static void settings(){
            System.out.printf("1. Call settings%n2. Phone settings%n3. Security settings%n4. Restore factory setting%n%n");

            System.out.printf("Enter number%n%n");
            int number = input.nextInt();

            switch (number){
                case 1:
                callSettings();
                break;
            }

            switch (number){
                case 2:
                    phoneSetting();
                    break;
            }

            switch (number){
                case 3:
                    securitySettings();
                    break;
            }
        }

        public static void callSettings(){
            System.out.printf("1. Automatic redial%n2. Speed dialling%n3. Call waiting options%n" +
                    "4. Own number sending%n5. Phone line in use%n6. Automatic answer%n%n");
        }

        public static void phoneSetting(){
            System.out.printf("1. Language%n2. Cell info display%n3. Welcome note%n" +
                    "4. Network selection%n5.Lights 2%n6. Confirm SIM service actions%n%n");
        }

        public static void securitySettings(){
            System.out.printf("1. PIN code request%n2. Call barring service%n3. Fixed dialling%n" +
                    "4. Closed user group%n5. Phone Security%n6. Change access codes%n%n");
        }

        public static void callDivert(){
        }

        public static void games(){
        }

        public static void calculator(){
        }

        public static void reminders(){
        }

        public static void clock(){
            System.out.printf("1. Alarm clock%n2. Clock settings%n3. Date setting%n" +
                    "4. Stopwatch%n5. Countdown timer%n6. Auto update of date and time%n%n");
        }

        public static void profiles(){
        }

        public static void simServices(){
        }



}