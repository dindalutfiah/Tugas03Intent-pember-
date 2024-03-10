package com.example.tugas03intent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class Detail implements Parcelable {
    private String Name;
    private String Price;
    private String Color;
    private String MadeIn;
    private String Gambar;

    protected Detail(Parcel in) {
        Name = in.readString();
        Price = in.readString();
        Color = in.readString();
        MadeIn = in.readString();
        Gambar = in.readString();
    }

    public static final Creator<Detail>CREATOR = new Creator<Detail>() {
        @Override
        public Detail createFromParcel(Parcel in) {
            return new Detail(in);
        }

        @Override
        public Detail[] newArray(int size) {

            return new Detail[size];
        }
    };

    public Detail() {
    }

    public String getName(){
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice(){
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }
    public String getColor(){
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
    public String getMadeIn(){
        return MadeIn;
    }

    public void setMadeIn(String madeIn) {
        MadeIn = madeIn;
    }
    public String getGambar(){
        return Gambar;
    }

    public void setGambar(String gambar) {
        Gambar = gambar;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(Name);
        dest.writeString(Price);
        dest.writeString(Color);
        dest.writeString(MadeIn);
        dest.writeString(Gambar);
    }

    public int getDescription(){
        return 0;
    }
}