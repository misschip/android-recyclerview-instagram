package com.pyj.recyclerviewinstagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private RecyclerView rvPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPost = findViewById(R.id.rv_post);

        PostAdapter adapter = new PostAdapter();

        adapter.addItem(new Post("", R.drawable.postpic1));
        adapter.addItem(new Post("", R.drawable.postpic2));
        adapter.addItem(new Post("", R.drawable.postpic3));
        adapter.addItem(new Post("", R.drawable.postpic4));
        adapter.addItem(new Post("", R.drawable.postpic5));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rvPost.setLayoutManager(layoutManager);
        rvPost.setAdapter(adapter);
    }
}