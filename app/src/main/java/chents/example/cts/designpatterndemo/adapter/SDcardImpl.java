package chents.example.cts.designpatterndemo.adapter;

import android.util.Log;

public class SDcardImpl implements SDcard {
    private static final String TAG = "SDcardImpl";
    @Override
    public String readCard() {
        return "正在读取SD数据";
    }

    @Override
    public int writeCard(String msg) {
        Log.d(TAG, "writeCard: "+msg);
        return 1;
    }
}
