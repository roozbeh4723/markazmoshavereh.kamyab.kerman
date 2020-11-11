package com.markazmoshaverehkamyabkerman;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView vv=findViewById(R.id.vv);
        Button btnsave=findViewById(R.id.btnsave);
        Button btncancel=findViewById(R.id.btncancel);
        String url="https://hw7.cdn.asset.aparat.com/aparat-video/048790840f4c75a3081496b539a2ce5726832123-144p.mp4";
        vv.setMediaController(new MediaController(this));
        vv.setVideoURI(Uri.parse(url));
        vv.start();
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
Toast.makeText(MainActivity.this,"اطلاعات شما با موفقیت ذخیره شد!",Toast.LENGTH_LONG).show();           }
        });
        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"شما منصرف شدید!" ,Toast.LENGTH_SHORT).show();
            }
        });
    }
}