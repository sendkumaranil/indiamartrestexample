package com.indiamart.rest.example.model;

public class Product {

	private String expdate;
    private String mfgdate;
    private String price;
    private String productname;
	public String getExpdate() {
		return expdate;
	}
	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}
	public String getMfgdate() {
		return mfgdate;
	}
	public void setMfgdate(String mfgdate) {
		this.mfgdate = mfgdate;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	@Override
	public String toString() {
		return "Product [expdate=" + expdate + ", mfgdate=" + mfgdate + ", price=" + price + ", productname="
				+ productname + "]";
	}
	
	
}
