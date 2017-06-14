package com.ench.jaya.listview;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by enchanter25 on 13/6/17.
 */

public class alldays_main implements Parcelable{


    String sno;
    String username;
    String  password;


    protected alldays_main(Parcel in) {
        sno = in.readString();
        username = in.readString();
        password = in.readString();
    }

    public static final Creator<alldays_main> CREATOR = new Creator<alldays_main>() {
        @Override
        public alldays_main createFromParcel(Parcel in) {
            return new alldays_main(in);
        }

        @Override
        public alldays_main[] newArray(int size) {
            return new alldays_main[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(sno);
        dest.writeString(username);
        dest.writeString(password);
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static Creator<alldays_main> getCREATOR() {
        return CREATOR;
    }
}
