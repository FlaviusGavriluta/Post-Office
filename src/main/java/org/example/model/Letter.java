package org.example.model;

import java.util.Date;

public class Letter extends PostableItem {
    private final double PRICE;

    public Letter(String address) {
        super(address);
        this.PRICE = 1.99;
    }

    public double getPRICE() {
        return PRICE;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "Address=" + getAddress() +
                ", PRICE=" + PRICE +
                ", Date=" + getPostedDate() +
                '}';
    }
}
