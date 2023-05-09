package com.example.kiosk.Data.Menu;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BasePrice{

	@SerializedName("Pickup")
	@Expose
	private Double pickup;
	@SerializedName("Dine-In")
	@Expose
	private Double dineIn;
	@SerializedName("Delivery")
	@Expose
	private Double delivery;
	@SerializedName("E-commerce")
	@Expose
	private Integer eCommerce;
	@SerializedName("Packaging")
	@Expose
	private Double packaging;

	public Double getPickup() {
		return pickup;
	}

	public void setPickup(Double pickup) {
		this.pickup = pickup;
	}

	public Double getDineIn() {
		return dineIn;
	}

	public void setDineIn(Double dineIn) {
		this.dineIn = dineIn;
	}

	public Double getDelivery() {
		return delivery;
	}

	public void setDelivery(Double delivery) {
		this.delivery = delivery;
	}

	public Integer getECommerce() {
		return eCommerce;
	}

	public void setECommerce(Integer eCommerce) {
		this.eCommerce = eCommerce;
	}

	public Double getPackaging() {
		return packaging;
	}

	public void setPackaging(Double packaging) {
		this.packaging = packaging;
	}
}
