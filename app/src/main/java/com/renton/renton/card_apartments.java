package com.renton.renton;

public class card_apartments {
    String RentName;
    String RentAddress;
    int img;

    public card_apartments(String rentName, String rentAddress, int img) {
        RentName = rentName;
        RentAddress = rentAddress;
        this.img = img;
    }

    public String getRentName() {
        return RentName;
    }

    public String getRentAddress() {
        return RentAddress;
    }

    public int getImg() {
        return img;
    }
}
