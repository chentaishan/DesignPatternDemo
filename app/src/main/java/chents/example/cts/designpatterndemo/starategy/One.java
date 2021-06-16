package chents.example.cts.designpatterndemo.starategy;

import android.util.Log;

public class One implements Strategy {
    @Override
    public void dosomething() {
        Log.d(TAG, "dosomething: one");
    }

    private static final String TAG = "One";
}
