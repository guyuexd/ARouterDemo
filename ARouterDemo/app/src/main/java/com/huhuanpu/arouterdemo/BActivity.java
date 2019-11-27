package com.huhuanpu.arouterdemo;

import android.app.Activity;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by huhuanpu on 19-11-25
 */

@Route(path = "/path/bactivity")
public class BActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        //方式1 用类的形式, 在navigation方法中添加参数
        //ARouter.getInstance().navigation(HelloService.class).sayHello("mike");

        // 方式2 用path的方式, 在build添加类的Router路径
        HelloService hs = (HelloService) ARouter.getInstance().build("/service/hello").navigation();
        hs.sayHello("mike");
    }
}
