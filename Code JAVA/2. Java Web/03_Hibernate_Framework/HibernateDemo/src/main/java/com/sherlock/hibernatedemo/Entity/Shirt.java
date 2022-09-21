package com.sherlock.hibernatedemo.Entity;

import javax.persistence.*;

@Entity
@Table
public class Shirt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shirtId;
    private String color;
    private String size;
    private String fabric;

    public Shirt(String color, String size, String fabric) {
        this.color = color;
        this.size = size;
        this.fabric = fabric;
    }

    public Shirt() {
    }

    public int getShirtId() {
        return shirtId;
    }

    public void setShirtId(int shirtId) {
        this.shirtId = shirtId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
}
