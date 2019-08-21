package chents.example.cts.designpatterndemo.instance;

import android.util.Log;

/**
 * 静态内部类
 * 优点：实现线程安全，效率高
 *
 */
public class SingleTon3 {

    private static final String TAG = "SingleTon3";
    private SingleTon3(){}

    public static SingleTon3 getInstance(){

        return SingleHolder.INSTANCE;
    }
   private static class SingleHolder{
        public static SingleTon3 INSTANCE = new SingleTon3();
   }

    public static void doSomething(){

        Log.d(TAG, "doSomething: ");
    }
}
