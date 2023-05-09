package com.example.kiosk.Service;

import com.example.kiosk.Data.Menu.MenuResponse;
import com.example.kiosk.Response.CategoryResponse;
import com.example.kiosk.Response.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Api_interface {

    //........... Shop Login .........//

    @FormUrlEncoded
    @POST("login/shop")
    Call<LoginResponse> login(
            @Field("shopId") int shopId,
            @Field("password") String password);

    //........... Category list by shop ID .........//

    @GET("food/category/list")
    Call<CategoryResponse> categoryList(
            @Query("shopID") int shopID,
            @Query("page") int page,
            @Query("limit") int limit,
            @Query("filter") int filter,
            @Query("hasMenu") boolean hasMenu);

    //........... default menu list by shop id .........//

    @GET("shop/menu/{shop_id}/{categoryId}/{page}/{limit}/list")
    Call<MenuResponse> menuList(
            @Path("shop_id") int shopID,
            @Path("categoryId") int categoryId,
            @Path("page") int page,
            @Path("limit") int limit);
}
