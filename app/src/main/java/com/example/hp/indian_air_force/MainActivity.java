package com.example.hp.indian_air_force;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 TextView t1;
 Button b1,b2,b3,b4,b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.t11);
        b1=(Button)findViewById(R.id.b11);
        b2=(Button)findViewById(R.id.b22);
        b3=(Button)findViewById(R.id.b33);
        b4=(Button)findViewById(R.id.b44);
        b5=(Button)findViewById(R.id.b55);
        b6=(Button)findViewById(R.id.b66);
     b1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent i= new Intent(MainActivity.this,History.class);
             startActivity(i);

         }
     });
     b2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent i1= new Intent(MainActivity.this,Honours.class);
             startActivity(i1);
         }
     });
     b6.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent i2= new Intent(MainActivity.this,about.class);
             startActivity(i2);
         }
     });
     b3.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent i3= new Intent(MainActivity.this,Career.class);
             startActivity(i3);
         }
     });
     b4.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

         }
     });
     b5.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             
         }
     });
    }
}
