package com.example.android.infodei;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class FacultyOfIntegratedMedicines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_of_integrated_medicines);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
         TextView DeptOfAnatomy=(TextView)findViewById(R.id.DeptOfAnatomy);
         DeptOfAnatomy.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                Intent intent=new Intent(FacultyOfIntegratedMedicines.this,ICT_DeptOfAnatomy.class);
                startActivity(intent);
             }
         });

    }
}
