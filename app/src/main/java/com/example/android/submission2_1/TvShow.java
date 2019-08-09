package com.example.android.submission2_1;

import android.os.Parcel;
import android.os.Parcelable;

public class TvShow implements Parcelable {
    private String name, duration, photo, rating, desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.duration);
        dest.writeString(this.photo);
        dest.writeString(this.rating);
        dest.writeString(this.desc);
    }

    public TvShow(){
    }

    private TvShow(Parcel in){
        this.name = in.readString();
        this.duration = in.readString();
        this.photo = in.readString();
        this.rating = in.readString();
        this.desc = in.readString();
    }

    public static final Parcelable.Creator<TvShow> CREATOR = new Parcelable.Creator<TvShow>() {
        @Override
        public TvShow createFromParcel(Parcel source) {
            return new TvShow(source);
        }
        @Override
        public TvShow[] newArray(int size) {
            return new TvShow[size];
        }
    };
}
