package com.example.dpl.ricassodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView iv_img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_img= (ImageView) findViewById(R.id.iv_img);
        //Picasso.with(this).load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1506418994509&di=668b1fdc1209eed7b4262b7f971e89a6&imgtype=0&src=http%3A%2F%2Ftupian.enterdesk.com%2F2015%2Fsaraxuss%2F04%2F07%2F3%2Fz3.jpg").into(iv_img);
        Picasso.with(this).load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1506418994509&di=668b1fdc1209eed7b4262b7f971e89a6&imgtype=0&src=http%3A%2F%2Ftupian.enterdesk.com%2F2015%2Fsaraxuss%2F04%2F07%2F3%2Fz3.jpg").resize(3500,5000).into(iv_img);
        //Picasso.with(this).load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1506418994509&di=668b1fdc1209eed7b4262b7f971e89a6&imgtype=0&src=http%3A%2F%2Ftupian.enterdesk.com%2F2015%2Fsaraxuss%2F04%2F07%2F3%2Fz3.jpg").error(R.mipmap.ic_launcher);
    }
}
