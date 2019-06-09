package chents.example.cts.designpatterndemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import chents.example.cts.designpatterndemo.builder.Director;
import chents.example.cts.designpatterndemo.builder.MacBookBuilder;
import chents.example.cts.designpatterndemo.factory.Shape;
import chents.example.cts.designpatterndemo.factory.ShapeFactory;
import chents.example.cts.designpatterndemo.instance.SingleTon1;
import chents.example.cts.designpatterndemo.instance.SingleTon2;
import chents.example.cts.designpatterndemo.instance.SingleTon3;
import chents.example.cts.designpatterndemo.instance.SingleTon4;
import chents.example.cts.designpatterndemo.instance.oberser.Cuihua;
import chents.example.cts.designpatterndemo.instance.oberser.SingleMan;
import chents.example.cts.designpatterndemo.template.Cricket;
import chents.example.cts.designpatterndemo.template.Game;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";
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
    /**
     * builder_click
     */
    private Button mBuilderClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    private void testBuilder() {

        MacBookBuilder macBookBuilder = new MacBookBuilder();

        Director director = new Director(macBookBuilder);

        director.construct("华为主板", "显卡");

        Log.d(TAG, "testBuilder: "+macBookBuilder.create().toString());
    }

    private void testTemplate() {

        Game game = new Cricket();

        game.play();
    }

    private void testFactory() {

        Shape shape = ShapeFactory.getShape(ShapeFactory.CIRCLE);


    }

    /**
     * 观察者模式
     */
    private void testObserver() {

        Cuihua cuihua = new Cuihua();

        SingleMan myOberser = new SingleMan( );
        SingleMan myOberser1 = new SingleMan( );

        cuihua.addObserver(myOberser);
        cuihua.addObserver(myOberser1);


        cuihua.createEvent("I am married!");
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
        mBuilderClick = (Button) findViewById(R.id.builder_click);
        mBuilderClick.setOnClickListener(this);
        mResult.setOnClickListener(this);
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
            case R.id.builder_click:

                testBuilder();
                break;
            case R.id.result:
                break;
        }
    }
}
