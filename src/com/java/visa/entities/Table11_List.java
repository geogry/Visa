package com.java.visa.entities;

public class Table11_List {

	private String table11_3;
	private String table11_4;
	private String table11_5;
	public Table11_List(GoodsInfo gi) {
		super();
		table11_3 = gi.getQuantities();
		table11_4 = gi.getDescription();
		table11_5 = Integer.parseInt(gi.getAmount()) * Integer.parseInt(gi.getUnit_price()) * 1.1 * 0.02 + "";
	}
	public String getTable11_3() {
		return table11_3;
	}
	public void setTable11_3(String table11_3) {
		this.table11_3 = table11_3;
	}
	public String getTable11_4() {
		return table11_4;
	}
	public void setTable11_4(String table11_4) {
		this.table11_4 = table11_4;
	}
	public String getTable11_5() {
		return table11_5;
	}
	public void setTable11_5(String table11_5) {
		this.table11_5 = table11_5;
	}
}
