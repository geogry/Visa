package com.java.visa.entities;

public class Table4_List {

	private String table4_7;
	private String table4_8;
	private String table4_9;
	public Table4_List(GoodsInfo gi) {
		super();
		table4_7 = gi.get_package() + "    " + gi.getDescription();
		table4_8 = gi.gethSCode();
		table4_9 = gi.getQuantities();
	}
	public String getTable4_7() {
		return table4_7;
	}
	public void setTable4_7(String table4_7) {
		this.table4_7 = table4_7;
	}
	public String getTable4_8() {
		return table4_8;
	}
	public void setTable4_8(String table4_8) {
		this.table4_8 = table4_8;
	}
	public String getTable4_9() {
		return table4_9;
	}
	public void setTable4_9(String table4_9) {
		this.table4_9 = table4_9;
	}
}
