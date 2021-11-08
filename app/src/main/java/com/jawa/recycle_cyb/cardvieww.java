package com.jawa.recycle_cyb;

public class cardvieww {

    private int myimageSource;
    private String Text;


    public cardvieww(int myimageSource, String text) {
        this.myimageSource = myimageSource;  // constuctor vera class input std(something) ithar kulla tharalam
        Text = text;
    }

    public int getMyimageSource() {
        return myimageSource;
    }

    public void setMyimageSource(int myimageSource) {
        this.myimageSource = myimageSource;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }
}
