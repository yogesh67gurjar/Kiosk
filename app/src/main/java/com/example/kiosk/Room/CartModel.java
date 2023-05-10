package com.example.kiosk.Room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "CartModel")
public class CartModel {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "itemId")
    private int itemId;

    @ColumnInfo(name = "cartName")
    private String cartName;

    @ColumnInfo(name = "cardDisc")
    private String cartDisc;

    @ColumnInfo(name = "cartPrice")
    private float cartPrice;

    @ColumnInfo(name = "imagePath")
    private String imagePath;

    public CartModel(int id, int itemId, String cartName, String cartDisc, float cartPrice, String imagePath) {
        this.id = id;
        this.itemId = itemId;
        this.cartName = cartName;
        this.cartDisc = cartDisc;
        this.cartPrice = cartPrice;
        this.imagePath = imagePath;
    }
    @Ignore
    public CartModel(int itemId, String cartName, String cartDisc, float cartPrice, String imagePath) {
        this.itemId = itemId;
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

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
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
