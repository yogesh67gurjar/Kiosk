package com.example.kiosk.Room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Ignore;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface CartDao {

    @Insert
    void addCart(CartModel cartModel);

    @Update
    void updateCart(CartModel cartModel);

    @Delete
    void deleteCard(CartModel cartModel);

    @Query("SELECT * FROM CartModel")
    List<CartModel> getAllCart();


}
