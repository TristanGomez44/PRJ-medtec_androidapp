package com.echopen.asso.echopen.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Environment;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.echopen.asso.echopen.R;
import com.echopen.asso.echopen.utils.Config;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Driver;

public class MainActionController extends AbstractActionController {

    private Activity activity;

    public MainActionController() {
        displayAction();
    }

    public MainActionController(Activity activity) {
        this.activity = activity;
        displayAction();
    }

    private void displayAction(){}

    private View findViewById(int id){
        return this.activity.findViewById(id);
    }

    public void displayVideo(){
//        findViewById(R.id.tabGrid).setVisibility(View.GONE);
//        findViewById(R.id.tabTime).setVisibility(View.VISIBLE);
//        findViewById(R.id.btnEffect).setVisibility(View.INVISIBLE);
//
//        findViewById(R.id.btnCapture).setBackgroundResource(
//                R.drawable.capture_vid_btn);
//
//        TextView b = (TextView) findViewById(R.id.btn1);
//        b.setVisibility(View.VISIBLE);
//        b.setText("PHOTO");
//
//        b = (TextView) findViewById(R.id.btn2);
//        b.setVisibility(View.VISIBLE);
//        b.setText("1:1");
//
//        b = (TextView) findViewById(R.id.btn3);
//        b.setText("VIDEO");
//
//        b = (TextView) findViewById(R.id.btn4);
//        b.setVisibility(View.INVISIBLE);
//
//        b = (TextView) findViewById(R.id.btn5);
//        b.setVisibility(View.INVISIBLE);
    }

    public void displayImages() {
//        findViewById(R.id.tabGrid).setVisibility(View.VISIBLE);
//        findViewById(R.id.tabTime).setVisibility(View.GONE);
//        findViewById(R.id.btnEffect).setVisibility(View.VISIBLE);
//
//        findViewById(R.id.btnCapture).setBackgroundResource(
//                R.drawable.capture_pic_btn);
    }

    public void displayPhoto(){
//        TextView b = (TextView) findViewById(R.id.btn1);
//        b.setVisibility(View.INVISIBLE);
//        displayPhoto(b);
    }
//
    public void displayPhoto(TextView b){
//
//        b = (TextView) findViewById(R.id.btn2);
//        b.setVisibility(View.INVISIBLE);
//
//        b = (TextView) findViewById(R.id.btn3);
//        b.setText("PHOTO");
//
//        b = (TextView) findViewById(R.id.btn4);
//        b.setText("1:1");
//        b.setVisibility(View.VISIBLE);
//
//        b = (TextView) findViewById(R.id.btn5);
//        b.setText("VIDEO");
//        b.setVisibility(View.VISIBLE);
    }
//
    public void displayOtherImage() {
//        TextView b = (TextView) findViewById(R.id.btn1);
//        b.setVisibility(View.INVISIBLE);
//        displayOtherImage(b);
    }
//
    public void displayOtherImage(TextView b) {
//        b = (TextView) findViewById(R.id.btn2);
//        b.setText("PHOTO");
//        b.setVisibility(View.VISIBLE);
//
//        b = (TextView) findViewById(R.id.btn3);
//        b.setText("1:1");
//
//        b = (TextView) findViewById(R.id.btn4);
//        b.setText("VIDEO");
//        b.setVisibility(View.VISIBLE);
//
//        b = (TextView) findViewById(R.id.btn5);
//        b.setVisibility(View.INVISIBLE);
    }

    public void setTransparentTextView(){
        TextView textView = (TextView) findViewById(R.id.measure);
        textView.setVisibility(View.GONE);
    }

    public void displayMainFrame(Bitmap bitmap){
        DrawView echoImage = (DrawView) findViewById(R.id.echo);
        echoImage.setImageBitmap(bitmap);
        echoImage.setColorFilter(Config.colorMatrixColorFilter);
    }
}