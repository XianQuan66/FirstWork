package com.example.firstwork;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;

import androidx.annotation.NonNull;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class UpdateTime extends Activity {
    private static final int MAG_ONE = 1;

//    Handler handler = new Handler() {
//        @Override
//        public void handleMessage(@NonNull Message msg) {
//            super.handleMessage(msg);
//            switch (msg.what) {
//                case MAG_ONE:
//                    new Thread(new Runnable() {
//                        @Override
//                        public void run() {
//                            getNetTime();
//                        }
//                    }).start();
//                    break;
//            }
//        }
//    };
//
//
//    private void getNetTime() {
//        URL url = null;
//        try {
//            url = new URL("http://www.ntsc.ac.cn");//中国科学院国家授时中心
//            URLConnection connection = url.openConnection();
//            connection.connect();
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    class TimeThread extends Thread {
//        @Override
//        public void run() {
//            super.run();
//            do {
//                try {
//                    Thread.sleep(1000);
//                    Message message = new Message();
//                    message.what = MAG_ONE;
//                    handler.sendMessage(message);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            } while (true);
//        }
//    }


}
