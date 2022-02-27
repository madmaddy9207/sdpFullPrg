package com.example.sdpfullprg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Name extends AppCompatActivity {
TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        res=(TextView)findViewById(R.id.res);
        Bundle b=getIntent().getExtras();
        String s=b.getString("nm");
        String a=res.getText().toString();
        res.setText(a+" "+s);
    }
}