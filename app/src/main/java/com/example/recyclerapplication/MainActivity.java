package com.example.recyclerapplication;

import android.os.Bundle;
import android.view.Gravity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        actionBar.setCustomView(getLayoutInflater().inflate(R.layout.action_bar_home, null),
                new ActionBar.LayoutParams(
                        ActionBar.LayoutParams.WRAP_CONTENT,
                        ActionBar.LayoutParams.MATCH_PARENT,
                        Gravity.CENTER
                )
        );


        MyListData[] myListData = new MyListData[] {
                new MyListData("Name", R.drawable.lic_icon,"LIC Payment","Weekly starting from 03/04/2019",getResources().getString(R.string.Rs)+" 2000"),
                new MyListData("Name", R.drawable.lic_icon,"LIC Payment","Weekly starting from 03/04/2019",getResources().getString(R.string.Rs)+" 2000"),
                new MyListData("Name", R.drawable.lic_icon,"LIC Payment","Weekly starting from 03/04/2019",getResources().getString(R.string.Rs)+" 2000"),
                new MyListData("Name", R.drawable.lic_icon,"LIC Payment","Weekly starting from 03/04/2019",getResources().getString(R.string.Rs)+" 2000"),
                new MyListData("Name", R.drawable.lic_icon,"LIC Payment","Weekly starting from 03/04/2019",getResources().getString(R.string.Rs)+" 2000"),
                new MyListData("Name", R.drawable.lic_icon,"LIC Payment","Weekly starting from 03/04/2019",getResources().getString(R.string.Rs)+" 2000"),
                new MyListData("Name", R.drawable.lic_icon,"LIC Payment","Weekly starting from 03/04/2019",getResources().getString(R.string.Rs)+" 2000")
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}