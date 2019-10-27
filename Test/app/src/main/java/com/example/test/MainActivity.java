package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
    // 打开另一个activity，通过意图，意图作用是激活其他组件
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Main2Activity.class);
    //发送意图.将意图发送给android系统，系统根据意图来激活组件
                startActivity(intent);
            }
        });
    }


}
