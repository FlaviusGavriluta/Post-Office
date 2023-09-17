package org.example.model;

import org.example.enums.BoxType;

public class Box extends PostableItem {
    private double weight;
    private double price;
    private BoxType boxType;

    public Box(String address, double weight, BoxType boxType) {
        super(address);
        this.weight = weight;
        this.boxType = boxType;
        switch (boxType) {
            case SMALL -> {
                this.price = 7.99;
            }
            case BIG -> {
                this.price = 10.29 + 0.29 * weight;
            }
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BoxType getBoxType() {
        return boxType;
    }

    public void setBoxType(BoxType boxType) {
        this.boxType = boxType;
    }

    @Override
    public String toString() {
        return "Box{" +
                "weight=" + weight +
                ", price=" + price +
                ", boxType=" + boxType +
                '}';
    }
}
