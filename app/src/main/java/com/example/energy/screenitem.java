package com.example.energy;

public class screenitem {
    String Title,Description;
    int ScreenImg;
    public screenitem(String title,String description,int screenImg){
        Title = title;
        Description = Description;
        ScreenImg = screenImg;

    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setScreenImg(int screenImg) {
        ScreenImg = screenImg;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public int getScreenImg() {
        return ScreenImg;
    }
}
