package chents.example.cts.designpatterndemo.instance.oberser;


import java.util.Observable;

public class WeatherData extends Observable {

    private int temperature;// 温度
    private int pressure;// 气压


    public void update(){

        setChanged();
        notifyObservers();
    }


    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}
