package com.example.ellis.topia;

public class Order {
    private String clientPhone;
    private String shopArea;
    private String homeAddress;
    private String dateIn;
    private String dateOut;
    private String status;

    public Order(String clientPhone, String homeAddress, String dateIn, String dateOut, String status) {
        this.clientPhone = clientPhone;
        this.homeAddress = homeAddress;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.status = status;
    }

    public Order(String clientPhone, String shopArea, String homeAddress, String dateIn, String dateOut, String status) {
        this.clientPhone = clientPhone;
        this.shopArea = shopArea;
        this.homeAddress = homeAddress;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.status = status;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getShopArea() {
        return shopArea;
    }

    public void setShopArea(String shopArea) {
        this.shopArea = shopArea;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getDateIn() {
        return dateIn;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    public String getDateOut() {
        return dateOut;
    }

    public void setDateOut(String dateOut) {
        this.dateOut = dateOut;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
