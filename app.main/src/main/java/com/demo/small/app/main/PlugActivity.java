package com.demo.small.app.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import com.demo.small.lib.utils.common.ImageLoader;

public class PlugActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plug);
        ImageView imageView = (ImageView) findViewById(R.id.iv_header);
        ImageLoader.loadImage(this, "http://i6.hexun.com/2017-06-02/189461191.jpg", imageView);
    }
}
