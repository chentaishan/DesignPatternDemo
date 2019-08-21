package chents.example.cts.designpatterndemo.DynamicProxy;

import android.util.Log;

public class Client implements ILawsuit {
    @Override
    public void submit() {


        Log.d(TAG, "submit: ");
    }

    private static final String TAG = "Client";
}
