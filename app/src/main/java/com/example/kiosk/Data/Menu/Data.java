package com.example.kiosk.Data.Menu;

import java.util.List;

public class Data{
	private List<ShopMenuItem> shopMenu;

	public void setShopMenu(List<ShopMenuItem> shopMenu){
		this.shopMenu = shopMenu;
	}

	public List<ShopMenuItem> getShopMenu(){
		return shopMenu;
	}
}