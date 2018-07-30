package com.example.hp.indian_air_force;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class martyrs extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5,t6,t7,t8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_martyrs);
        t1=(TextView)findViewById(R.id.tv1);
        t2=(TextView)findViewById(R.id.tv2);
        t3=(TextView)findViewById(R.id.tv3);
        t4=(TextView)findViewById(R.id.tv4);
        t5=(TextView)findViewById(R.id.tv5);
        t6=(TextView)findViewById(R.id.tv6);
        t7=(TextView)findViewById(R.id.tv7);
        t8=(TextView)findViewById(R.id.tv8);



        t1.setText("Some men are born to greatness. Others carve their part to it. Subroto Mukerjee was one of the latter category who paved the way to his own tryst with destiny and laid the foundations of India's Air Force in the process. The story of his life is one of determination, dedication and total commitment to the cause of the service that he guided from its inception till its transformation into the Air Arm of independent India. In the early 1930's, when the British government in India could no longer ignore the growing demands of the Indian people for greater representation in the higher ranks of the defence services, it grudgingly began the process of 'Indianisation' of the services. As a result, the Indian Air Force (IAF) came into being on 08 October 1932. \n"+
       "\n"+
                "Tragically, Subroto Mukerjee's brilliant career was cut short in its prime in 1960. Yet, his legacy lives on, and forms the cornerstone of the hallowed traditions of the service whose very foundations he laid, and whose edifice he built in the early years of its history.");

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("http://indianairforce.nic.in/content/am-subroto-mukerjee");
                Intent i5= new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i5);
            }
        });

        t3.setText("It was under the able leadership of Air Chief Marshal Pratap Chandra Lal, that the Indian Air Force won its most decisive victory in 1971. Paradoxically, unlike the earlier Chiefs, Lal was no fighter jock. He was an instructor and a manager, par excellence. His contirbution to India's aviation industry via tenures with the Indian Airlines Corp. and Hindustan Aeronautics bear testament to his professional abilities. He was just the sort of chap who could, and did, mould a lagre and rapidly expanding air force into and efficient fighting force.");

        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri= Uri.parse("http://indianairforce.nic.in/content/air-chief-marshal-pc-lal");
                Intent i5= new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i5);
            }
        });

        t5.setText("Air Commodore Mehar Singh MVC DSO, affectionately called 'Baba' Mehar Singh by his associates and admirers in Indian Air Force, was a legendary pilot and a flying prodigy . His exploits with the flying machines are well known and much celebrated. He was a born leader of men and a team man who always led from the front. Mehar Singh was immensely successful in earning respect of men he commanded by his bravery , daring feats and brilliantleadership. He was a role model for the young fliers in the IAF. The legend of Baba Mehar Singh is replete with splendid examples of professionalism dedication, devotion to duty , courage and commitment indeed true characteristics of an ideal Air Warrior .");

        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri= Uri.parse("http://indianairforce.nic.in/content/air-cmde-mehar-singh");
                Intent i5= new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i5);
            }
        });

        t7.setText("The story of Air Vice Marshal Harjinder Singh is the story of the birth and growth of Indian Air Force in its early days, for he had joined the IAF as a Hawai Sepoy , the first to join IAF on its formation and rose to the rank of Air Vice Marshal to command the Maintenance Command of IAF . His span of service covers aperiod of thirty-two years: from the formation of the infant Indian Air Force in 1932 to the early sixties. A long and distinguished career is recaptured here, in this portrayal ofa daring and self-confident Air Warrior .");

        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri= Uri.parse("http://indianairforce.nic.in/content/avm-harjinder-singh");
                Intent i5= new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i5);
            }
        });
    }
}
