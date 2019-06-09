package com.example.designdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mClick;
    private TextView mReuslt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    private void initView() {
        mClick = (Button) findViewById(R.id.click);
        mClick.setOnClickListener(this);
        mReuslt = (TextView) findViewById(R.id.reuslt);
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
            case R.id.click:
                // TODO 19/06/09

                initData();
                break;
            default:
                break;
        }
    }
}
