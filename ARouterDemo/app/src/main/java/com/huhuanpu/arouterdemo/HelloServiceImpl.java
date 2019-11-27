package com.huhuanpu.arouterdemo;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;


/**
 * Created by huhuanpu on 19-11-27
 */
@Route(path = "/service/hello", name ="测试服务")
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        Log.d("huhuanpu", name);
    }

    @Override
    public void init(Context context) {

    }
}
