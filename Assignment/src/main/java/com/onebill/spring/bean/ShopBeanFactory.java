package com.onebill.spring.bean;

public class ShopBeanFactory {

	private int shopId;
	private String shopName;

	public ShopBeanFactory(int shopId, String shopName) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
	}
	public ShopBeanFactory() {
		super();
	}
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	@Override
	public String toString() {
		return "ShopBeanFactory [shopId=" + shopId + ", shopName=" + shopName + "]";
	}

}
