package com.huhuanpu.arouterdemo;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.DegradeService;

/**
 * Created by huhuanpu on 19-11-27
 */

@Route(path = "/cccc/ddd")
public class DegradeServiceImpl implements DegradeService {
    @Override
    public void onLost(Context context, Postcard postcard) {
        Log.d("huhuanpu", "onLost");
        if(context != null){
            Toast.makeText(context, "找不到路径", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void init(Context context) {

    }
}
