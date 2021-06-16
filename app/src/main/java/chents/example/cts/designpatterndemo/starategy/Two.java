package chents.example.cts.designpatterndemo.starategy;

import android.util.Log;

public class Two implements Strategy {
    @Override
    public void dosomething() {
        Log.d(TAG, "dosomething: two");
    }

    private static final String TAG = "Two";
}
