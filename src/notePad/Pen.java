package notePad;

public class Pen {


    public String type = "gel";
    public String color = "blue";
    public int point = 10;

    public static boolean clicked = true;

    public static void click(){
        clicked = true;
    }

    public static boolean unclicked = false;

    public static void unclick(){
        unclicked = false;
    }
}
