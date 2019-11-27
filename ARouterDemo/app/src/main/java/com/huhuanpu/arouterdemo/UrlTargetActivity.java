package com.huhuanpu.arouterdemo;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

/**
 * Created by huhuanpu on 19-11-27
 */
public class UrlTargetActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_url_target);

        tv = (TextView) findViewById(R.id.content);

        tv.setText("当前页面是:"+this.getLocalClassName());
    }
}
