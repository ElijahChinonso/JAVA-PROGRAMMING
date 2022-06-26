package notePad;

public class Driver {

    private String name;
    private double height;
    private String complextion;
    private int age;

    public Driver(String name, double height, String complextion, int age){

        this.name = name;
        this.height = height;
        this.complextion = complextion;
        this.age = age;
    }

    public String name() {
        return name;
    }

    public double height() {
        return height;
    }

    public String complextion() {
        return complextion;
    }

    public int age() {
        return age;
    }
}
