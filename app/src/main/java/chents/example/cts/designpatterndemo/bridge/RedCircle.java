package chents.example.cts.designpatterndemo.bridge;

import android.util.Log;

public class RedCircle implements DrawApi{
    @Override
    public void drawCircle() {
        Log.d(TAG, "drawCircle: red");
    }

    private static final String TAG = "RedCircle";
}
