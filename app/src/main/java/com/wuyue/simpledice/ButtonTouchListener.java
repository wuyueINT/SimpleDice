package com.wuyue.simpledice;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class ButtonTouchListener implements View.OnTouchListener {

    private Button btn;
    private TextView tv;

    private TimerTask task;
    private Timer timer;

    public ButtonTouchListener(Button btn, TextView tv) {
        this.btn = btn;
        this.tv = tv;
    }

    @SuppressLint("HandlerLeak")
    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {

            String s;
            switch (msg.what){

                case 3:
                    s = (int)(Math.random()*3)+1+"";
                    tv.setText(s);
                    break;
                case 4:
                    s = (int)(Math.random()*4)+1+"";
                    tv.setText(s);
                    break;
                case 6:
                    s = (int)(Math.random()*6)+1+"";
                    tv.setText(s);
                    break;
                case 8:
                    s = (int)(Math.random()*8)+1+"";
                    tv.setText(s);
                    break;
                case 10:
                    s = (int)(Math.random()*10)+1+"";
                    tv.setText(s);
                    break;
                case 20:
                    s = (int)(Math.random()*20)+1+"";
                    tv.setText(s);
                    break;
                case 100:
                    s = (int)(Math.random()*100)+1+"";
                    tv.setText(s);
                    break;
                default:
                    break;
            }
        }
    };

    @Override
    public boolean onTouch(View v, MotionEvent event) {

        if (v.getId()==R.id.btn_dice_3){

            if (event.getAction()==MotionEvent.ACTION_DOWN){
                //不停刷新数字
                btn.setBackgroundColor(Color.RED);
                task = new TimerTask() {
                    @Override
                    public void run() {
                        Message msg = new Message();
                        msg.what = 3;
                        handler.sendMessage(msg);
                    }
                };
                timer = new Timer();
                timer.schedule(task, 100, 100);
            }

            if (event.getAction()==MotionEvent.ACTION_UP){

                btn.setBackgroundColor(Color.GRAY);
                timer.cancel();
                String a = (int)(Math.random()*3)+1 + "";
                tv.setText(a);
            }

        }

        if (v.getId()==R.id.btn_dice_4){

            if (event.getAction()==MotionEvent.ACTION_DOWN){
                //不停刷新数字
                btn.setBackgroundColor(Color.RED);
                task = new TimerTask() {
                    @Override
                    public void run() {
                        Message msg = new Message();
                        msg.what = 4;
                        handler.sendMessage(msg);
                    }
                };
                timer = new Timer();
                timer.schedule(task, 100, 100);
            }

            if (event.getAction()==MotionEvent.ACTION_UP){

                timer.cancel();
                btn.setBackgroundColor(Color.GRAY);
                String a = (int)(Math.random()*4)+1 + "";
                tv.setText(a);
            }

        }

        if (v.getId()==R.id.btn_dice_6){

            if (event.getAction()==MotionEvent.ACTION_DOWN){
                //不停刷新数字
                btn.setBackgroundColor(Color.RED);
                task = new TimerTask() {
                    @Override
                    public void run() {
                        Message msg = new Message();
                        msg.what = 6;
                        handler.sendMessage(msg);
                    }
                };
                timer = new Timer();
                timer.schedule(task, 100, 100);
            }

            if (event.getAction()==MotionEvent.ACTION_UP){

                timer.cancel();
                btn.setBackgroundColor(Color.GRAY);
                String a = (int)(Math.random()*6)+1 + "";
                tv.setText(a);
            }

        }

        if (v.getId()==R.id.btn_dice_8){

            if (event.getAction()==MotionEvent.ACTION_DOWN){
                //不停刷新数字
                btn.setBackgroundColor(Color.RED);
                task = new TimerTask() {
                    @Override
                    public void run() {
                        Message msg = new Message();
                        msg.what = 8;
                        handler.sendMessage(msg);
                    }
                };
                timer = new Timer();
                timer.schedule(task, 100, 100);
            }

            if (event.getAction()==MotionEvent.ACTION_UP){

                timer.cancel();
                btn.setBackgroundColor(Color.GRAY);
                String a = (int)(Math.random()*8)+1 + "";
                tv.setText(a);
            }

        }

        if (v.getId()==R.id.btn_dice_10){

            if (event.getAction()==MotionEvent.ACTION_DOWN){
                //不停刷新数字
                btn.setBackgroundColor(Color.RED);
                task = new TimerTask() {
                    @Override
                    public void run() {
                        Message msg = new Message();
                        msg.what = 10;
                        handler.sendMessage(msg);
                    }
                };
                timer = new Timer();
                timer.schedule(task, 100, 100);
            }

            if (event.getAction()==MotionEvent.ACTION_UP){

                timer.cancel();
                btn.setBackgroundColor(Color.GRAY);
                String a = (int)(Math.random()*10)+1 + "";
                tv.setText(a);
            }

        }

        if (v.getId()==R.id.btn_dice_20){

            if (event.getAction()==MotionEvent.ACTION_DOWN){
                //不停刷新数字
                btn.setBackgroundColor(Color.RED);
                task = new TimerTask() {
                    @Override
                    public void run() {
                        Message msg = new Message();
                        msg.what = 20;
                        handler.sendMessage(msg);
                    }
                };
                timer = new Timer();
                timer.schedule(task, 100, 100);
            }

            if (event.getAction()==MotionEvent.ACTION_UP){

                timer.cancel();
                btn.setBackgroundColor(Color.GRAY);
                String a = (int)(Math.random()*20)+1 + "";
                tv.setText(a);
            }

        }

        if (v.getId()==R.id.btn_dice_100){

            if (event.getAction()==MotionEvent.ACTION_DOWN){
                //不停刷新数字
                btn.setBackgroundColor(Color.RED);
                task = new TimerTask() {
                    @Override
                    public void run() {
                        Message msg = new Message();
                        msg.what = 100;
                        handler.sendMessage(msg);
                    }
                };
                timer = new Timer();
                timer.schedule(task, 100, 100);
            }

            if (event.getAction()==MotionEvent.ACTION_UP){

                timer.cancel();
                btn.setBackgroundColor(Color.GRAY);
                String a = (int)(Math.random()*100)+1 + "";
                tv.setText(a);
            }

        }

        return false;
    }
}
