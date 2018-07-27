package com.example.hp.indian_air_force;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class Career extends AppCompatActivity {

    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career);

        t1=(TextView)findViewById(R.id.tv11);
        t1.setText("Whether you are a graduate or you have finished your schooling or you have passed your class tenth, Indian Air Force has an exciting career opportunity for you. You can join the Indian Air force to jump start a secure future for you and your family. However IAF focuses solely on the prospects for graduates. \n" +
        "\n"+
                "One can join the Indian Air Force as an officer in the flying, technical or the ground duty branches depending on his/her educational qualification. These three branches of the IAF have further sub-streams:\n" +
                "\n" +
                "(a) Flying Branch: Fighter pilots, Transport pilots, Helicopter pilots - You would be working as any of these pilots both during peace and war. You can get into the flying branch as a graduate [through CDS exam (men), through AFCATexam (men & women), through NCC special entry (men)]. You can also get in after 10+2 by qualifying the NDA/ NA exam.\n" +
                "\n" +
                "(b) Technical Branch: Mechanical, Electronics - You would be taking care of some of the most sophisticated equipments in the world - You can get into this branch through the exam, AFCAT or through University Entry Scheme (UES.)\n" +
                "\n" +
                "(c) Ground Duty Branch: Administration, Accounts, Logistics, Education, Meteorology - As part of these mentioned departments, you would be looking after and maintaining human & material resource/ managing funds, work as internal auditors/ work as air traffic controller or fighter controller. You can get into this branch by qualifying AFCAT.\n");
    }
}
