package com.pyj.recyclerviewinstagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private RecyclerView rvPost;
    private RecyclerView rvProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPost = findViewById(R.id.rv_post);
        rvProfile = findViewById(R.id.rv_profile);

        PostAdapter adapter = new PostAdapter();
        ProfileAdapter profAdapter = new ProfileAdapter();

        adapter.addItem(new Post("", R.drawable.postpic1));
        adapter.addItem(new Post("", R.drawable.postpic2));
        adapter.addItem(new Post("", R.drawable.postpic3));
        adapter.addItem(new Post("", R.drawable.postpic4));
        adapter.addItem(new Post("", R.drawable.postpic5));

        profAdapter.addItem(new Profile("Your Story", R.drawable.propic1));
        profAdapter.addItem(new Profile("Your Story", R.drawable.propic2));
        profAdapter.addItem(new Profile("Your Story", R.drawable.propic3));
        profAdapter.addItem(new Profile("Your Story", R.drawable.propic4));
        profAdapter.addItem(new Profile("Your Story", R.drawable.propic5));
        profAdapter.addItem(new Profile("Your Story", R.drawable.propic1));
        profAdapter.addItem(new Profile("Your Story", R.drawable.propic2));
        profAdapter.addItem(new Profile("Your Story", R.drawable.propic3));
        profAdapter.addItem(new Profile("Your Story", R.drawable.propic4));
        profAdapter.addItem(new Profile("Your Story", R.drawable.propic5));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rvPost.setLayoutManager(layoutManager);
        rvPost.setAdapter(adapter);

        RecyclerView.LayoutManager profLayoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        rvProfile.setLayoutManager(profLayoutManager);
        rvProfile.setAdapter(profAdapter);
    }
}