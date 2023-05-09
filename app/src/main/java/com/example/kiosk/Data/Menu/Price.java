package com.example.kiosk.Data.Menu;

public class Price{
	private Object pickup;
	private Object dineIn;
	private Object packaging;
	private int eCommerce;
	private Object delivery;

	public void setPickup(Object pickup){
		this.pickup = pickup;
	}

	public Object getPickup(){
		return pickup;
	}

	public void setDineIn(Object dineIn){
		this.dineIn = dineIn;
	}

	public Object getDineIn(){
		return dineIn;
	}

	public void setPackaging(Object packaging){
		this.packaging = packaging;
	}

	public Object getPackaging(){
		return packaging;
	}

	public void setECommerce(int eCommerce){
		this.eCommerce = eCommerce;
	}

	public int getECommerce(){
		return eCommerce;
	}

	public void setDelivery(Object delivery){
		this.delivery = delivery;
	}

	public Object getDelivery(){
		return delivery;
	}
}
