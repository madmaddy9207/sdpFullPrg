package com.example.sdpfullprg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
CardView cardView1,cardView3,cardView2,cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView1=findViewById(R.id.cardView1);
        cardView2=findViewById(R.id.cardView2);
        cardView3=findViewById(R.id.cardView3);
        cardView=findViewById(R.id.cardView4);
        cardView.setRadius(5.0f);
        cardView.setCardElevation(11.0f);
        cardView.setUseCompatPadding(true);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,HelloWorld.class);
                startActivity(i);
            }
        });
cardView2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent j=new Intent(MainActivity.this,Linkact.class);
        startActivity(j);
    }
});

cardView3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent k=new Intent(MainActivity.this,ImplicitIntent.class);
        startActivity(k);
    }
});
    }
}