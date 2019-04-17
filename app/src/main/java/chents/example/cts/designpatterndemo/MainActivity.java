package chents.example.cts.designpatterndemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import chents.example.cts.designpatterndemo.factory.Shape;
import chents.example.cts.designpatterndemo.factory.ShapeFactory;
import chents.example.cts.designpatterndemo.instance.SingleTon1;
import chents.example.cts.designpatterndemo.instance.SingleTon2;
import chents.example.cts.designpatterndemo.instance.SingleTon3;
import chents.example.cts.designpatterndemo.instance.SingleTon4;
import chents.example.cts.designpatterndemo.instance.oberser.MyOberser;
import chents.example.cts.designpatterndemo.instance.oberser.WeatherData;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * single_click
     */
    private Button mSingleClick;
    /**
     * observer_click
     */
    private Button mObserverClick;
    /**
     * Hello World!
     */
    private TextView mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        testFactory();

    }

    private void testFactory() {

        Shape shape = ShapeFactory.getShape(ShapeFactory.CIRCLE);


    }

    /**
     * 观察者模式
     */
    private void testObserver() {

        WeatherData weatherData = new WeatherData();

        MyOberser myOberser = new MyOberser(weatherData);
        MyOberser myOberser1 = new MyOberser(weatherData);

        weatherData.addObserver(myOberser);
        weatherData.addObserver(myOberser1);

        weatherData.setPressure(22);
        weatherData.setTemperature(44);
        weatherData.update();
    }

    /**
     * 单例模式
     */

    private void testSingleTon() {

        SingleTon1.getInstance();
        SingleTon2.getInstance();
        SingleTon3.getInstance();
        SingleTon4.getInstance();

    }

    private void initView() {
        mSingleClick = (Button) findViewById(R.id.single_click);
        mSingleClick.setOnClickListener(this);
        mObserverClick = (Button) findViewById(R.id.observer_click);
        mObserverClick.setOnClickListener(this);
        mResult = (TextView) findViewById(R.id.result);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.single_click:
                testSingleTon();
                break;
            case R.id.observer_click:
                testObserver();
                break;
        }
    }
}
