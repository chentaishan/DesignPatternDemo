package chents.example.cts.designpatterndemo.responsibility;

import android.util.Log;

public class AndroidEr extends Program {
    int expense ; // 经费
    String  apply ="申请出国游";

    private static final String TAG = "AndroidEr";
    public AndroidEr(int expense) {
        this.expense = expense;

        Log.d(TAG, "AndroidEr: "+expense);
    }

    @Override
    public int getExpense() {
        return expense;
    }

    @Override
    public String getApply() {
        return apply;
    }
}
