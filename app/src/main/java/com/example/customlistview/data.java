package com.example.customlistview;

public class data {
    private String name;
    private String NS;
    private String anh;

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String getNS() {
        return NS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNS(String NS) {
        this.NS = NS;
    }

    public data(String name, String NS, String anh) {
        this.name = name;
        this.NS = NS;
        this.anh = anh;
    }


}
