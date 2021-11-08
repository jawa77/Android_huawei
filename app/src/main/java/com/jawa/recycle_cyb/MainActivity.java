package com.jawa.recycle_cyb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter; //namma kitta data vangi recyclerview ku tharum
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ArrayList<cardvieww> data=new ArrayList<>();

        data.add(new cardvieww(R.drawable.j11,"PicOne"));
        data.add(new cardvieww(R.drawable.j16,"PicTwo"));
        data.add(new cardvieww(R.drawable.j13,"PicThree"));
        data.add(new cardvieww(R.drawable.j14,"PicFour"));
        data.add(new cardvieww(R.drawable.j12,"PicFive"));
        data.add(new cardvieww(R.drawable.j17,"PicSix"));
        data.add(new cardvieww(R.drawable.j7,"PhotoGraphy"));
        data.add(new cardvieww(R.drawable.j1,"Natural"));
        data.add(new cardvieww(R.drawable.j2,"Travel"));
        data.add(new cardvieww(R.drawable.j5,"The Cat"));
        data.add(new cardvieww(R.drawable.j6,"LoneLiness"));
        data.add(new cardvieww(R.drawable.j16,"PicTwo"));
        data.add(new cardvieww(R.drawable.j13,"PicThree"));
        data.add(new cardvieww(R.drawable.j14,"PicFour"));
        data.add(new cardvieww(R.drawable.j17,"PicFive"));




        recyclerView=findViewById(R.id.Recyclercard);


        recyclerView.setHasFixedSize(true); // it is for perfomence when lot of card is available

        layoutManager=new LinearLayoutManager(this);
        adapter=new InstagramAdapter(data);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
}