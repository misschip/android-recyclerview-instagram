package com.pyj.recyclerviewinstagram;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.MyViewHolder> {

    private static final String TAG = "ProfileAdapter";

    private List<Profile> items = new ArrayList<>();

    public void addItem(Profile profile) {
        items.add(profile);
    }


    // 껍데기만 만들어 줌. 1번으로 실행
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout_profile, parent, false);

        Log.d(TAG, "onCreateViewHolder: 껍데기 만들기");

        return new MyViewHolder(view);
    }

    // 껍데기에 데이터 바인딩 해줌. 2번으로 실행
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: 데이터 바인딩");
        Profile profile = items.get(position);
        holder.setItem(profile);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    // ViewHolder : 뷰들의 책꽂이
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        // 규칙 1
        private TextView tvTitle;
        private ImageView ivImgResource;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTitle = itemView.findViewById(R.id.tv_pro1);
            ivImgResource = itemView.findViewById(R.id.img_pro1);
        }

        // 규칙 3
        public void setItem(Profile profile) {
            tvTitle.setText(profile.getTitle());
            ivImgResource.setImageResource(profile.getImgResource());
        }
    }
}
