package chents.example.cts.designpatterndemo.instance.oberser;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

public class SingleMan implements Observer {


    private static final String TAG = "SingleMan";
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Cuihua){
            Cuihua cuihua =   ((Cuihua) o);

            Log.d(TAG, "--"+cuihua.getTask());

        }
    }
}
