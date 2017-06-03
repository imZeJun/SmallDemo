package com.demo.small.app.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.demo.small.lib.utils.common.ImageLoader;
import net.wequick.small.Small;

public class PlugActivity extends AppCompatActivity {

    private static final String IMG_URL = "http://i6.hexun.com/2017-06-02/189461191.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plug);
        ImageView imageView = (ImageView) findViewById(R.id.iv_header);
        //调用 lib.utils 中定义的接口。
        ImageLoader.loadImage(this, IMG_URL, imageView);
    }
}
