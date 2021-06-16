package chents.example.cts.designpatterndemo.starategy;

import android.util.Log;

public class Sub implements Strategy {
    @Override
    public int exec(int a ,int b) {
        Log.d(TAG, "dosomething: two");
        return a-b;
    }

    private static final String TAG = "Two";
}
