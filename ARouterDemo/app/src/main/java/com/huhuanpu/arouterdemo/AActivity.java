package com.huhuanpu.arouterdemo;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.core.app.ActivityOptionsCompat;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.NavCallback;
import com.alibaba.android.arouter.launcher.ARouter;

import java.lang.ref.WeakReference;

/**
 * Created by huhuanpu on 19-11-25
 */
public class AActivity extends Activity {

    public static final String TAG = "AActivity";
    private TextView tv;
    private Button button;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedBundleInstance){
        super.onCreate(savedBundleInstance);

        setContentView(R.layout.activity_a);
        mContext = this;
        tv = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Uri 跳转 (+ 参数)
                Uri uri = Uri.parse("/path/bactivity");
                // if build sdk int >= 16
                ActivityOptionsCompat compat = ActivityOptionsCompat.makeScaleUpAnimation(v, v.getWidth() / 2, v.getHeight() / 2,  0, 0);
                ARouter.getInstance()
                        .build(uri)
                        //参数
                        .withLong("longKey", 0x55555L)
                        .withString("stringKey", "666666")

                        //动画
                        //.withTransition(R.anim.slide_in_bottom, R.anim.slide_out_bottom)
                        //SDK大于等于16的动画
                        .withOptionsCompat(compat)
                        .navigation();

                        //降级策略 单个处理
//                        .navigation(mContext, new NavCallback() {
//                            @Override
//                            public void onArrival(Postcard postcard) {
//                                //已经打开目标activity
//                                finish();
//                            }
//
//                            @Override
//                            public void onFound(Postcard postcard){
//
//                            }
//
//                            @Override
//                            public void onLost(Postcard postcard){}
//
//                            @Override
//                            public void onInterrupt(Postcard postcard){
//
//                            }
//                        });
                // 普通跳转
//                ARouter.getInstance()
//                        .build("path/bactivity")
//                        .navigation();
            }
        });
    }
}
