package com.example.asus.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] myitems= { "as","as","aswe"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.list_layout,myitems);

        ListView myfirstlistview = (ListView) findViewById(R.id.myfirstlistview);

        myfirstlistview.setAdapter(adapter);
    }
}
