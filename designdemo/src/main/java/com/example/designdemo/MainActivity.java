package com.example.designdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.designdemo.builder.Computer;
import com.example.designdemo.builder.MacBook;
import com.example.designdemo.factroy.Shape;
import com.example.designdemo.factroy.ShapeFactory;
import com.example.designdemo.instance.SingleTon1;
import com.example.designdemo.instance.SingleTon2;
import com.example.designdemo.instance.SingleTon3;
import com.example.designdemo.instance.SingleTon4;
import com.example.designdemo.instance.SingleTon5;
import com.example.designdemo.observer.Cuihua;
import com.example.designdemo.observer.SingleMan;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mClick;
    private TextView mReuslt;
    /**
     * 单例
     */
    private Button mSingleClick;
    /**
     * 建造者模式
     */
    private Button mBuilderClick;
    /**
     * 观察者模式
     */
    private Button mObserverClick;
    /**
     * 工厂模式
     */
    private Button mFactoryClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    private void initView() {

        mReuslt = (TextView) findViewById(R.id.reuslt);
        mSingleClick = (Button) findViewById(R.id.single_click);
        mSingleClick.setOnClickListener(this);
        mReuslt.setOnClickListener(this);
        mBuilderClick = (Button) findViewById(R.id.builder_click);
        mBuilderClick.setOnClickListener(this);
        mObserverClick = (Button) findViewById(R.id.observer_click);
        mObserverClick.setOnClickListener(this);
        mFactoryClick = (Button) findViewById(R.id.factory_click);
        mFactoryClick.setOnClickListener(this);
    }

    public void initData() {

        final Cuihua cuihua = new Cuihua();

        final SingleMan singleMan = new SingleMan();
        final SingleMan singleMan1 = new SingleMan();

        cuihua.addObserver(singleMan1);
        cuihua.addObserver(singleMan);

        cuihua.doSomething(" I am getting --------");

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            default:
                break;
            case R.id.single_click:

                testSingle();
                break;
            case R.id.reuslt:
                break;
            case R.id.builder_click:
                testBuilder();
                break;
            case R.id.observer_click:

                testObserver();
                break;
            case R.id.factory_click:
                testFactory();
                break;
        }
    }

    private void testFactory() {


        Shape shape = ShapeFactory.getShape(ShapeFactory.CIRCLE);

        shape.onDraw();

    }

    private void testObserver() {

        Cuihua cuihua = new Cuihua();

        SingleMan singleMan = new SingleMan();

        cuihua.addObserver(singleMan);

        cuihua.doSomething("HHHHH");

    }

    private void testSingle() {

        SingleTon1.getInstance().doSomething();
        SingleTon2.getInstance().doSomething();
        SingleTon3.getInstance().doSomething();
        SingleTon4.getInstance().doSomething();
        SingleTon5.INSTANCE.doSomething();
    }

    private static final String TAG = "MainActivity";

    public void testBuilder() {

        Computer computer = new MacBook.MacBookBuilder()
                .buildOs("ddd")
                .buildBroad("xxx")
                .buildDisplay("OS")
                .build();

        Log.d(TAG, "testBuilder: " + computer);

    }
}
