package com.java.visa.entities;

public class Table2_List {
	
	private String table2_9;
	private String table2_10;
	private String table2_11;
	private String table2_12;
	private String table2_13;
	public Table2_List(GoodsInfo gi) {
		super();
		table2_9 = gi.getDescription();
		table2_10 = gi.getQuantities();
		table2_11 = gi.get_package();
		table2_12 = gi.getGWORNW();
		table2_13 = gi.getMeans();
	}
	public String getTable2_9() {
		return table2_9;
	}
	public void setTable2_9(String table2_9) {
		this.table2_9 = table2_9;
	}
	public String getTable2_10() {
		return table2_10;
	}
	public void setTable2_10(String table2_10) {
		this.table2_10 = table2_10;
	}
	public String getTable2_11() {
		return table2_11;
	}
	public void setTable2_11(String table2_11) {
		this.table2_11 = table2_11;
	}
	public String getTable2_12() {
		return table2_12;
	}
	public void setTable2_12(String table2_12) {
		this.table2_12 = table2_12;
	}
	public String getTable2_13() {
		return table2_13;
	}
	public void setTable2_13(String table2_13) {
		this.table2_13 = table2_13;
	}
	
}
