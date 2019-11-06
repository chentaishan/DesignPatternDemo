package chents.example.cts.designpatterndemo.responsibility;

import android.util.Log;

public class Leader extends AbstractLeader  {


    public Leader( ) {
        super(1000);
    }


    @Override
    public String reply(Program program) {

        Log.d(TAG, "Leader: Of course Yes! ");
        return program.getApply();
    }

    private static final String TAG = "Leader";

}
