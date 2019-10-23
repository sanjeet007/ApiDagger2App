package com.ezimax.apidagger2app;

public class Songs {

    private String songTitle;
    private String songAuthor;
    private String songImage;
    public Songs(String songTitle, String songAuthor, String songImage) {
        this.songTitle = songTitle;
        this.songAuthor = songAuthor;
        this.songImage = songImage;
    }
    public String getSongTitle() {
        return songTitle;
    }
    public String getSongAuthor() {
        return songAuthor;
    }
    public String getSongImage() {
        return songImage;
    }
}