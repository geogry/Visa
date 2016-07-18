package com.java.visa.entities;

public class Table9_List {

	private String table9_31;
	private String table9_32;
	private String table9_33;
	private String table9_34;
	private String table9_36;
	private String table9_37;
	public Table9_List(GoodsInfo gi) {
		super();
		table9_31 = gi.getItemNum();
		table9_32 = gi.getMarks_Numbers();
		table9_33 = gi.getDescription();
		table9_34 = gi.getQuantities();
		table9_36 = gi.getUnit_price();
		table9_37 = Integer.parseInt(gi.getAmount())*Integer.parseInt(gi.getUnit_price()) + "";
	}
	public String getTable9_31() {
		return table9_31;
	}
	public void setTable9_31(String table9_31) {
		this.table9_31 = table9_31;
	}
	public String getTable9_32() {
		return table9_32;
	}
	public void setTable9_32(String table9_32) {
		this.table9_32 = table9_32;
	}
	public String getTable9_33() {
		return table9_33;
	}
	public void setTable9_33(String table9_33) {
		this.table9_33 = table9_33;
	}
	public String getTable9_34() {
		return table9_34;
	}
	public void setTable9_34(String table9_34) {
		this.table9_34 = table9_34;
	}
	public String getTable9_36() {
		return table9_36;
	}
	public void setTable9_36(String table9_36) {
		this.table9_36 = table9_36;
	}
	public String getTable9_37() {
		return table9_37;
	}
	public void setTable9_37(String table9_37) {
		this.table9_37 = table9_37;
	}
}
