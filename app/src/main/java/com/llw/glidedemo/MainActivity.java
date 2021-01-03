package com.llw.glidedemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import static com.llw.glidedemo.GlideUtil.loadImgListenerNeedDialog;

public class MainActivity extends AppCompatActivity {

    //网络图片URL
    private String imgUrl = "http://cn.bing.com/th?id=OHR.LargestCave_ZH-CN2069899703_1920x1080.jpg&rf=LaDigue_1920x1080.jpg&pid=hp";
    //图片控件
    private ImageView ivBg;

    private static final String TAG = "MainActivity";
    //进度条
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //绑定id
        ivBg = findViewById(R.id.iv_bg);
        progressBar = findViewById(R.id.progressBar);

        //显示图片
        //loadImg(imgUrl, ivBg);

        //显示图片并监听网络加载情况
        //loadImgListener(imgUrl,ivBg,false,true);

        //显示图片并监听网络加载情况
        loadImgListenerNeedDialog(this,imgUrl,ivBg,false,true);
    }


}