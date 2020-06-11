package com.wuyue.simpledice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_dice_6;
    private Button btn_dice_3;
    private Button btn_dice_8;
    private Button btn_dice_10;
    private Button btn_dice_100;
    private Button btn_dice_20;
    private Button btn_dice_4;
    private Button btn_dice_bonus;
    private Button btn_dice_punishment;

    public TextView tv_dice_6;
    private TextView tv_dice_3;
    private TextView tv_dice_8;
    private TextView tv_dice_10;
    private TextView tv_dice_100;
    private TextView tv_dice_20;
    private TextView tv_dice_4;

    private View v01;
    private int m = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_dice_6 = findViewById(R.id.btn_dice_6);
        btn_dice_3 = findViewById(R.id.btn_dice_3);
        btn_dice_8 = findViewById(R.id.btn_dice_8);
        btn_dice_10 = findViewById(R.id.btn_dice_10);
        btn_dice_100 = findViewById(R.id.btn_dice_100);
        btn_dice_20 = findViewById(R.id.btn_dice_20);
        btn_dice_4 = findViewById(R.id.btn_dice_4);
        btn_dice_bonus = findViewById(R.id.btn_dice_bonus);
        btn_dice_punishment = findViewById(R.id.btn_dice_punishment);

        tv_dice_6 = findViewById(R.id.tv_dice_6);
        tv_dice_3 = findViewById(R.id.tv_dice_3);
        tv_dice_8 = findViewById(R.id.tv_dice_8);
        tv_dice_10 = findViewById(R.id.tv_dice_10);
        tv_dice_100 = findViewById(R.id.tv_dice_100);
        tv_dice_20 = findViewById(R.id.tv_dice_20);
        tv_dice_4 = findViewById(R.id.tv_dice_4);

        btn_dice_bonus.setOnClickListener(this);
        btn_dice_punishment.setOnClickListener(this);

        btn_dice_3.setOnTouchListener(new ButtonTouchListener(btn_dice_3, tv_dice_3));
        btn_dice_4.setOnTouchListener(new ButtonTouchListener(btn_dice_4, tv_dice_4));
        btn_dice_6.setOnTouchListener(new ButtonTouchListener(btn_dice_6, tv_dice_6));
        btn_dice_8.setOnTouchListener(new ButtonTouchListener(btn_dice_8, tv_dice_8));
        btn_dice_10.setOnTouchListener(new ButtonTouchListener(btn_dice_10, tv_dice_10));
        btn_dice_20.setOnTouchListener(new ButtonTouchListener(btn_dice_20, tv_dice_20));
        btn_dice_100.setOnTouchListener(new ButtonTouchListener(btn_dice_100, tv_dice_100));

    }

    @Override
    public void onClick(View v) {

        if (v==btn_dice_bonus){
            //这里想做到的功能是，希望点击该按钮，相当于再点击一次上一个按钮
            dice_bonus(m, v01);
        }
        if (v==btn_dice_punishment){
            //这里想做到的功能是，希望点击该按钮之后，改变其他按钮的点击事件
            dice_punishment(m, v01);
        }

    }

    private void dice_punishment(int n, View v) {

        if (v==btn_dice_6){
            int m1 = n;
            int m2 = (int)(Math.random()*6+1);
            int m = m1;
            if (m > m2){
                m = m2;
            }
            tv_dice_6.setText(m1 +" "+ m2 + "\n" + "取较小值：" + m);
        }
        if (v==btn_dice_3){
            int m1 = n;
            int m2 = (int)(Math.random()*3+1);
            int m = m1;
            if (m > m2){
                m = m2;
            }
            tv_dice_3.setText(m1 +" "+ m2 + "\n" + "取较小值：" + m);
        }
        if (v==btn_dice_8){
            int m1 = n;
            int m2 = (int)(Math.random()*8+1);
            int m = m1;
            if (m > m2){
                m = m2;
            }
            tv_dice_8.setText(m1 +" "+ m2 + "\n" + "取较小值：" + m);
        }
        if (v==btn_dice_10){
            int m1 = n;
            int m2 = (int)(Math.random()*10+1);
            int m = m1;
            if (m > m2){
                m = m2;
            }
            tv_dice_10.setText(m1 +" "+ m2 + "\n" + "取较小值：" + m);
        }
        if (v==btn_dice_100){
            int m1 = n;
            int m2 = (int)(Math.random()*100+1);
            int m = m1;
            if (m > m2){
                m = m2;
            }
            tv_dice_100.setText(m1 +" "+ m2 + "\n" + "取较小值：" + m);
        }
        if (v==btn_dice_20){
            int m1 = n;
            int m2 = (int)(Math.random()*20+1);
            int m = m1;
            if (m > m2){
                m = m2;
            }
            tv_dice_20.setText(m1 +" "+ m2 + "\n" + "取较小值：" + m);
        }
        if (v==btn_dice_4){
            int m1 = n;
            int m2 = (int)(Math.random()*4+1);
            int m = m1;
            if (m > m2){
                m = m2;
            }
            tv_dice_4.setText(m1 +" "+ m2 + "\n" + "取较小值：" + m);
        }
    }

    public void dice_bonus(int n, View v){

        if (v==btn_dice_6){
            int m1 = n;
            int m2 = (int)(Math.random()*6+1);
            int m = m1;
            if (m < m2){
                m = m2;
            }
            tv_dice_6.setText(m1 +" "+ m2 + "\n" + "取较大值：" + m);
        }
        if (v==btn_dice_3){
            int m1 = n;
            int m2 = (int)(Math.random()*3+1);
            int m = m1;
            if (m < m2){
                m = m2;
            }
            tv_dice_3.setText(m1 +" "+ m2 + "\n" + "取较大值：" + m);
        }
        if (v==btn_dice_8){
            int m1 = n;
            int m2 = (int)(Math.random()*8+1);
            int m = m1;
            if (m < m2){
                m = m2;
            }
            tv_dice_8.setText(m1 +" "+ m2 + "\n" + "取较大值：" + m);
        }
        if (v==btn_dice_10){
            int m1 = n;
            int m2 = (int)(Math.random()*10+1);
            int m = m1;
            if (m < m2){
                m = m2;
            }
            tv_dice_10.setText(m1 +" "+ m2 + "\n" + "取较大值：" + m);
        }
        if (v==btn_dice_100){
            int m1 = n;
            int m2 = (int)(Math.random()*100+1);
            int m = m1;
            if (m < m2){
                m = m2;
            }
            tv_dice_100.setText(m1 +" "+ m2 + "\n" + "取较大值：" + m);
        }
        if (v==btn_dice_20){
            int m1 = n;
            int m2 = (int)(Math.random()*20+1);
            int m = m1;
            if (m < m2){
                m = m2;
            }
            tv_dice_20.setText(m1 +" "+ m2 + "\n" + "取较大值：" + m);
        }
        if (v==btn_dice_4){
            int m1 = n;
            int m2 = (int)(Math.random()*4+1);
            int m = m1;
            if (m < m2){
                m = m2;
            }
            tv_dice_4.setText(m1 +" "+ m2 + "\n" + "取较大值：" + m);
        }
    }
}
