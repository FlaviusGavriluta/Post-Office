package org.example.model;

import java.time.LocalDate;

public class PostableItem {
    private String address;
    private final LocalDate postedDate;

    public PostableItem(String address) {
        this.address = address;
        this.postedDate = LocalDate.now();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getPostedDate() {
        return postedDate;
    }
}