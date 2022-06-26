package notePad;

public class HumanId {

    private String birth;
    private int age;
    private String school;
    private int growOld;

    public String birth(String newBorn){
        return newBorn;
    }

    public void age(int number){
        this.age = number;
    }

    public String school(String theJoy){
        return theJoy;
    }

    public void growOld(int oldAge){
        this.growOld = oldAge;
    }
}