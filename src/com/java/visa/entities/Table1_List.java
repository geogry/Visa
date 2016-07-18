package com.java.visa.entities;

public class Table1_List {

	private String table1_11;
	private String table1_12;
	private String table1_13;
	private String table1_14;
	
	public Table1_List(GoodsInfo gi) {
		super();
		table1_11 = gi.getDescription();
		table1_12 = gi.getQuantities();
		table1_13 = gi.getUnit_price();
		table1_14 = gi.getAmount();
	}
	
	public String getTable1_11() {
		return table1_11;
	}
	public void setTable1_11(String table1_11) {
		this.table1_11 = table1_11;
	}
	public String getTable1_12() {
		return table1_12;
	}
	public void setTable1_12(String table1_12) {
		this.table1_12 = table1_12;
	}
	public String getTable1_13() {
		return table1_13;
	}
	public void setTable1_13(String table1_13) {
		this.table1_13 = table1_13;
	}

	public String getTable1_14() {
		return table1_14;
	}

	public void setTable1_14(String table1_14) {
		this.table1_14 = table1_14;
	}
	
}
