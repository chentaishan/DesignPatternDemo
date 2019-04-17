package chents.example.cts.designpatterndemo.instance;

/**
 * 双重检查锁  模式
 *
 * DCL double check lock
 */
public class SingleTon4 {
    private SingleTon4(){}
    private static SingleTon4 singleTon4;
    public static SingleTon4 getInstance(){

        if (singleTon4==null){
            synchronized (SingleTon4.class){
                if (singleTon4==null){

                    singleTon4 = new SingleTon4();
                }
            }

        }
        return singleTon4;
    }
}
