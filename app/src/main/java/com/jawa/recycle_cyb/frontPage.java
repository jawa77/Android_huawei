package com.jawa.recycle_cyb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class frontPage extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.front_page);


        Button aboutOpen=findViewById(R.id.aboutme);
        Button listOpen=findViewById(R.id.listview);
        Button recylOpen=findViewById(R.id.recycView);

        aboutOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(frontPage.this,"AboutPage",Toast.LENGTH_SHORT).show();
                Intent ab = new Intent(com.jawa.recycle_cyb.frontPage.this,about.class);
                startActivity(ab);     //move login to signup

            }
        });

        listOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(frontPage.this,"WELCOME TO LISTVIEW",Toast.LENGTH_SHORT).show();
                Intent ab = new Intent(com.jawa.recycle_cyb.frontPage.this,Listview.class);
                startActivity(ab);

            }
        });

        recylOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(frontPage.this,"WELCOME TO RECYCLER",Toast.LENGTH_SHORT).show();
                Intent ab = new Intent(com.jawa.recycle_cyb.frontPage.this,MainActivity.class);
                startActivity(ab);

            }
        });
    }


}
