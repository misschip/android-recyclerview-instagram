package com.pyj.recyclerviewinstagram;

public class Profile {
    String title;
    int imgResource;    // 이미지 id값

    public Profile(String title, int imgResource) {
        this.title = title;
        this.imgResource = imgResource;
    }

    public String getTitle() {
        return title;
    }

    public int getImgResource() {
        return imgResource;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImgResource(int imgResource) {
        this.imgResource = imgResource;
    }
}
