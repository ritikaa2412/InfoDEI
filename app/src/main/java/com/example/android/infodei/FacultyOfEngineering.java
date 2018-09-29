package com.example.android.infodei;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class FacultyOfEngineering extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_of_engineering);
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
        TextView DeptOfElectricalEngg=(TextView)findViewById(R.id.DeptOfElectricalEngg);
        DeptOfElectricalEngg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FacultyOfEngineering.this,DepartmentOfElectricalEngineering.class);
                startActivity(intent);
            }
        });
        TextView DeptOfMechanicalEngg=(TextView)findViewById(R.id.DeptOfMechanicalEngg);
        DeptOfMechanicalEngg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FacultyOfEngineering.this,DepartmentOfMechanicalEngineering.class);
                startActivity(intent);
            }
        });
        TextView Workshop=(TextView)findViewById(R.id.workshop);
        Workshop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FacultyOfEngineering.this,Workshop.class);
                startActivity(intent);
            }
        });
    }
}
