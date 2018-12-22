package com.example.rudra.ramratisinghbalikaintercollege;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import static android.text.Html.fromHtml;

public class Contact extends AppCompatActivity {

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        Toolbar my_toolbar2=(Toolbar) findViewById(R.id.my_toolbar2);
        setSupportActionBar(my_toolbar2);
        getSupportActionBar().setTitle(fromHtml("<font color='#ffffff'>Contact Us</font>"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       /* TextView t1 = (TextView) findViewById(R.id.fb_txt);
        t1.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t2 = (TextView) findViewById(R.id.insta_txt);
        t2.setMovementMethod(LinkMovementMethod.getInstance());*/
    }
}
