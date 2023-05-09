package com.example.kiosk.Data.Menu;

public class ShopMenuVariationsItem{
	private int shopId;
	private String createdAt;
	private boolean isDefault;
	private Object deletedAt;
	private int itemId;
	private int variationId;
	private int price;
	private int id;
	private Variation variation;
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

	public void setIsDefault(boolean isDefault){
		this.isDefault = isDefault;
	}

	public boolean isIsDefault(){
		return isDefault;
	}

	public void setDeletedAt(Object deletedAt){
		this.deletedAt = deletedAt;
	}

	public Object getDeletedAt(){
		return deletedAt;
	}

	public void setItemId(int itemId){
		this.itemId = itemId;
	}

	public int getItemId(){
		return itemId;
	}

	public void setVariationId(int variationId){
		this.variationId = variationId;
	}

	public int getVariationId(){
		return variationId;
	}

	public void setPrice(int price){
		this.price = price;
	}

	public int getPrice(){
		return price;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setVariation(Variation variation){
		this.variation = variation;
	}

	public Variation getVariation(){
		return variation;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}
}
