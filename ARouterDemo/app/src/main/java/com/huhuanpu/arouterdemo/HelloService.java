package com.huhuanpu.arouterdemo;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * Created by huhuanpu on 19-11-27
 */
public interface HelloService extends IProvider {

    void sayHello(String name);
}
