package chents.example.cts.designpatterndemo.instance.oberser;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

public class MyOberser implements Observer {

    public MyOberser(Observable observable) {

//        observable.addObserver(this);
    }

    private static final String TAG = "MyOberser";
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData =   ((WeatherData) o);

            int pressure = weatherData.getPressure();
            int temperature = weatherData.getTemperature();


            Log.d(TAG, this+"=:pressure= "+pressure+"---temperature="+temperature);

        }
    }
}
