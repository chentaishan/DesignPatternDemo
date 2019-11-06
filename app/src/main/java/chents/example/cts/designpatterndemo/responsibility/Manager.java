package chents.example.cts.designpatterndemo.responsibility;

import android.util.Log;

public class Manager extends AbstractLeader   {

    public Manager( ) {
        super(5000);
    }

    @Override
    public String reply(Program program) {
        Log.d(TAG, "Manager: Of course Yes! ");
        return program.getApply();
    }

    private static final String TAG = "Manager";

}
