package com.demo.small.app;

import android.app.Application;
import net.wequick.small.Small;

public class SmallHostApp extends Application {

    public SmallHostApp() {
        //Small初始化。
        Small.preSetUp(this);
    }
}
