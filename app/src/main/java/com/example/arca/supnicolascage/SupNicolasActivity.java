package com.example.ernest.supnicolascage;

import android.graphics.Color;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Choreographer;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.TextView;
import com.github.chrisbanes.photoview.OnPhotoTapListener;
import com.github.chrisbanes.photoview.PhotoView;

public class SupNicolasActivity extends AppCompatActivity {

    int image;

    private PhotoView photoView;

    private Chronometer Chrono;

    private TextView Text;

    private Button Commencer;
    private Button Scores;
    private Button Normal_mod;
    private Button chronomod1;
    private Button chronomod2;
    private Button retour;

    private long mLastClickTime=0;

    private CountDownTimer My_Count_Down_Timer;
    private CountDownTimer fin;
    private TextView Count_down_field;

    private Button scorefin;

    private CharSequence sauvegarde;

    private boolean chrono_per_image;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sup_nicolas);

        Commencer=(Button)findViewById(R.id.Commencer_b);
        Commencer.setOnClickListener(commencer_click);

        Scores=(Button)findViewById(R.id.Scores_b);
        Scores.setOnClickListener(Scores_click);


        Normal_mod=(Button)findViewById(R.id.normal_b);
        Normal_mod.setOnClickListener(normal_click);

        chronomod1=(Button)findViewById(R.id.chronomod1_b);
        chronomod1.setOnClickListener(chrono1_click);

        chronomod2=(Button)findViewById(R.id.chronomod2_b);
        chronomod2.setOnClickListener(chrono2_click);

        retour=(Button)findViewById(R.id.retour);
        retour.setOnClickListener(retour_click);

        photoView=(PhotoView) findViewById(R.id.photo_view);
        photoView.setImageResource(R.drawable.capture);

        Chrono =(Chronometer) findViewById(R.id.chronometer2);


        Text=(TextView)findViewById(R.id.textView);

        Count_down_field=(TextView)findViewById(R.id.my_count_field);

        scorefin=(Button)findViewById(R.id.scorefin);



            photoView.setOnPhotoTapListener(new OnPhotoTapListener() {
                @Override
                public void onPhotoTap(ImageView view, float x, float y) {



                    if (image == 1) {
                        if (x <= 0.80 && x >= 0.78 && y <= 0.65 && y >= 0.60) {
                            photoView.setImageResource(R.drawable.capture3);
                            image +=1;
                            chrono_image(image);


                        }

                    else{
                            if (SystemClock.elapsedRealtime() - mLastClickTime < 2000){
                                return;
                            }
                            photoView.setClickable(false);
                            mLastClickTime = SystemClock.elapsedRealtime();
                        }
                    }
                    else if (image == 2) {
                        if (x <= 0.26 && x >= 0.24 && y <= 0.22 && y >= 0.18){
                            photoView.setImageResource(R.drawable.capture4);
                            image +=1;
                            chrono_image(image);
                        }

                        else{
                            if (SystemClock.elapsedRealtime() - mLastClickTime < 2000){
                                return;
                            }
                            photoView.setClickable(false);
                            mLastClickTime = SystemClock.elapsedRealtime();
                        }

                    }
                    else if(image==3){
                        if (x <= 0.23 && x >= 0.18 && y <= 0.24 && y >= 0.14){
                            photoView.setImageResource(R.drawable.capture5);
                            image+=1;
                            chrono_image(image);
                        }

                        else{
                            if (SystemClock.elapsedRealtime() - mLastClickTime < 2000){
                                return;
                            }
                            photoView.setClickable(false);
                            mLastClickTime = SystemClock.elapsedRealtime();
                        }
                    }

                    else if(image==4){
                        if (x <= 0.40 && x >= 0.34 && y <= 0.46 && y >= 0.39){
                            photoView.setImageResource(R.drawable.capture2);
                            image+=1;
                            chrono_image(image);
                        }

                        else{
                            if (SystemClock.elapsedRealtime() - mLastClickTime < 2000){
                                return;
                            }
                            photoView.setClickable(false);
                            mLastClickTime = SystemClock.elapsedRealtime();
                        }
                    }
                    else if(image==5){
                        if (x <= 0.38 && x >= 0.34 && y <= 0.33 && y >= 0.28){
                            photoView.setImageResource(R.drawable.capture6);
                            image+=1;
                            chrono_image(image);
                        }

                        else{
                            if (SystemClock.elapsedRealtime() - mLastClickTime < 2000){
                                return;
                            }
                            photoView.setClickable(false);
                            mLastClickTime = SystemClock.elapsedRealtime();
                        }
                    }
                    else if(image==6){
                        if (x <= 0.72 && x >= 0.68 && y <= 0.62 && y >= 0.53){
                            photoView.setImageResource(R.drawable.capture7);
                            image+=1;
                            chrono_image(image);
                        }

                        else{
                            if (SystemClock.elapsedRealtime() - mLastClickTime < 2000){
                                return;
                            }
                            photoView.setClickable(false);
                            mLastClickTime = SystemClock.elapsedRealtime();
                        }
                    }
                    else if(image==7){
                        if (x <= 0.98 && x >= 0.93 && y <= 0.38 && y >= 0.28){
                            photoView.setImageResource(R.drawable.capture8);
                            image+=1;
                            chrono_image(image);
                        }

                        else{
                            if (SystemClock.elapsedRealtime() - mLastClickTime < 2000){
                                return;
                            }
                            photoView.setClickable(false);
                            mLastClickTime = SystemClock.elapsedRealtime();
                        }
                    }
                    else if(image==8){
                        if (x <= 0.39 && x >= 0.36 && y <= 0.28 && y >= 0.24){
                            photoView.setImageResource(R.drawable.capture9);
                            image+=1;
                            chrono_image(image);
                        }

                        else{
                            if (SystemClock.elapsedRealtime() - mLastClickTime < 2000){
                                return;
                            }
                            photoView.setClickable(false);
                            mLastClickTime = SystemClock.elapsedRealtime();
                        }
                    }
                    else if(image==9){
                        if (x <= 0.65 && x >= 0.60 && y <= 0.55 && y >= 0.47){
                            photoView.setImageResource(R.drawable.capture10);
                            image+=1;
                            chrono_image(image);
                        }

                        else{
                            if (SystemClock.elapsedRealtime() - mLastClickTime < 2000){
                                return;
                            }
                            photoView.setClickable(false);
                            mLastClickTime = SystemClock.elapsedRealtime();
                        }
                    }
                    else if (image==10){
                        if (x <= 0.50 && x >= 0.47 && y <= 0.26 && y >= 0.20){
                            photoView.setImageResource(R.drawable.capture11);
                            image +=1;
                        chrono_image(image);

                        }

                        else{
                            if (SystemClock.elapsedRealtime() - mLastClickTime < 2000){
                                return;
                            }
                            photoView.setClickable(false);
                            mLastClickTime = SystemClock.elapsedRealtime();
                        }
                    }
                    else {
                        if (!chrono_per_image){
                            scorefin.setVisibility(View.VISIBLE);
                            Chrono.stop();
                            sauvegarde=Chrono.getText();
                            scorefin.setText("Score: "+ sauvegarde);
                        }
                        else{
                            scorefin.setVisibility(View.VISIBLE);
                            scorefin.setText("Vous avez gagné ce mode de jeu");

                        }
                    }
                }


            }
            );




        init();
    }


    private void init(){

    }

    View.OnClickListener commencer_click = new View.OnClickListener() {
        public void onClick(View v) {
            Normal_mod.setVisibility(View.VISIBLE);
            chronomod1.setVisibility(View.VISIBLE);
            chronomod2.setVisibility(View.VISIBLE);
            Commencer.setVisibility(View.INVISIBLE);
            Scores.setVisibility(View.INVISIBLE);
            retour.setVisibility(View.VISIBLE);
        }
    };

    View.OnClickListener Scores_click = new View.OnClickListener() {
        public void onClick(View v) {
            Commencer.setVisibility(View.INVISIBLE);
            Scores.setVisibility(View.INVISIBLE);
            retour.setVisibility(View.VISIBLE);
        }
    };

    View.OnClickListener retour_click = new View.OnClickListener() {
        public void onClick(View v) {
            Commencer.setVisibility(View.VISIBLE);
            Scores.setVisibility(View.VISIBLE);
            Normal_mod.setVisibility(View.INVISIBLE);
            chronomod1.setVisibility(View.INVISIBLE);
            chronomod2.setVisibility(View.INVISIBLE);
            retour.setVisibility(View.INVISIBLE);

        }
    };

    View.OnClickListener normal_click = new View.OnClickListener() {
        public void onClick(View v) {
            Normal_mod.setVisibility(View.INVISIBLE);
            chronomod1.setVisibility(View.INVISIBLE);
            chronomod2.setVisibility(View.INVISIBLE);
            retour.setVisibility(View.INVISIBLE);
            Chrono.setVisibility(View.VISIBLE);
            Chrono.setFormat("%s");
            Chrono.setBase(SystemClock.elapsedRealtime());
            Chrono.start();
            photoView.setVisibility(View.VISIBLE);
            image=1;
            chrono_per_image=false;
        }
    };

    View.OnClickListener chrono2_click = new View.OnClickListener() {
        public void onClick(View v) {
            Normal_mod.setVisibility(View.INVISIBLE);
            chronomod1.setVisibility(View.INVISIBLE);
            chronomod2.setVisibility(View.INVISIBLE);
            Count_down_field.setVisibility(View.VISIBLE);
            photoView.setVisibility(View.VISIBLE);
            retour.setVisibility(View.INVISIBLE);
            image=1;
            chrono_per_image=false;
            My_Count_Down_Timer = new CountDownTimer(120000, 1000) {

                public void onTick(long millisUntilFinished) {
                    Count_down_field.setText("" + millisUntilFinished / 1000);
                }

                public void onFinish() {
                    //photoView.setVisibility(View.INVISIBLE);
                    Count_down_field.setText("");
                    photoView.setClickable(false);
                    photoView.setZoomable(false);
                    scorefin.setVisibility(View.VISIBLE);
                    if (image==0 || image==1)
                    {
                        scorefin.setText("Perdu ! Vous avez trouvez "+(image-1)+" image. Il vous en restez "+(11-(image-1)));
                    }

                    else
                    {
                        scorefin.setText("Perdu ! Vous avez trouvez "+(image-1)+" images. Il vous en restez "+(11-(image-1)));
                    }
                    scorefin.setBackgroundColor(Color.RED);
                    scorefin.setTextColor(Color.WHITE);
                    fin=new CountDownTimer(5000,1000) {


                        public void onTick(long millisUntilFinished) {

                        }


                        public void onFinish() {
                            photoView.setVisibility(View.INVISIBLE);
                            Count_down_field.setVisibility(View.INVISIBLE);
                            Commencer.setVisibility(View.VISIBLE);
                            Scores.setVisibility(View.VISIBLE);
                            scorefin.setVisibility(View.INVISIBLE);

                        }
                    }.start();

                }
            }.start();
        }
    };

    View.OnClickListener chrono1_click = new View.OnClickListener() {
        public void onClick(View v) {
            Normal_mod.setVisibility(View.INVISIBLE);
            chronomod1.setVisibility(View.INVISIBLE);
            chronomod2.setVisibility(View.INVISIBLE);
            Count_down_field.setVisibility(View.VISIBLE);
            photoView.setVisibility(View.VISIBLE);
            retour.setVisibility(View.INVISIBLE);
            image=1;
            chrono_per_image=true;
            chrono_image(image);

        }
    };

    public void chrono_image(final int image){

        if (chrono_per_image==true){

            int time_per_image=220000-((image-1)*20000);


            if (image>=2){

                My_Count_Down_Timer.cancel();
            }


            My_Count_Down_Timer = new CountDownTimer(time_per_image, 1000) {

                public void onTick(long millisUntilFinished) {
                    Count_down_field.setText("" + millisUntilFinished / 1000);
                }

                public void onFinish()
                    {

                    Count_down_field.setText("");

                    photoView.setClickable(false);
                    photoView.setZoomable(false);

                    scorefin.setVisibility(View.VISIBLE);

                    if (image==0 || image==1)
                        {
                        scorefin.setText("Perdu ! Vous avez trouvez "+(image-1)+" image. Il vous en restez "+(11-(image-1)));
                        }

                    else
                        {
                        scorefin.setText("Perdu ! Vous avez trouvez "+(image-1)+" images. Il vous en restez "+(11-(image-1)));
                        }

                    scorefin.setBackgroundColor(Color.RED);
                    scorefin.setTextColor(Color.WHITE);


                    fin=new CountDownTimer(7000,1000) {


                        public void onTick(long millisUntilFinished) {

                        }


                        public void onFinish() {
                            photoView.setVisibility(View.INVISIBLE);
                            Count_down_field.setVisibility(View.INVISIBLE);
                            Commencer.setVisibility(View.VISIBLE);
                            Scores.setVisibility(View.VISIBLE);
                            scorefin.setVisibility(View.INVISIBLE);

                        }
                    }.start();

                }
            }.start();

        }
    }


 }

