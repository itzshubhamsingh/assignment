package com.traini8.assignment.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class Address {

    // full address of the Training Center.
    @NotBlank(message = "DetailedAddress is required")
    private String detailedAddress;

    // city where Training Center is located.
    @NotBlank(message = "City is required")
    private String city;

    // State where Training Center is located.
    @NotBlank(message = "State is required")
    private String state;

    // pincode of the location
    @NotBlank(message = "Pincode is required")
    @Pattern(regexp = "^\\d{6}$", message = "Pincode must be a valid 6-digit number")
    private String pincode;

    // constructors

    public Address(){}

    public Address(String detailedAddress, String city, String state, String pincode) {
        this.detailedAddress = detailedAddress;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    // getters and setters

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    // toString() method..

    @Override
    public String toString() {
        return "Address{" +
                "detailedAddress='" + detailedAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}

