package chents.example.cts.designpatterndemo.factroy2;

import android.util.Log;

public class Green implements Color {
    private static final String TAG = "Green";
    @Override
    public void draw() {


        Log.d(TAG, "draw: ---GREEN");
    }
}
