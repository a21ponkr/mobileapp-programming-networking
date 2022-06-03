package com.example.networking;

public class Mountain {

    private String name;
    private String location;
    private int height;

    public String getName() {
        return name;
    }

    public Mountain(){
        name="Missing name";
        location="missing location";
        height=0;
    }

    public Mountain(String n, String l, int h){
        name = n;
        location=l;
        height=h;
    }

    public String info(){
        String tmp= new String();
        tmp+=name+" is located in " + location + " is " + height + "meters above sea level.";
        return tmp;
    }

    public String toString(){
        return name;
    }
}