package Stack;
import java.util.Stack;

public class House {
    public static void main(String[] args) {
        Stack<String> sector = new Stack<>();
        sector.push("Bed Room");
        sector.push("Dinning Room");
        sector.push("Seating Room");
        sector.push("Bath Room");
        sector.push("Garage");

        System.out.println("Stack: " + sector+"\n");

        String space = sector.pop();
        System.out.println("Removed Sector: " + space+"\n");

        String department = sector.peek();
        System.out.println("Sector At The Top: " + department+"\n");

        int position = sector.search("Seating Room");
        System.out.println("Position Of Seating Room: " + position+"\n");

        boolean vest = sector.empty();
        System.out.println("Is The Stack Empty: " + vest+"\n");
    }
}
