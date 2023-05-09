package com.example.kiosk.Data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class User {
    @SerializedName("walletBalance")
    @Expose
    private Integer walletBalance;
    @SerializedName("storeCredits")
    @Expose
    private Integer storeCredits;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("roadTax")
    @Expose
    private Object roadTax;
    @SerializedName("vehcNum")
    @Expose
    private Object vehcNum;
    @SerializedName("sessionActive")
    @Expose
    private Object sessionActive;
    @SerializedName("orderEnabled")
    @Expose
    private Object orderEnabled;
    @SerializedName("wishlist")
    @Expose
    private String wishlist;
    @SerializedName("fcm")
    @Expose
    private List<Object> fcm;
    @SerializedName("currSid")
    @Expose
    private String currSid;
    @SerializedName("licenseImage")
    @Expose
    private Object licenseImage;
    @SerializedName("icNumber")
    @Expose
    private Object icNumber;
    @SerializedName("riderId")
    @Expose
    private Object riderId;
    @SerializedName("shopId")
    @Expose
    private Integer shopId;
    @SerializedName("userName")
    @Expose
    private String userName;
    @SerializedName("gender")
    @Expose
    private Object gender;
    @SerializedName("race")
    @Expose
    private Object race;
    @SerializedName("birthday")
    @Expose
    private Object birthday;
    @SerializedName("email")
    @Expose
    private Object email;
    @SerializedName("mobile")
    @Expose
    private Object mobile;
    @SerializedName("profile")
    @Expose
    private Object profile;
    @SerializedName("postalcode")
    @Expose
    private Object postalcode;
    @SerializedName("orderListedAt")
    @Expose
    private String orderListedAt;
    @SerializedName("userType")
    @Expose
    private String userType;
    @SerializedName("isActive")
    @Expose
    private Boolean isActive;
    @SerializedName("isVerified")
    @Expose
    private Boolean isVerified;
    @SerializedName("deletedAt")
    @Expose
    private Object deletedAt;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;

    public Integer getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(Integer walletBalance) {
        this.walletBalance = walletBalance;
    }

    public Integer getStoreCredits() {
        return storeCredits;
    }

    public void setStoreCredits(Integer storeCredits) {
        this.storeCredits = storeCredits;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getRoadTax() {
        return roadTax;
    }

    public void setRoadTax(Object roadTax) {
        this.roadTax = roadTax;
    }

    public Object getVehcNum() {
        return vehcNum;
    }

    public void setVehcNum(Object vehcNum) {
        this.vehcNum = vehcNum;
    }

    public Object getSessionActive() {
        return sessionActive;
    }

    public void setSessionActive(Object sessionActive) {
        this.sessionActive = sessionActive;
    }

    public Object getOrderEnabled() {
        return orderEnabled;
    }

    public void setOrderEnabled(Object orderEnabled) {
        this.orderEnabled = orderEnabled;
    }

    public String getWishlist() {
        return wishlist;
    }

    public void setWishlist(String wishlist) {
        this.wishlist = wishlist;
    }

    public List<Object> getFcm() {
        return fcm;
    }

    public void setFcm(List<Object> fcm) {
        this.fcm = fcm;
    }

    public String getCurrSid() {
        return currSid;
    }

    public void setCurrSid(String currSid) {
        this.currSid = currSid;
    }

    public Object getLicenseImage() {
        return licenseImage;
    }

    public void setLicenseImage(Object licenseImage) {
        this.licenseImage = licenseImage;
    }

    public Object getIcNumber() {
        return icNumber;
    }

    public void setIcNumber(Object icNumber) {
        this.icNumber = icNumber;
    }

    public Object getRiderId() {
        return riderId;
    }

    public void setRiderId(Object riderId) {
        this.riderId = riderId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Object getGender() {
        return gender;
    }

    public void setGender(Object gender) {
        this.gender = gender;
    }

    public Object getRace() {
        return race;
    }

    public void setRace(Object race) {
        this.race = race;
    }

    public Object getBirthday() {
        return birthday;
    }

    public void setBirthday(Object birthday) {
        this.birthday = birthday;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public Object getMobile() {
        return mobile;
    }

    public void setMobile(Object mobile) {
        this.mobile = mobile;
    }

    public Object getProfile() {
        return profile;
    }

    public void setProfile(Object profile) {
        this.profile = profile;
    }

    public Object getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(Object postalcode) {
        this.postalcode = postalcode;
    }

    public String getOrderListedAt() {
        return orderListedAt;
    }

    public void setOrderListedAt(String orderListedAt) {
        this.orderListedAt = orderListedAt;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public Object getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Object deletedAt) {
        this.deletedAt = deletedAt;
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
