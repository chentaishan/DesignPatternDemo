package chents.example.cts.designpatterndemo.proxy;

import android.util.Log;

public class RealObj implements IUpateListener {

    private static final String TAG = "RealObj";

    @Override
    public void updateItem() {
        Log.d(TAG, "updateItem: ");
    }
}
