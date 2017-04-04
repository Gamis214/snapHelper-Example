package com.example.gamis214.recyclerview_snappinghelper_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.Gravity;

import com.github.rubensousa.gravitysnaphelper.GravitySnapHelper;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private String[] listStrings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.list_item);
        setArrayString();

        //-->NATIVE METHOD TO CENTER THE ITEM
        //SnapHelper snapHelper = new LinearSnapHelper();
        //snapHelper.attachToRecyclerView(recyclerView);

        //-->USING API EXTERNAL USING *START* or *END* HORIZONTAL
        SnapHelper snapHelperStart = new GravitySnapHelper(Gravity.START);
        snapHelperStart.attachToRecyclerView(recyclerView);

        //--> USING API EXTERNAL USING *TOP* or *BOTTOM* VERTICAL
        //SnapHelper snapHelperTop = new GravitySnapHelper(Gravity.TOP);
        //snapHelperTop.attachToRecyclerView(recyclerView);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(new AdapterList(listStrings));

    }

    public void setArrayString(){
        listStrings = new String[10];

        for (int i=0 ;i <= 9;i++){
            String number = Integer.toString(i);
            listStrings[i] = number;
        }

    }
}
