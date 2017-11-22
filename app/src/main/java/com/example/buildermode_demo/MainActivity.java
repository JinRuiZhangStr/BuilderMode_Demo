package com.example.buildermode_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        builder = new MacbookBuilder();
        Director director = new Director(builder);
        director.construct("英特尔主板","Retina显示器");

        initView();
    }

    private void initView() {
        TextView tv = findViewById(R.id.tv);

        tv.setText(builder.create().toString());
    }
}
