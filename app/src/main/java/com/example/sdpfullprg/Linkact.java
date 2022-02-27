package com.example.sdpfullprg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Linkact extends AppCompatActivity {
Button b;
EditText nm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linkact);
        b=(Button)findViewById(R.id.button);
        nm=(EditText)findViewById(R.id.nm);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=nm.getText().toString();
    Intent i= new Intent(Linkact.this,Name.class);
    i.putExtra("nm",s);
    startActivity(i);
    startActivity(i);
            }
        });
    }
}