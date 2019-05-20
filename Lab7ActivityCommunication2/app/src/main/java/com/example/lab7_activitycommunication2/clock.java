package com.example.lab7_activitycommunication2;

import java.io.Serializable;

public class clock implements Serializable {
    public void setHtime(String htime) {
        this.htime = htime;
    }

    public void setMtime(String mtime) {
        this.mtime = mtime;
    }

    public void setStime(String stime) {
        this.stime = stime;
    }

    public clock(String htime, String mtime, String stime) {
        this.htime = htime;
        this.mtime = mtime;
        this.stime = stime;
    }

    private String htime;

    public String getHtime() {
        return htime;
    }

    public String getMtime() {
        return mtime;
    }

    public String getStime() {
        return stime;
    }

    private String mtime;
    private String stime;

}
