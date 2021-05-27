package chents.example.cts.designpatterndemo.bridge;

import android.util.Log;

public class GreenCircle implements DrawApi{
    @Override
    public void drawCircle() {
        Log.d(TAG, "drawCircle: green");
    }

    private static final String TAG = "GreenCircle";
}
