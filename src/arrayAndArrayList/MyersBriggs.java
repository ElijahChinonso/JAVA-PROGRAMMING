package arrayAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MyersBriggs {
    private  static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> option = new ArrayList<>();


            System.out.printf("(1) A. expend energy, enjoy groups B. conserve energy, enjoy one on one%n");
            System.out.println("Select option A or B: ");
            String options = input.nextLine();

            switch (options) {
                case "A":
                case "B":
                    option.add(options);
                    break;
            }
        System.out.println();


        System.out.printf("(2) A. interpret literally. B. look for meaning and possibilities%n");
        System.out.println("Select option A or B: ");
        options = input.nextLine();

        switch (options){
            case "A":
            case "B":
                option.add(options);
                break;
        }
        System.out.println();

            System.out.printf("(3) A. logical, thinking, questioning. B. empathetic, feeling, accommodating%n");
            options = input.nextLine();

            switch (options) {
                case "A":
                case "B":
                    option.add(options);
                    break;
            }
            System.out.println();

        System.out.printf("(4) A. organized, orderly. B. flexible, adaptable%n");
        options = input.nextLine();

        switch (options){
            case "A":
            case "B":
                option.add(options);
                break;
        }
        System.out.println();

        System.out.printf("(5) A. more outgoing, think out loud. B. more reserved, think to yourself%n");
        options = input.nextLine();

        switch (options){
            case "A":
            case "B":
                option.add(options);
                break;
        }
        System.out.println();

        System.out.printf("(6) A. practical, realistic, experiential. B. imaginative, innovative, theoretical%n");
        options = input.nextLine();

        switch (options){
            case "A":
            case "B":
                option.add(options);
                break;
        }
        System.out.println();

        System.out.printf("(7) A. candid, straight forward, frank. B. tactful, kind, encouraging%n");
        options = input.nextLine();

        switch (options){
            case "A":
            case "B":
                option.add(options);
                break;
        }
        System.out.println();

        System.out.printf("(8) A. plan, Schedule. B. unplanned spontaneous%n");
        options = input.nextLine();

        switch (options){
            case "A":
            case "B":
                option.add(options);
                break;
        }
        System.out.println();

        System.out.printf("(9) A. seek many tasks, public activities, interaction with others. " +
                "B. seek private, solitary activities with quiet to concentrate%n");
        options = input.nextLine();

        switch (options){
            case "A":
            case "B":
                option.add(options);
                break;
        }
        System.out.println();

        System.out.printf("(10) A. standard, usual, conventional. B. different, novel, unique%n");
        options = input.nextLine();

        switch (options){
            case "A":
            case "B":
                option.add(options);
                break;
        }
        System.out.println();

        System.out.printf("(11) A. firm, tend to criticize, hold the line. B. gentle, tend to appreciate, conciliate%n");
        options = input.nextLine();

        switch (options){
            case "A":
            case "B":
                option.add(options);
                break;
        }
        System.out.println();

        System.out.printf("(12) A. regulated, structured. B. easy going, 'live' and 'let live'%n");
        options = input.nextLine();

        switch (options){
            case "A":
            case "B":
                option.add(options);
                break;
        }
        System.out.println();

        System.out.printf("(13) A. external, communicative, express yourself. B. internal, reticent, keep to yourself%n");
        options = input.nextLine();

        switch (options){
            case "A":
            case "B":
                option.add(options);
                break;
        }
        System.out.println();

        System.out.printf("(14) A. focus on here-and-now. B. look to the future, global perspective, Big picture%n");
        options = input.nextLine();

        switch (options){
            case "A":
            case "B":
                option.add(options);
                break;
        }
        System.out.println();

        System.out.printf("(15) A. tough-minded, just. B. tender-hearted, merciful%n");
        options = input.nextLine();

        switch (options){
            case "A":
            case "B":
                option.add(options);
                break;
        }
        System.out.println();

        System.out.printf("(16) A. preparation, plan ahead. B. go with the flow, adapt as you go%n");
        options = input.nextLine();

        switch (options){
            case "A":
            case "B":
                option.add(options);
                break;
        }
        System.out.println();

        System.out.printf("(17) A. active, initiate. B. reflective, deliberate%n");
        options = input.nextLine();

        switch (options){
            case "A":
            case "B":
                option.add(options);
                break;
        }
        System.out.println();

        System.out.printf("(18) A. facts, things, what is. B. ideas, dreams, what could be, philosophical%n");
        options = input.nextLine();

        switch (options){
            case "A":
            case "B":
                option.add(options);
                break;
        }
        System.out.println();

        System.out.printf("(19) A. matter of fact, issue oriented. B. sensitive, people oriented, compassionate%n");
        options = input.nextLine();

        switch (options){
            case "A":
            case "B":
                option.add(options);
                break;
        }
        System.out.println();

        System.out.printf("(20) A. control, govern. B. latitude, freedom%n");
        options = input.nextLine();

        switch (options){
            case "A":
            case "B":
                option.add(options);
                break;
        }
        System.out.println();
    }

}


