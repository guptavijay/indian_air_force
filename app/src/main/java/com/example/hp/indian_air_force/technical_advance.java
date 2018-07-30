package com.example.hp.indian_air_force;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class technical_advance extends AppCompatActivity {

    TextView t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technical_advance);

        t1=(TextView)findViewById(R.id.t11);
        t2=(TextView)findViewById(R.id.t22);
        t3=(TextView)findViewById(R.id.t33);
t4=(TextView)findViewById(R.id.t44);


        t1.setText("The Indian Air Force has been undergoing a modernization program to replace and upgrade its ageing and outdated equipment  For that reason it has started procuring and developing aircraft, weapons, associated technologies, and infrastructures.\n"+
                        "This consistes of Fifth Generation Aircrafts,Helicopters,UCAVs Drones,Transport Aircrafts,Airborne Early warning and Control system,Combat Aircrafts and Trainer aircrafts.");

        t2.setText("The Sukhoi/HAL Fifth Generation Fighter Aircraft (FGFA) or Perspective Multi-Role Fighter (PMF) is a fifth-Generation fighter being developed by India and Russia.It is basically the variant or derivative project from the PAK FA (T-50 is the prototype) Being developed for the Indian Air Force. .It is expected that Sukhoi/HAL FGFA will join Indian Air Force in 2019 as previously it was decided that it will join IAF in 2017 but Indian Ministry of defence (MOD)announced a two-year delay.");

        t3.setText("The HAL Advanced Medium Combat Aircraft (AMCA) is an Indian Proposal for a fifth-generation fighter aircraft being developed and designed by India’s aeronautical Development Agency and to be manufactured by Hindustan Aeronautics Limited (HAL). It comprises the supercruise,stealth,AESA radar,manoeuvrability and advanced avionics to overcome and suppress previous generation fighter aircraft along with many ground and maritime defences.");

        t4.setText("The Airborne early Warning and control System (AEWACS) is a project of India’s defence Research and development organisation to develop an airborne early warning and control system for the Indian Air force.It is multisensor AEW&C system on a carrier jet being developed by DRDO in collaboration with CAB(Cantre for Airborne Systems) that provides an airborne surveillance system.It is the first native AEW system being developed by DRDO and CAB.");
    }
}
