package com.example.stockmanagement.model;

import javax.persistence.Entity;

@Entity
public class Product extends Item {
    private int quantity;
    private double price;

    // Getters e Setters
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
