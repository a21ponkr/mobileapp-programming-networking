package com.example.networking;

public class Mountain {
    private String nameOfMountain;
    private String locationOfMountain;
    private int heightOfMountain;

    public String getName() {
        return nameOfMountain;
    }

    public Mountain(){
        nameOfMountain="Missing a name";
        locationOfMountain="Missing the location";
        heightOfMountain=0;
    }

    public Mountain(String n, String l, int h){
        nameOfMountain = n;
        locationOfMountain=l;
        heightOfMountain=h;
    }

    public String info(){
        String tmp= new String();
        tmp+=nameOfMountain+" Is in the location: " + locationOfMountain + " and is " + heightOfMountain + "meters above the sea.";
        return tmp;
    }

    public String toString(){
        return nameOfMountain;
    }
}
