package com.example.asus.listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {


    private List<one_item> availlang = new ArrayList<one_item>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        availlang.add(new one_item("HTML",R.mipmap.ic_launcher, 40));
        availlang.add(new one_item("CSS",R.mipmap.ic_launcher, 50));
        availlang.add(new one_item("JAVA",R.mipmap.ic_launcher, 60));
        availlang.add(new one_item("C++",R.mipmap.ic_launcher, 70));

        ArrayAdapter<one_item> adapter = new customadapter();

        ListView myfirstlistview = ( ListView )(findViewById(R.id.myfirstlistview));
        myfirstlistview.setAdapter(adapter);

    }

    private class customadapter extends ArrayAdapter< one_item> {

        public customadapter() {
            super(MainActivity.this,R.layout.list_layout,availlang);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent ){

            if(convertView == null){
                convertView = getLayoutInflater().inflate(R.layout.list_layout , parent,false);

            }

            one_item mycurrentitem = availlang.get(position);

            ImageView myimg = (ImageView) convertView.findViewById(R.id.imageView);
            TextView myHeading = ( TextView) convertView.findViewById(R.id.textView);
            TextView myDesc = (TextView) convertView.findViewById(R.id.textView2);


            myimg.setImageResource(mycurrentitem.getImgid());
            myHeading.setText(mycurrentitem.getName());
            myDesc.setText(String.valueOf(mycurrentitem.getNumber()));

            return convertView;
        }




    }
}
