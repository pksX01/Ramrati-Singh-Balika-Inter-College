package com.example.rudra.ramratisinghbalikaintercollege;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import static android.text.Html.fromHtml;

public class photos extends AppCompatActivity {

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photos);
        Toolbar my_toolbar4=(Toolbar) findViewById(R.id.my_toolbar4);
        setSupportActionBar(my_toolbar4);
        getSupportActionBar().setTitle(fromHtml("<font color='#ffffff'>Photos</font>"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
