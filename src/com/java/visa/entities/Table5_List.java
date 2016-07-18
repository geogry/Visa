package com.java.visa.entities;

public class Table5_List {

	private String table5_5;
	private String table5_7;
	private String table5_8;
	private String table5_9;
	private String table5_10;
	public Table5_List(GeneralMessage gm, GoodsInfo gi) {
		super();
		table5_5 = gi.getItemNum();
		table5_7 = gi.get_package() + "    " + gi.getDescription();
		table5_8 = gm.getOrigin_criterion();
		table5_9 = gm.getGross_weight();
		table5_10 = gm.getInvoiceNum() + "    " + gm.getInvoiceDate();
	}
	public String getTable5_5() {
		return table5_5;
	}
	public void setTable5_5(String table5_5) {
		this.table5_5 = table5_5;
	}
	public String getTable5_7() {
		return table5_7;
	}
	public void setTable5_7(String table5_7) {
		this.table5_7 = table5_7;
	}
	public String getTable5_8() {
		return table5_8;
	}
	public void setTable5_8(String table5_8) {
		this.table5_8 = table5_8;
	}
	public String getTable5_9() {
		return table5_9;
	}
	public void setTable5_9(String table5_9) {
		this.table5_9 = table5_9;
	}
	public String getTable5_10() {
		return table5_10;
	}
	public void setTable5_10(String table5_10) {
		this.table5_10 = table5_10;
	}
}
