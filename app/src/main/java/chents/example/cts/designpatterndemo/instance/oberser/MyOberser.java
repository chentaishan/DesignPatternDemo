package chents.example.cts.designpatterndemo.instance.oberser;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

public class MyOberser implements Observer {


    private static final String TAG = "MyOberser";
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Cuihua){
            Cuihua cuihua =   ((Cuihua) o);

            Log.d(TAG, "--"+cuihua.getTask());

        }
    }
}
