package com.example.nestedrecycle;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    ArrayList<ExampleItem> exampleList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        exampleList.add(new ExampleItem("Basic Computer Skills", "Learn Basic at your own pace.Become an expert"));
        exampleList.add(new ExampleItem("Programming Language", "Learn Programming Language at your own pace.Become an expert"));
        exampleList.add(new ExampleItem("Become a Web Developer", "Learn Web development at your own pace.Become an expert"));
        exampleList.add(new ExampleItem("Become a Android Developer", "Learn Android Development at your own pace.Become an expert"));
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList,MainActivity.this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
    }
}
