package com.java.visa.entities;

public class Table3_List {

	private String table3_12;
	private String table3_13;
	private String table3_14;
	public Table3_List(GoodsInfo gi) {
		super();
		table3_12 = gi.get_package() + "    " + gi.getDescription();
		table3_13 = gi.getGWORNW();
		table3_14 = gi.getMeans();
	}
	public String getTable3_12() {
		return table3_12;
	}
	public void setTable3_12(String table3_12) {
		this.table3_12 = table3_12;
	}
	public String getTable3_13() {
		return table3_13;
	}
	public void setTable3_13(String table3_13) {
		this.table3_13 = table3_13;
	}
	public String getTable3_14() {
		return table3_14;
	}
	public void setTable3_14(String table3_14) {
		this.table3_14 = table3_14;
	}
}
