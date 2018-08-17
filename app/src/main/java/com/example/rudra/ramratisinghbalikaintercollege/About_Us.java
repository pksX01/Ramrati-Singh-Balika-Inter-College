package com.example.rudra.ramratisinghbalikaintercollege;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import static android.text.Html.fromHtml;
//import android.view.Window;


public class About_Us extends AppCompatActivity {
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__us);
        Toolbar my_toolbar=(Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(my_toolbar);
        //getSupportActionBar().setTitle("About Us");
        getSupportActionBar().setTitle(fromHtml("<font color='#ffffff'>About Us</font>"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
