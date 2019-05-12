package com.developerfitri.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class Sahabat implements Parcelable {
    private String name;
    private String status;
    private String detail;
    private String photo;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    //agar data bisa terjaga ditambahkan dibawah ini dan implements Parcelable
    @Override
    public void writeToParcel(Parcel dest, int i) {
        dest.writeString(this.name);
        dest.writeString(this.status);
        dest.writeString(this.photo);
        dest.writeString(this.detail);
    }

    public Sahabat() {
    }

    protected Sahabat(Parcel in) {
        this.name = in.readString();
        this.status = in.readString();
        this.photo = in.readString();
        this.detail = in.readString();
    }
    public static final Creator<Sahabat> CREATOR = new Creator<Sahabat>() {
        @Override
        public Sahabat createFromParcel(Parcel source) {
            return new Sahabat(source);
        }
        @Override
        public Sahabat[] newArray(int size) {
            return new Sahabat[size];
        }
    };

}


