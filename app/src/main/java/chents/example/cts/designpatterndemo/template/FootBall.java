package chents.example.cts.designpatterndemo.template;

import android.util.Log;

public class FootBall extends Game {

    private static final String TAG = "FootBall";
    @Override
    void initialize() {

        Log.d(TAG, "initialize: ");
    }

    @Override
    void startPlay() {

        Log.d(TAG, "startPlay: ");
    }

    @Override
    void endPlay() {

        Log.d(TAG, "endPlay: ");
    }
}
