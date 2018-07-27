package com.example.hp.indian_air_force;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class Honours extends AppCompatActivity {

    ViewFlipper vf;
    Button b1,b2;
    TextView t1,t2,t3,t4,t5,t6,t7,t8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_honours);
        b1=(Button)findViewById(R.id.b11);
        b2=(Button)findViewById(R.id.b22);

        t1=(TextView)findViewById(R.id.tv1);
        t2=(TextView)findViewById(R.id.tv2);
        t3=(TextView)findViewById(R.id.tv3);
        t4=(TextView)findViewById(R.id.tv4);
        t5=(TextView)findViewById(R.id.tv5);
        t6=(TextView)findViewById(R.id.tv6);
        t7=(TextView)findViewById(R.id.tv7);
        t8=(TextView)findViewById(R.id.tv8);
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
        t1.setText("Circular in shape, made of bronze, one and three eighth inches in diameter and on obverse, four replicas of “Indra’s Vajra” with the State Emblem (including the motto), embossed in the centre.\n" +
                " On its reverse, it shall have embossed Param Vir Chakra both in Hindi and English with two lotus flowers between Hindi and English.  The fitting will be swivel mounting.");

        t2.setText("The following categories of personnel shall be eligible for the Chakra :-\n" +
                " * Officers, men and women of all ranks of the Army, the Navy and the Air Force, of any of the Reserve Forces, of the constituted Armed Forces.\n" +
                " * Matrons, Sisters, Nurses and the staff of the Nursing Services and other Services pertaining to Hospitals and Nursing and Civilians serving regularly or temporarily under the orders of any of the above-mentioned Forces.\"");

        t3.setText("The following categories of personnel shall be eligible for the Chakra :-\n" +
                " * Officers, men and women of all ranks of the Army, the Navy and the Air Force, of any of the Reserve Forces, of the Territorial Army, Militia and of any other lawfully constituted Armed Forces.\n" +
                "Members of the Nursing Services of the Armed Forces.\n" +
                " * Civilian citizens of either sex in all walks of life and members of Police Forces including Central Para-Military Forces and Railway Protection Force.\"");

        t4.setText("The following categories of personnel shall be eligible for the Chakra :-\n" +
                " * Officers, men and women of all ranks of the Army, the Navy and the Air Force, of any of the Reserve Forces, of the Territorial Army, Militia and of any other lawfully constituted Armed Forces.\n" +
                "Members of the Nursing Services of the Armed Forces.\n" +
                " * Civilian citizens of either sex in all walks of life and members of Police Forces including Central Para-Military Forces and Railway Protection Force.\"");

        t5.setText("The following categories of personnel shall be eligible for the Chakra :-\n" +
                " * Officers, men and women of all ranks of the Army, the Navy and the Air Force, of any of the Reserve Forces, of the Territorial Army, Militia and of any other lawfully constituted Armed Forces.\n" +
                " * Matrons, Sisters, Nurses and the staff of the Nursing Services and other Services pertaining to Hospitals and Nursing and Civilians of either sex serving regularly or temporarily under the orders, directions or supervision of any of the above-mentioned Forces.\"");

        t6.setText("The following categories of personnel shall be eligible for the Chakra :-\n" +
                " * Officers, men and women of all ranks of the Army, the Navy and the Air Force, of any of the Reserve Forces, of the Territorial Army, Militia and of any other lawfully constituted Forces.\n" +
                " * Members of the Nursing Services of the Armed Forces.\n" +
                " * Civilian citizens of either sex in all walks of life and members of Police Forces including Central Para-Military Forces and Railway Protection Force.\"");

        t7.setText("The following categories of personnel shall be eligible for the award of the Medal:-\n" +
                "\n" +
                " * All ranks of the Army, the Navy and the Air Force including Territorial Army Units, Auxiliary and Reserve Forces (when embodied) and other lawfully constituted Armed Forces.\n" +
                " * Nursing officers and other members of the Nursing Services in the Armed Forces.\"");

        t8.setText("The following categories of personnel shall be eligible for the medal :-\n" +
                "\n" +
                " * All ranks of the Army, the Navy and the Air Force including Territorial Army Units, Auxiliary and Reserve Forces (when embodied) and other lawfully constituted Armed Forces.\n" +
                " * Nursing officers and other members of the Nursing Services in the Armed Forces.\"");
    }
}
