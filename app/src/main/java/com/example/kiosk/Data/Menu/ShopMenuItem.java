package com.example.kiosk.Data.Menu;

import java.util.List;

public class ShopMenuItem{
	private String image;
	private MasterMenu masterMenu;
	private List<ShopMenuVariationsItem> shopMenuVariations;
	private Category category;
	private int itemId;
	private boolean isActive;
	private List<Object> shopMenuAddons;
	private String type;
	private int shopId;
	private String createdAt;
	private Object deletedAt;
	private int categoryId;
	private Price price;
	private String name;
	private int id;
	private int seq;
	private BasePrice basePrice;
	private String updatedAt;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setMasterMenu(MasterMenu masterMenu){
		this.masterMenu = masterMenu;
	}

	public MasterMenu getMasterMenu(){
		return masterMenu;
	}

	public void setShopMenuVariations(List<ShopMenuVariationsItem> shopMenuVariations){
		this.shopMenuVariations = shopMenuVariations;
	}

	public List<ShopMenuVariationsItem> getShopMenuVariations(){
		return shopMenuVariations;
	}

	public void setCategory(Category category){
		this.category = category;
	}

	public Category getCategory(){
		return category;
	}

	public void setItemId(int itemId){
		this.itemId = itemId;
	}

	public int getItemId(){
		return itemId;
	}

	public void setIsActive(boolean isActive){
		this.isActive = isActive;
	}

	public boolean isIsActive(){
		return isActive;
	}

	public void setShopMenuAddons(List<Object> shopMenuAddons){
		this.shopMenuAddons = shopMenuAddons;
	}

	public List<Object> getShopMenuAddons(){
		return shopMenuAddons;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

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

	public void setCategoryId(int categoryId){
		this.categoryId = categoryId;
	}

	public int getCategoryId(){
		return categoryId;
	}

	public void setPrice(Price price){
		this.price = price;
	}

	public Price getPrice(){
		return price;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setSeq(int seq){
		this.seq = seq;
	}

	public int getSeq(){
		return seq;
	}

	public void setBasePrice(BasePrice basePrice){
		this.basePrice = basePrice;
	}

	public BasePrice getBasePrice(){
		return basePrice;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}
}