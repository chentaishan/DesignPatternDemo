package chents.example.cts.designpatterndemo.starategy;

import android.util.Log;

public class Add implements Strategy {
    @Override
    public int exec(int a,int b) {
        Log.d(TAG, "dosomething: one");
        return a+b;
    }

    private static final String TAG = "One";
}
