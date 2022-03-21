package com.ETS.Ikbal_Alghifary.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Klub implements Parcelable{
    private String name,desc,detail,imageUrl;

    public Klub(String name,String desc,String imageUrl,String detail){
        this.name=name;
        this.desc=desc;
        this.imageUrl=imageUrl;
        this.detail=detail;
    }

    protected Klub(Parcel in) {
        name = in.readString();
        desc = in.readString();
        imageUrl = in.readString();
        detail = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(desc);
        dest.writeString(imageUrl);
        dest.writeString(detail);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Klub> CREATOR = new Creator<Klub>() {
        @Override
        public Klub createFromParcel(Parcel in) {
            return new Klub(in);
        }

        @Override
        public Klub[] newArray(int size) {
            return new Klub[size];
        }
    };

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getDesc(){
        return desc;
    }
    public void setDesc(String desc){
        this.desc=desc;
    }
    public String getImageUrl(){
        return imageUrl;
    }
    public void setImageUrl(String imageUrl){
        this.imageUrl=imageUrl;
    }
    public  String getDetail(){
        return detail;
    }
    public void setDetail(String detail){
        this.detail=detail;
    }
}
