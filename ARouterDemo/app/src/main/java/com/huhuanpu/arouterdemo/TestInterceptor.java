package com.huhuanpu.arouterdemo;

import android.content.Context;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;


/**
 * Created by huhuanpu on 19-11-27
 */

@Interceptor(priority = 8, name = "测试用拦截器")
public class TestInterceptor implements IInterceptor {

    //拦截器的初始化,会在sdk初始化的时候调用该方法,仅会调用一次
    @Override
    public void init(Context context) {

    }

    /**
     * 拦截器的操作
     * @param postcard 数据
     * @param callback 回调
     */

    @Override
    public void process(Postcard postcard, InterceptorCallback callback) {

        if(postcard != null && postcard.getPath() == "/path/bactivity"){
            postcard.withString("extra", "我是在拦截器中附加的参数");
        }

        callback.onContinue(postcard);

        // 终止跳转
        //callback.onInterrupt(null);

        //抛出异常
        //callback.onInterrupt(RuntimeException("it seems something is not right"));

        // onContinue 和 onInterrupt至少调用其中一种,否则不会继续路由

    }

}
