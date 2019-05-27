package com.halo.dashboardmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Activity_Mainlec extends AppCompatActivity {

    RelativeLayout rellay_Mydetl,rellay_editclass,rellay_printqr,rellay_logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainlec);


        rellay_Mydetl=findViewById(R.id.rellay_Mydetl);
        rellay_editclass=findViewById(R.id.rellay_editclass);
        rellay_printqr = findViewById(R.id.rellay_printqr);
        rellay_logout= findViewById(R.id.rellay_logout);

        rellay_Mydetl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Mainlec.this, Activity_myDetailslec.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });

        rellay_editclass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Mainlec.this, Activity_editclass.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
        rellay_printqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Mainlec.this, Activity_printqr.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });

        rellay_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Mainlec.this, Activity_login.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });

    }
}
