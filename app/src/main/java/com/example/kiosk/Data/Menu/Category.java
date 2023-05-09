package com.example.kiosk.Data.Menu;

public class Category{
	private String image;
	private String createdAt;
	private boolean isEcommerce;
	private String name;
	private int id;
	private int appearenceOrder;
	private boolean isActive;
	private String updatedAt;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setIsEcommerce(boolean isEcommerce){
		this.isEcommerce = isEcommerce;
	}

	public boolean isIsEcommerce(){
		return isEcommerce;
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

	public void setAppearenceOrder(int appearenceOrder){
		this.appearenceOrder = appearenceOrder;
	}

	public int getAppearenceOrder(){
		return appearenceOrder;
	}

	public void setIsActive(boolean isActive){
		this.isActive = isActive;
	}

	public boolean isIsActive(){
		return isActive;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}
}
