package chents.example.cts.designpatterndemo.responsibility;

import android.util.Log;

public class Boss extends AbstractLeader   {


    public Boss( ) {
        super(10000);
    }

    @Override
    public String reply(Program program) {
        Log.d(TAG, "Boss: Of course Yes! ");
        return program.getApply();
    }

    private static final String TAG = "Boss";

}
