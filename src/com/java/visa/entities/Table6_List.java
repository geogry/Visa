package com.java.visa.entities;

public class Table6_List {

	private String table6_11;
	private String table6_12;
	private String table6_13;
	public Table6_List(GoodsInfo gi) {
		super();
		table6_11 = gi.getDescription();
		table6_12 = gi.getQuantities();
		table6_13 = gi.getAmount();
	}
	public String getTable6_11() {
		return table6_11;
	}
	public void setTable6_11(String table6_11) {
		this.table6_11 = table6_11;
	}
	public String getTable6_12() {
		return table6_12;
	}
	public void setTable6_12(String table6_12) {
		this.table6_12 = table6_12;
	}
	public String getTable6_13() {
		return table6_13;
	}
	public void setTable6_13(String table6_13) {
		this.table6_13 = table6_13;
	}
}
