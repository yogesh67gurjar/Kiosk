package com.example.kiosk.Room;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface CartDao {

    // made by madhur sir and team
    @Insert
    void addCart(CartModel cartModel);

    @Update
    void updateCart(CartModel cartModel);

    @Delete
    void deleteCard(CartModel cartModel);

    @Query("SELECT * FROM CartModel")
    List<CartModel> getAllCart();

    @Query("DELETE from CartModel")
    void deleteAll();

    @Query("SELECT EXISTS(SELECT 1 FROM CartModel WHERE itemId = :userId)")
    boolean doesUserExist(int userId);

}
