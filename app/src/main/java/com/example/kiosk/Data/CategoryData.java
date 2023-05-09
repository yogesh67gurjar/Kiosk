package com.example.kiosk.Data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CategoryData {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("appearenceOrder")
    @Expose
    private Integer appearenceOrder;
    @SerializedName("isActive")
    @Expose
    private Boolean isActive;
    @SerializedName("isEcommerce")
    @Expose
    private Boolean isEcommerce;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAppearenceOrder() {
        return appearenceOrder;
    }

    public void setAppearenceOrder(Integer appearenceOrder) {
        this.appearenceOrder = appearenceOrder;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Boolean getIsEcommerce() {
        return isEcommerce;
    }

    public void setIsEcommerce(Boolean isEcommerce) {
        this.isEcommerce = isEcommerce;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
