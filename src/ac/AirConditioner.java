package ac;

public class AirConditioner {
    private int temp = 16;
    public boolean isOn() {

        return true;
    }

    public boolean isOff() {

        return false;
    }

    public void increaseTemp(int taps) {

        if(temp <= 30){
            this.temp = temp + taps;
        }
    }

    public void decreaseTemp(int taps) {

        if(temp >= 16 && temp <= 30){
            this.temp = temp - taps;
        }
    }

    public int getTemp() {
        if (temp > 30)
            temp = 30;
        if (temp < 16)
            temp = 16;

        return temp;
    }
}
