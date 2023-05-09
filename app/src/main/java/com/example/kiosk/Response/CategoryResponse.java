package com.example.kiosk.Response;

import com.example.kiosk.Data.CategoryData;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CategoryResponse {

    @SerializedName("data")
    @Expose
    private List<CategoryData> data;
    @SerializedName("success")
    @Expose
    private Boolean success;

    public List<CategoryData> getData() {
        return data;
    }

    public void setData(List<CategoryData> data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
