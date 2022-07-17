package notePad;

import java.util.ArrayList;
import java.util.Scanner;

public class NAME_EMAIL {
    String name;
    String address;
    int telephone;
    String email;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("NAME: ");
        input.nextLine();

        System.out.println();

        System.out.print("ADDRESS: ");
        input.nextLine();

        System.out.println();

        System.out.print("TELEPHONE: ");
        input.nextLine();

        System.out.println();

        System.out.print("EMAIL: ");
        input.nextLine();
    }
}
