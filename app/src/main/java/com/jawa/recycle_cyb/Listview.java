package com.jawa.recycle_cyb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Listview extends AppCompatActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        lv=findViewById(R.id.listvw);

        String []name={" Python"," JavaScript"," Kotlin"," Ruby",
                " C#"," C++"," Html"," CSS"," Bash"," C"," Java",
                " Python"," JavaScript"," Kotlin"," Ruby" , " C#",
                " C++"," Html"," CSS"," Bash"," C"," Java"};
        Integer[]img={R.drawable.py,R.drawable.js,R.drawable.kotlin, R.drawable.ruby,
                R.drawable.cshar,R.drawable.cplus,R.drawable.html,R.drawable.css,
                R.drawable.bash, R.drawable.c, R.drawable.java,R.drawable.py,
                R.drawable.js,R.drawable.kotlin, R.drawable.ruby, R.drawable.cshar,
                R.drawable.cplus,R.drawable.html,R.drawable.css,
                R.drawable.bash, R.drawable.c, R.drawable.java};

        MyListAdapter adapter=new MyListAdapter(this, name,img);
        lv.setAdapter(adapter);

    }



    public class MyListAdapter extends ArrayAdapter<String> {

        private final Activity context;
        private final String[] name;
        private final Integer[] img;

        public MyListAdapter(Activity context, String[] name,Integer[] img) {
            super(context, R.layout.list2_view, name);
            // TODO Auto-generated constructor stub

            this.context=context;
            this.img = img;
            this.name=name;
        }

        public View getView(int position, View view, ViewGroup parent) {
            LayoutInflater inflater=context.getLayoutInflater();
            View rowView=inflater.inflate(R.layout.list2_view, null,true);

            TextView titleText = (TextView) rowView.findViewById(R.id.title);
            ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);

            titleText.setText(name[position]);
            imageView.setImageResource(img[position]);

            return rowView;

        };
    }

}

