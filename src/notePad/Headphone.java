package notePad;

public  class Headphone {

    String microChip;
    String power;
    int volume;
    String skip;
    String playPause;
    String redBlack;


    public String powerOn(){
        power = "on";
        return power;
    }

    public String powerOff(){
        power = "off";
        return power;
    }

    public int volumeUp(){
        volume = +1;
        return volume;
    }

    public int volumeDown(){
        volume = -1;
        return volume;
    }

    public String skipForward(){
        skip = ">>>";
        return skip;
    }

    public String skipBackward(){
        skip = "<<<";
        return skip;
    }

    public String playPauseOn(){
        playPause = "sing";
        return playPause;
    }

    public String playPauseOff(){
        playPause = "dont sing";
        return playPause;
    }

    public String redBlackOn(){
        redBlack = "red";
        return redBlack;
    }

    public String microChipOn(){
        microChip = "electricity";
        return microChip;
    }
}