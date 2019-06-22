package chents.example.cts.designpatterndemo.instance;

import android.util.Log;

/**
 * 懒汉式
 * 当需要使用的时候再创建对象
 */
public class SingleTon1 {
    private SingleTon1(){}

    private static final String TAG = "SingleTon1";
    private static SingleTon1 singleTon1;

    public static synchronized SingleTon1 getInstance(){

        if (singleTon1==null){

            singleTon1= new SingleTon1();
        }
        return singleTon1;
    }

    public static void doSomething(){

        Log.d(TAG, "doSomething: ");
    }
}
