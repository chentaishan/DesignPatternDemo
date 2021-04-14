package chents.example.cts.designpatterndemo.proxy;

import android.util.Log;

/**
 * 老板
 */
public class Boss implements ITask {

    private static final String TAG = "Boss";


    @Override
    public void dispatchTask() {
        Log.d(TAG, "dispatchTask: ");
    }
}
