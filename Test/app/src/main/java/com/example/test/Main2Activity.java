package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class Main2Activity extends AppCompatActivity {
    private Button btn_toast;
    private Context mContext;
    private Button btn_toast1;
    private Context mContext1;
    private Button btn_toast2;
    private Context mContext2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mContext = Main2Activity.this;
        mContext1 = Main2Activity.this;
        mContext2 = Main2Activity.this;
        btn_toast = (Button) findViewById(R.id.btn_toast);
        btn_toast1 = (Button) findViewById(R.id.btn_toast1);
        btn_toast2 = (Button) findViewById(R.id.btn_toast2);
        btn_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                midToast("你点我头像干嘛~点下面的介绍啊~",Toast.LENGTH_SHORT);
            }
        });
        btn_toast1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                midToast1("名字上面写了啊，你怎么还问",Toast.LENGTH_SHORT);
            }
        });
        btn_toast2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                midToast2("贾宝玉，中国古典名著《红楼梦》中的男主角。",Toast.LENGTH_SHORT);
            }
        });
    }
    private void midToast(String str, int showTime)
    {
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.jiabaoyutouxiang,
                (ViewGroup) findViewById(R.id.lly_toast));
        TextView tv_msg = (TextView) view.findViewById(R.id.tv_msg);
        tv_msg.setText(str);
        Toast toast = new Toast(mContext);
        toast.setGravity(Gravity.CENTER, 0, 40);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(view);
        toast.show();
    }
    private void midToast1(String str, int showTime)
    {
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.jiabaoyumingzi,
                (ViewGroup) findViewById(R.id.mingzi_toast));
        TextView mingzi_toast = (TextView) view.findViewById(R.id.mingzi);
        mingzi_toast.setText(str);
        Toast toast = new Toast(mContext1);
        toast.setGravity(Gravity.CENTER, 0, 270);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(view);
        toast.show();
    }
    private void midToast2(String str, int showTime)
    {
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.gerenjieshao,
                (ViewGroup) findViewById(R.id.jieshao_toast));
        TextView jieshao_toast = (TextView) view.findViewById(R.id.jieshao);
        jieshao_toast.setText(str);
        Toast toast = new Toast(mContext2);
        toast.setGravity(Gravity.CENTER, 0, 600);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(view);
        toast.show();
    }
}
