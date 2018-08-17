package com.example.rudra.ramratisinghbalikaintercollege;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import static android.text.Html.fromHtml;

public class Courses extends AppCompatActivity {

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        Toolbar my_toolbar3=(Toolbar) findViewById(R.id.my_toolbar3);
        setSupportActionBar(my_toolbar3);
        getSupportActionBar().setTitle(fromHtml("<font color='#ffffff'>Courses</font>"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
