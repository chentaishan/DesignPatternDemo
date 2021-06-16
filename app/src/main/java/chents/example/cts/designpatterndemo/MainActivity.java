package chents.example.cts.designpatterndemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import chents.example.cts.designpatterndemo.adapter.SDcardImpl;
import chents.example.cts.designpatterndemo.adapter.ThinkpadComputer;
import chents.example.cts.designpatterndemo.bridge.LargeCoffee;
import chents.example.cts.designpatterndemo.bridge.Ordinary;
import chents.example.cts.designpatterndemo.bridge.SmallCoffee;
import chents.example.cts.designpatterndemo.bridge.Sugar;
import chents.example.cts.designpatterndemo.builder.Computer;
import chents.example.cts.designpatterndemo.builder.MacBook;
import chents.example.cts.designpatterndemo.factroy2.AbstractFactory;
import chents.example.cts.designpatterndemo.factroy2.Contant;
import chents.example.cts.designpatterndemo.factroy2.FactoryProducer;
import chents.example.cts.designpatterndemo.factroy2.Shape;
import chents.example.cts.designpatterndemo.instance.SingleTon1;
import chents.example.cts.designpatterndemo.instance.SingleTon2;
import chents.example.cts.designpatterndemo.instance.SingleTon3;
import chents.example.cts.designpatterndemo.instance.SingleTon4;
import chents.example.cts.designpatterndemo.instance.oberser.SingleMan;
import chents.example.cts.designpatterndemo.oberser.Cuihua;
import chents.example.cts.designpatterndemo.proxy.Secretary;
import chents.example.cts.designpatterndemo.responsibility.AndroidEr;
import chents.example.cts.designpatterndemo.responsibility.Boss;
import chents.example.cts.designpatterndemo.responsibility.Leader;
import chents.example.cts.designpatterndemo.responsibility.Manager;
import chents.example.cts.designpatterndemo.starategy.Context;
import chents.example.cts.designpatterndemo.starategy.Add;
import chents.example.cts.designpatterndemo.template.Cricket;
import chents.example.cts.designpatterndemo.template.Game;

//import chents.example.cts.designpatterndemo.proxy.ProxyObj;
//import chents.example.cts.designpatterndemo.proxy.RealObj;

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
    private Button mClickProxy;
    private Button mProxyClickDynamic;
    private Button mClickFactory;
    private Button mClickDecorator;
    private Button mClickResponsibility;
    private Button mClickClone;
    private Button mFactoryClick;
    private Button mAbstactFactoryClick;
    private Button mProxyClick;
    private Button mDynamicProxyClick;
    private Button mDecoratorClick;
    private Button mResponsibilityClick;
    private Button mCloneClick;
    private Button mBridgeClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    public void testResponsibility() {

        AndroidEr androidEr = new AndroidEr((int) (Math.random() * 10000));

        Leader leader = new Leader();
        Manager manager = new Manager();
        Boss boss = new Boss();

        leader.setLeader(manager);
        manager.setLeader(boss);

        leader.handleRequest(androidEr);
    }

    public void testProxy() {
        chents.example.cts.designpatterndemo.proxy.Boss boss = new chents.example.cts.designpatterndemo.proxy.Boss();

        final Secretary proxyObj = new Secretary(boss);

        proxyObj.dispatchTask();

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

    public void decorator() {


//        Circle circle = new Circle();
//        Red red = new Red(circle);
//        red.draw();

    }


    public void adapter() {
        ThinkpadComputer thinkpadComputer = new ThinkpadComputer();
        SDcardImpl sDcard = new SDcardImpl();
        thinkpadComputer.readSd(sDcard);

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
        mFactoryClickAbstact = (Button) findViewById(R.id.abstact_factory_click);
        mFactoryClickAbstact.setOnClickListener(this);
        mClickFactory = (Button) findViewById(R.id.factory_click);
        mClickFactory.setOnClickListener(this);
        mClickProxy = (Button) findViewById(R.id.proxy_click);
        mClickProxy.setOnClickListener(this);
        mProxyClickDynamic = (Button) findViewById(R.id.dynamic_proxy_click);
        mProxyClickDynamic.setOnClickListener(this);
        mClickDecorator = (Button) findViewById(R.id.decorator_click);
        mClickDecorator.setOnClickListener(this);
        mClickResponsibility = (Button) findViewById(R.id.responsibility_click);
        mClickResponsibility.setOnClickListener(this);
        mClickClone = (Button) findViewById(R.id.clone_click);
        mClickClone.setOnClickListener(this);
        mFactoryClick = (Button) findViewById(R.id.factory_click);
        mAbstactFactoryClick = (Button) findViewById(R.id.abstact_factory_click);
        mProxyClick = (Button) findViewById(R.id.proxy_click);
        mDynamicProxyClick = (Button) findViewById(R.id.dynamic_proxy_click);
        mDecoratorClick = (Button) findViewById(R.id.decorator_click);
        mResponsibilityClick = (Button) findViewById(R.id.responsibility_click);
        mCloneClick = (Button) findViewById(R.id.clone_click);
        mBridgeClick = (Button) findViewById(R.id.bridge_click);
        mBridgeClick.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.abstact_factory_click:// TODO 19/06/09


                final AbstractFactory factory = FactoryProducer.getFactory(Contant.SHAPE);

                final Shape shape = factory.getShape(Contant.CIRCLE);

                shape.onDraw();

                break;
            case R.id.factory_click:// TODO 19/11/06
                break;
            case R.id.proxy_click:// TODO 19/11/06
                break;
            case R.id.dynamic_proxy_click:// TODO 19/11/06
                break;
            case R.id.decorator_click:// TODO 19/11/06
                decorator();
                break;
            case R.id.responsibility_click:// TODO 19/11/06
                testResponsibility();
                break;
            case R.id.clone_click:// TODO 20/04/19
//                testClone();
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

            case R.id.bridge_click:
                testBridge();

                break;
        }
    }

    public void testStrategy(){

        Context context  = new Context();
        context.setStrategy(new Add());
        context.exec(3,4);

    }

    private void testBridge() {
        Sugar sugar = new Sugar();

        Ordinary ordinary = new Ordinary();

        LargeCoffee largeCoffee = new LargeCoffee(sugar);

        SmallCoffee smallCoffee = new SmallCoffee(ordinary);


        largeCoffee.makeCoffee();
        smallCoffee.makeCoffee();




    }

//    private void testClone() {
//
//        WordDocument wordDocument = new WordDocument();
//
//        wordDocument.setmText("HHHHHHHHHHHHHHH");
//        wordDocument.setmImages("aa.jpg");
//        wordDocument.setmImages("bb.jpg");
//        wordDocument.setmImages("cc.jpg");
//
//        wordDocument.toString();
//
//        WordDocument document = wordDocument.clone();
//        document.setmText("UUUU");
//        document.setmImages("dd.jpg");
//        wordDocument.toString();
//    }
}
