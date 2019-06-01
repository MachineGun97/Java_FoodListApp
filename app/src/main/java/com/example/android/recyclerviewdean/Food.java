package com.example.android.recyclerviewdean;

import android.os.Parcel;
import android.os.Parcelable;

public class Food implements Parcelable {
    private String name, ranking, photo, desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
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
        dest.writeString(this.ranking);
        dest.writeString(this.photo);
        dest.writeString(this.desc);
    }

    public Food() {
    }

    protected Food(Parcel in) {
        this.name = in.readString();
        this.ranking = in.readString();
        this.photo = in.readString();
        this.desc = in.readString();
    }

    public static final Parcelable.Creator<Food> CREATOR = new Parcelable.Creator<Food>() {
        @Override
        public Food createFromParcel(Parcel source) {
            return new Food(source);
        }

        @Override
        public Food[] newArray(int size) {
            return new Food[size];
        }
    };
}
