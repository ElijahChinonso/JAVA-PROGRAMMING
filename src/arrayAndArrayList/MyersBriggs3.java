package arrayAndArrayList;

import javax.swing.*;
import java.util.Scanner;

public class MyersBriggs3 {
    public static void main(String[] args) {
        el();
        checkPersonality();
    }

    private static final int[][] top = new int[4][2];
    static  void el(){
        Scanner input = new Scanner(System.in);
        String response;

        top[0][0] = 0;
        top[0][1] = 0;
        top[1][0] = 0;
        top[1][1] = 0;
        top[2][0] = 0;
        top[2][1] = 0;
        top[3][0] = 0;
        top[3][1] = 0;

        for(int i = 0; i <= 20; i++){

            switch (i){
                case 1:
                    System.out.println("(1) A. expend energy, enjoy groups B. conserve energy, enjoy one on one");
                    response = input.nextLine();
                    if(response.equalsIgnoreCase("A")) {
                        top[0][0]++;
                    }else
                        top[0][1]++;
            }

            switch (i){
                case 2:
                    System.out.println("(2) A. interpret literally. B. look for meaning and possibilities");
                    response = input.nextLine();
                    if(response.equalsIgnoreCase("A")) {
                        top[1][0]++;
                    }else
                        top[1][1]++;
            }

            switch (i){
                case 3:
                    System.out.println("(3) A. logical, thinking, questioning. B. empathetic, feeling, accommodating");
                    response = input.nextLine();
                    if(response.equalsIgnoreCase("A")) {
                        top[2][0]++;
                    }else
                        top[2][1]++;
            }

            switch (i){
                case 4:
                    System.out.println("(4) A. organized, orderly. B. flexible, adaptable");
                    response = input.nextLine();
                    if(response.equalsIgnoreCase("A")) {
                        top[3][0]++;
                    }else
                        top[3][1]++;
            }

            switch (i){
                case 5:
                    System.out.println("(5) A. more outgoing, think out loud. B. more reserved, think to yourself");
                    response = input.nextLine();
                    if(response.equalsIgnoreCase("A")) {
                        top[0][0]++;
                    }else
                        top[0][1]++;
            }

            switch (i){
                case 6:
                    System.out.println("(6) A. practical, realistic, experiential. B. imaginative, innovative, theoretical");
                    response = input.nextLine();
                    if(response.equalsIgnoreCase("A")) {
                        top[1][0]++;
                    }else
                        top[1][1]++;
            }

            switch (i){
                case 7:
                    System.out.println("(7) A. candid, straight forward, frank. B. tactful, kind, encouraging");
                    response = input.nextLine();
                    if(response.equalsIgnoreCase("A")) {
                        top[2][0]++;
                    }else
                        top[2][1]++;
            }

            switch (i){
                case 8:
                    System.out.println("(8) A. plan, Schedule. B. unplanned spontaneous");
                    response = input.nextLine();
                    if(response.equalsIgnoreCase("A")) {
                        top[3][0]++;
                    }else
                        top[3][1]++;
            }

            switch (i){
                case 9:
                    System.out.println("(9) A. seek many tasks, public activities, interaction with others. " +
                            "B. seek private, solitary activities with quiet to concentrate");
                    response = input.nextLine();
                    if(response.equalsIgnoreCase("A")) {
                        top[0][0]++;
                    }else
                        top[0][1]++;
            }

            switch (i){
                case 10:
                    System.out.println("(10) A. standard, usual, conventional. B. different, novel, unique");
                    response = input.nextLine();
                    if(response.equalsIgnoreCase("A")) {
                        top[1][0]++;
                    }else
                        top[1][1]++;
            }

            switch (i){
                case 11:
                    System.out.println("(11) A. firm, tend to criticize, hold the line. B. gentle, tend to appreciate, conciliate");
                    response = input.nextLine();
                    if(response.equalsIgnoreCase("A")) {
                        top[2][0]++;
                    }else
                        top[2][1]++;
            }

            switch (i){
                case 12:
                    System.out.println("(12) A. regulated, structured. B. easy going, 'live' and 'let live'");
                    response = input.nextLine();
                    if(response.equalsIgnoreCase("A")) {
                        top[3][0]++;
                    }else
                        top[3][1]++;
            }

            switch (i){
                case 13:
                    System.out.println("(13) A. external, communicative, express yourself. B. internal, reticent, keep to yourself");
                    response = input.nextLine();
                    if(response.equalsIgnoreCase("A")) {
                        top[0][0]++;
                    }else
                        top[0][1]++;
            }

            switch (i){
                case 14:
                    System.out.println("(14) A. focus on here-and-now. B. look to the future, global perspective, Big picture");
                    response = input.nextLine();
                    if(response.equalsIgnoreCase("A")) {
                        top[1][0]++;
                    }else
                        top[1][1]++;
            }

            switch (i){
                case 15:
                    System.out.println("(15) A. tough-minded, just. B. tender-hearted, merciful");
                    response = input.nextLine();
                    if(response.equalsIgnoreCase("A")) {
                        top[2][0]++;
                    }else
                        top[2][1]++;
            }

            switch (i){
                case 16:
                    System.out.println("(16) A. preparation, plan ahead. B. go with the flow, adapt as you go");
                    response = input.nextLine();
                    if(response.equalsIgnoreCase("A")) {
                        top[3][0]++;
                    }else
                        top[3][1]++;
            }

            switch (i){
                case 17:
                    System.out.println("(17) A. active, initiate. B. reflective, deliberate");
                    response = input.nextLine();
                    if(response.equalsIgnoreCase("A")) {
                        top[0][0]++;
                    }else
                        top[0][1]++;
            }

            switch (i){
                case 18:
                    System.out.println("(18) A. facts, things, what is. B. ideas, dreams, what could be, philosophical");
                    response = input.nextLine();
                    if(response.equalsIgnoreCase("A")) {
                        top[1][0]++;
                    }else
                        top[1][1]++;
            }

            switch (i){
                case 19:
                    System.out.println("(19) A. matter of fact, issue oriented. B. sensitive, people oriented, compassionate");
                    response = input.nextLine();
                    if(response.equalsIgnoreCase("A")) {
                        top[2][0]++;
                    }else
                        top[2][1]++;
            }

            switch (i){
                case 20:
                    System.out.println("(20) A. control, govern. B. latitude, freedom");
                    response = input.nextLine();
                    if(response.equalsIgnoreCase("A")) {
                        top[3][0]++;
                    }else
                        top[3][1]++;
            }
            System.out.println();
            System.out.println("Select option A or B: ");
        }
    }

    static void checkPersonality(){
        if(top[0][0] > top[0][1]){
            System.out.print("E");
        }
        else{
            System.out.print("I");
        }

        if (top[1][0] > top[1][1]){
            System.out.print("S");
        }
        else{
            System.out.print("N");
        }

        if(top[2][0] > top[2][1]){
            System.out.print("T");
        }
        else{
            System.out.print("F");
        }

        if(top[3][0] > top[3][1]){
            System.out.print("J");
        }
        else{
            System.out.print("P");
        }
    }
}
