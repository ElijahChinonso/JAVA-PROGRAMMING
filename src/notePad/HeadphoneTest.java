package notePad;

public class HeadphoneTest {

    public static void main(String[] args){
        Headphone music = new Headphone();
        System.out.println(music.powerOn());
        System.out.println(music.powerOff());
        System.out.println(music.playPauseOn());
        System.out.println(music.playPauseOff());
        System.out.println(music.microChipOn());
        System.out.println(music.redBlackOn());
        System.out.println(music.skipForward());
        System.out.println(music.skipBackward());
        System.out.println(music.volumeUp());
        System.out.println(music.volumeDown());
    }
}