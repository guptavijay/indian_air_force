package com.example.hp.indian_air_force;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ranks extends AppCompatActivity {

    ImageView i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranks);
        i1=(ImageView)findViewById(R.id.iv1);
        i2=(ImageView)findViewById(R.id.iv2);
        i3=(ImageView)findViewById(R.id.iv3);
        i4=(ImageView)findViewById(R.id.iv4);
        i5=(ImageView)findViewById(R.id.iv5);
        i6=(ImageView)findViewById(R.id.iv6);
        i7=(ImageView)findViewById(R.id.iv7);
        i8=(ImageView)findViewById(R.id.iv8);
        i9=(ImageView)findViewById(R.id.iv9);
        i10=(ImageView)findViewById(R.id.iv10);

        b1=(Button)findViewById(R.id.b11);
        b2=(Button)findViewById(R.id.b22);
        b3=(Button)findViewById(R.id.b33);
        b4=(Button)findViewById(R.id.b44);
        b5=(Button)findViewById(R.id.b55);
        b6=(Button)findViewById(R.id.b66);
        b7=(Button)findViewById(R.id.b77);
        b8=(Button)findViewById(R.id.b88);
        b9=(Button)findViewById(R.id.b99);
        b10=(Button)findViewById(R.id.b101);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(ranks.this,rank1.class);
                startActivity(i);
            }
        });
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(ranks.this,rank1.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(ranks.this,rank2.class);
                startActivity(i);
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(ranks.this,rank2.class);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(ranks.this,rank3.class);
                startActivity(i);
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(ranks.this,rank3.class);
                startActivity(i);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(ranks.this,rank4.class);
                startActivity(i);
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(ranks.this,rank4.class);
                startActivity(i);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(ranks.this,rank5.class);
                startActivity(i);
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(ranks.this,rank5.class);
                startActivity(i);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(ranks.this,rank6.class);
                startActivity(i);
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(ranks.this,rank6.class);
                startActivity(i);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(ranks.this,rank7.class);
                startActivity(i);
            }
        });
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(ranks.this,rank7.class);
                startActivity(i);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(ranks.this,rank8.class);
                startActivity(i);
            }
        });
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(ranks.this,rank8.class);
                startActivity(i);
            }

        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(ranks.this,rank9.class);
                startActivity(i);
            }
        });
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(ranks.this,rank9.class);
                startActivity(i);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(ranks.this,rank10.class);
                startActivity(i);
            }
        });
        i10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(ranks.this,rank10.class);
                startActivity(i);
            }
        });
    }
}
