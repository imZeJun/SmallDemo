package com.demo.small.app.detail;

import android.content.ContentValues;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }

    public void activity(View view) {
        Intent intent = new Intent(this, StubActivity.class);
        startActivity(intent);
    }

    public void service(View view) {
        Intent intent = new Intent(this, StubService.class);
        startService(intent);
    }

    public void contentProvider(View view) {
        ContentValues values = new ContentValues();
        getContentResolver().insert(StubContentProvider.CONTENT_URI, values);
    }

    public void broadcastReceiver(View view) {
        Intent intent = new Intent();
        intent.setAction("com.demo.small.action.stub.broadcast");
        sendBroadcast(intent);
    }
}
