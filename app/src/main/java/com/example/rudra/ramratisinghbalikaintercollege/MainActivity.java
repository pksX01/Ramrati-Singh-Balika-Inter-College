package com.example.rudra.ramratisinghbalikaintercollege;

import android.content.Intent;
//import android.provider.Contacts;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v7.widget.Toolbar;

import static android.text.Html.fromHtml;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar my_toolbar1=(Toolbar) findViewById(R.id.my_toolbar1);
        setSupportActionBar(my_toolbar1);
        getSupportActionBar().setTitle(fromHtml("<font color='#ffffff'>R.S.G.I.C.</font>"));

    }

    public void about_us(View view) {
        Intent intent=new Intent(MainActivity.this,About_Us.class);
        startActivity(intent);
    }
    public void courses(View view){
        Intent intent=new Intent(MainActivity.this,Courses.class);
        startActivity(intent);
    }
    public void contact(View view){
        Intent intent=new Intent(MainActivity.this,Contact.class);
        startActivity(intent);
    }
    public void photos(View view){
        Intent intent=new Intent(MainActivity.this,photos.class);
        startActivity(intent);
    }
}