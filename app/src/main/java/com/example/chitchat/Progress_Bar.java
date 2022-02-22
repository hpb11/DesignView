package com.example.chitchat;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class Progress_Bar extends AppCompatActivity {
    LottieAnimationView lottieAnimationView;
    String s;
    String str,sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_progress_bar);
        if(getSupportActionBar()!=null){
            getSupportActionBar().hide();}
        lottieAnimationView=findViewById(R.id.loading);
    s= getIntent().getStringExtra("Next_activity");
   str=getIntent().getStringExtra("Next_activity");
   sp=getIntent().getStringExtra("Next_activity");
        lottieAnimationView.animate().setDuration(2500).setStartDelay(2500);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            //    Intent intent=new Intent(getApplicationContext(),Quiz.class);
               // startActivity(intent);
                if(s.length()==10)
                {
                        Intent intent=new Intent(getApplicationContext(),Verification.class);
                        intent.putExtra("phoneno",s);
                     startActivity(intent);
                }
            if(str.equals("Success"))
                {
                    Intent intent=new Intent(getApplicationContext(),UserInfo.class);
                    intent.putExtra("phoneno",s);
                    startActivity(intent);
                }
            if(sp.equals("splash"))
            {
                Intent intent = new Intent(getApplicationContext(), ChatScreen.class);
                    startActivity(intent);
                    finish();
            }

//
            }
        }, 4500);



    }
}