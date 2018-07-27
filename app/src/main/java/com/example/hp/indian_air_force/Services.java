package com.example.hp.indian_air_force;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Services extends AppCompatActivity {

    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        t1=(TextView)findViewById(R.id.t33);
        t1.setText("The procedure for grant of family pension after the unfortunate demise of pensioners was time consuming and was causing inconvenience to the family. Therefore a need was felt to endorse wife's name in the PPO for sanction of family pension in order to avoid delay/overcome difficulties experienced during the past. Hence, the system of Joint Notification of wife's name for family pension together with service pension was started wef 01 Mar 1985.\n" +
                "\n" +
                "For the retirees of period prior to 01 Mar 1985, a separate PPO for endorsement of family pension is being issued on receipt of applications from affected pensioners. Despite wide publicity, it is found that Joint Notification is yet to be done in respect of a large number of pensioners including the ones who are married/re-married after retirement.\n" +
                "\n" +
                "All the eligible and affected pensioners are required to submit requisite form of application (Appendix-I) (Specimen is placed at Appendix-A) in triplicate duly completed and verified by their Pension Disbursing Authority to AFRO (OIC Pen & Wel Wing), Subroto Park, New Delhi at the earliest. Application form either could be down loaded or obtained from AFRO (OIC Pen & Wel Wing).");
    }
}
