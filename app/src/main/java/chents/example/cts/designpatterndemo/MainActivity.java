package chents.example.cts.designpatterndemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import chents.example.cts.designpatterndemo.builder.Computer;
import chents.example.cts.designpatterndemo.builder.MacBook;
import chents.example.cts.designpatterndemo.factory.ShapeFactory;
import chents.example.cts.designpatterndemo.factroy2.AbstractFactory;
import chents.example.cts.designpatterndemo.factroy2.Contant;
import chents.example.cts.designpatterndemo.factroy2.FactoryProducer;
import chents.example.cts.designpatterndemo.factroy2.Shape;
import chents.example.cts.designpatterndemo.instance.SingleTon1;
import chents.example.cts.designpatterndemo.instance.SingleTon2;
import chents.example.cts.designpatterndemo.instance.SingleTon3;
import chents.example.cts.designpatterndemo.instance.SingleTon4;
import chents.example.cts.designpatterndemo.instance.SingleTon5;
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
    private Button mFactoryClickAbstact;
    /**
     * abstact_factory_click
     */
    private Button mFactoryClick;
    /**
     * abstact_factory_click
     */
    private Button mAbstactFactoryClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    /**
     * 单例模式
     */
    private void testSingleTon() {

        SingleTon1.getInstance().doSomething();
        SingleTon2.getInstance().doSomething();
        SingleTon3.getInstance().doSomething();
        SingleTon4.getInstance().doSomething();

        SingleTon5.INSTANCE.doSomeThing();
    }


    private void testFactory() {

        chents.example.cts.designpatterndemo.factory.Shape shape = ShapeFactory.getShape(ShapeFactory.CIRCLE);

        shape.onDraw();

    }

    private void testBuilder() {


        Computer macBookBuilder = new MacBook.MacBookBuilder()
                .buildOs("huawei")
                .buildDisplay("xxx")
                .buildBroad("mac OS ")
                .build();

        Log.d(TAG, "testBuilder: " + macBookBuilder.toString());
    }

    private void testTemplate() {

        Game game = new Cricket();

        game.play();
    }


    /**
     * 观察者模式
     */
    private void testObserver() {

        Cuihua cuihua = new Cuihua();

        SingleMan myOberser = new SingleMan();
        SingleMan myOberser1 = new SingleMan();

        cuihua.addObserver(myOberser);
        cuihua.addObserver(myOberser1);


        cuihua.createEvent("I am married!");
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
        mFactoryClickAbstact = (Button) findViewById(R.id.abstact_factory_click);
        mFactoryClickAbstact.setOnClickListener(this);
        mFactoryClick = (Button) findViewById(R.id.factory_click);
        mFactoryClick.setOnClickListener(this);
        mAbstactFactoryClick = (Button) findViewById(R.id.abstact_factory_click);
        mAbstactFactoryClick.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.abstact_factory_click:// TODO 19/06/09


                final AbstractFactory factory = FactoryProducer.getFactory(Contant.SHAPE);

                final Shape shape = factory.getShape(Contant.CIRCLE);

                shape.onDraw();

                break;
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
            case R.id.factory_click:

                testFactory();
                break;

        }
    }
}
