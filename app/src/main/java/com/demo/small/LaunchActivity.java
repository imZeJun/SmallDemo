package com.demo.small;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import net.wequick.small.Small;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        setUp();
    }

    private void setUp() {
        Small.setUp(this, new net.wequick.small.Small.OnCompleteListener() {

            @Override
            public void onComplete() {
                Log.d("LaunchActivity", "onComplete");
            }
        });
    }

    public void startPlugActivity(View view) {
        Small.openUri("main", LaunchActivity.this);
    }
}
