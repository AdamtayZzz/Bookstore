package com.whu.pojo;

import java.io.Serializable;

public class Cart implements Serializable {
    private int user_id;
    private int book_id;
    private double price;
    private int quantity;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "user_id=" + user_id +
                ", book_id=" + book_id +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
