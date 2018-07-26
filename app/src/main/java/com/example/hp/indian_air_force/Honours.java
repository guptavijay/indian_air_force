package com.example.hp.indian_air_force;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Honours extends AppCompatActivity {

    ViewFlipper vf;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_honours);
        b1=(Button)findViewById(R.id.b11);
        b2=(Button)findViewById(R.id.b22);
        vf=(ViewFlipper)findViewById(R.id.vf11);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vf.showPrevious();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vf.showNext();
            }
        });
    }
}
