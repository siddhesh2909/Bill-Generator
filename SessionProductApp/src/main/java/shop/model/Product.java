package shop.model;

public class Product {
private int proId;
private String proName;
private double proPrice;
private int proQnt;
public Product(int proId, String proName, double proPrice, int proQnt) {
	super();
	this.proId = proId;
	this.proName = proName;
	this.proPrice = proPrice;
	this.proQnt = proQnt;
}
public int getProId() {
	return proId;
}
public void setProId(int proId) {
	this.proId = proId;
}
public String getProName() {
	return proName;
}
public void setProName(String proName) {
	this.proName = proName;
}
public double getProPrice() {
	return proPrice;
}
public void setProPrice(double proPrice) {
	this.proPrice = proPrice;
}
public int getProQnt() {
	return proQnt;
}
public void setProQnt(int proQnt) {
	this.proQnt = proQnt;
}

}
