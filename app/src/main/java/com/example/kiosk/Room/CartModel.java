package com.example.kiosk.Room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "CartModel")
public class CartModel {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "cartName")
    private String cartName;

    @ColumnInfo(name = "cardDisc")
    private String cartDisc;

    @ColumnInfo(name = "cartPrice")
    private float cartPrice;

    @ColumnInfo(name = "imagePath")
    private String imagePath;


    public CartModel(int id, String cartName, String cartDisc, float cartPrice, String imagePath) {
        this.id = id;
        this.cartName = cartName;
        this.cartDisc = cartDisc;
        this.cartPrice = cartPrice;
        this.imagePath = imagePath;
    }
    @Ignore
    public CartModel(String cartName, String cartDisc, float cartPrice, String imagePath) {
        this.cartName = cartName;
        this.cartDisc = cartDisc;
        this.cartPrice = cartPrice;
        this.imagePath = imagePath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCartName() {
        return cartName;
    }

    public void setCartName(String cartName) {
        this.cartName = cartName;
    }

    public String getCartDisc() {
        return cartDisc;
    }

    public void setCartDisc(String cartDisc) {
        this.cartDisc = cartDisc;
    }

    public float getCartPrice() {
        return cartPrice;
    }

    public void setCartPrice(float cartPrice) {
        this.cartPrice = cartPrice;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
