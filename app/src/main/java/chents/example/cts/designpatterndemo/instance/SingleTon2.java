package chents.example.cts.designpatterndemo.instance;

/*
* 饿汉式
* 创建对象就开始初始化对象
 */
public class SingleTon2 {

    private SingleTon2() {
    }

    private static SingleTon2 singleTon2 = new SingleTon2();

    public static synchronized SingleTon2 getInstance(){

        return singleTon2;
    }
}
