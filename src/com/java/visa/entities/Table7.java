package com.java.visa.entities;

public class Table7 {

	private String table7_1;
	private String table7_2;
	private String table7_3;
	private String table7_4;
	private String table7_5;
	private String table7_6;
	private String table7_7;
	private String table7_8;
	private String table7_9;
	private String table7_10;
	public Table7(GeneralMessage gm) {
		super();
		table7_1 = gm.getBank_import();
		table7_2 = gm.getLcNum();
		table7_3 = gm.getDraft_date();
		table7_4 = gm.getInvoiceNum();
		table7_5 = gm.getAmount_invoice();
		table7_6 = gm.getDeadline_payment();
		table7_7 = gm.getBank_export();
		table7_8 = gm.getAmount_invoice();
		table7_9 = gm.getBank_import();
		table7_10 = gm.getSellerName_en();
	}
	public String getTable7_1() {
		return table7_1;
	}
	public void setTable7_1(String table7_1) {
		this.table7_1 = table7_1;
	}
	public String getTable7_2() {
		return table7_2;
	}
	public void setTable7_2(String table7_2) {
		this.table7_2 = table7_2;
	}
	public String getTable7_3() {
		return table7_3;
	}
	public void setTable7_3(String table7_3) {
		this.table7_3 = table7_3;
	}
	public String getTable7_4() {
		return table7_4;
	}
	public void setTable7_4(String table7_4) {
		this.table7_4 = table7_4;
	}
	public String getTable7_5() {
		return table7_5;
	}
	public void setTable7_5(String table7_5) {
		this.table7_5 = table7_5;
	}
	public String getTable7_6() {
		return table7_6;
	}
	public void setTable7_6(String table7_6) {
		this.table7_6 = table7_6;
	}
	public String getTable7_7() {
		return table7_7;
	}
	public void setTable7_7(String table7_7) {
		this.table7_7 = table7_7;
	}
	public String getTable7_8() {
		return table7_8;
	}
	public void setTable7_8(String table7_8) {
		this.table7_8 = table7_8;
	}
	public String getTable7_9() {
		return table7_9;
	}
	public void setTable7_9(String table7_9) {
		this.table7_9 = table7_9;
	}
	public String getTable7_10() {
		return table7_10;
	}
	public void setTable7_10(String table7_10) {
		this.table7_10 = table7_10;
	}
}
