package com.example.kiosk.Data.Menu;

public class ShopMenuAddonsItem{
	private int shopId;
	private String createdAt;
	private Object deletedAt;
	private Addon addon;
	private int itemId;
	private Price price;
	private int id;
	private int addonId;
	private String updatedAt;

	public void setShopId(int shopId){
		this.shopId = shopId;
	}

	public int getShopId(){
		return shopId;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setDeletedAt(Object deletedAt){
		this.deletedAt = deletedAt;
	}

	public Object getDeletedAt(){
		return deletedAt;
	}

	public void setAddon(Addon addon){
		this.addon = addon;
	}

	public Addon getAddon(){
		return addon;
	}

	public void setItemId(int itemId){
		this.itemId = itemId;
	}

	public int getItemId(){
		return itemId;
	}

	public void setPrice(Price price){
		this.price = price;
	}

	public Price getPrice(){
		return price;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setAddonId(int addonId){
		this.addonId = addonId;
	}

	public int getAddonId(){
		return addonId;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}
}
