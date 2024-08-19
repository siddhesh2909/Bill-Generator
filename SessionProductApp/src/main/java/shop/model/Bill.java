package shop.model;

import java.sql.Date;

public class Bill {
private int billNumber;
private java.util.Date billDate;
private double total;
private double cgst;
private double sgst;
private double FinalTotal;

public Bill(){}

public Bill(int billNumber, java.util.Date billDate, double total, double cgst, double sgst, double finalTotal) {
	super();
	this.billNumber = billNumber;
	this.billDate = billDate;
	this.total = total;
	this.cgst = cgst;
	this.sgst = sgst;
	FinalTotal = finalTotal;
}

public int getBillNumber() {
	return billNumber;
}

public void setBillNumber(int billNumber) {
	this.billNumber = billNumber;
}

public java.util.Date getBillDate() {
	return billDate;
}

public void setBillDate(java.util.Date billDate) {
	this.billDate = billDate;
}

public double getTotal() {
	return total;
}

public void setTotal(double total) {
	this.total = total;
}

public double getCgst() {
	return cgst;
}

public void setCgst(double cgst) {
	this.cgst = cgst;
}

public double getSgst() {
	return sgst;
}

public void setSgst(double sgst) {
	this.sgst = sgst;
}

public double getFinalTotal() {
	return FinalTotal;
}

public void setFinalTotal(double finalTotal) {
	FinalTotal = finalTotal;
}
}

