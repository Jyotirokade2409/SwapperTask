package com.sts.swaggertask.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product
{
	@Id
	private int prodId;
	private String prodName;
	private String prodCategory;
	private float prdoPrice;
	
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdCategory() {
		return prodCategory;
	}
	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}
	public float getPrdoPrice() {
		return prdoPrice;
	}
	public void setPrdoPrice(float prdoPrice) {
		this.prdoPrice = prdoPrice;
	}
	public Product(int prodId, String prodName, String prodCategory, float prdoPrice) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodCategory = prodCategory;
		this.prdoPrice = prdoPrice;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodCategory=" + prodCategory
				+ ", prdoPrice=" + prdoPrice + "]";
	}
	
	
	
}
