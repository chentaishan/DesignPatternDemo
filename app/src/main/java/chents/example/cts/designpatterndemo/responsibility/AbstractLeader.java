package chents.example.cts.designpatterndemo.responsibility;

import android.util.Log;

public abstract class AbstractLeader {

    private static final String TAG = "AbstractLeader";
    private int expenses;// 当前领导能批复的金额
    AbstractLeader abstractLeader;

    public AbstractLeader(int expenses) {
        this.expenses = expenses;
    }

    //回应
    public abstract String reply(Program program);

    //处理消息
    public void handleRequest(Program program){

        if (program.getExpense()<expenses){
            String reply = reply(program);
            Log.d(TAG, "reply: "+reply);
        }else{

            if (abstractLeader!=null){
                abstractLeader.handleRequest(program);
            }else{
                Log.i(TAG,"我是老板，批准了！");
            }
        }
    }
    /**
     * 为当前领导设置一个上级领导
     *
     * @param superiorLeader
     *            上级领导
     */
    public void setLeader(AbstractLeader superiorLeader) {
        this.abstractLeader = superiorLeader;
    }
}
