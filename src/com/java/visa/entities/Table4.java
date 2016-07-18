package com.java.visa.entities;

import java.util.ArrayList;
import java.util.List;

public class Table4 {

	private String table4_1;
	private String table4_2;
	private String table4_3;
	private String table4_4;
	private String table4_5;
	private String table4_6;
	private String table4_10;
	private String table4_11;
	private List<Table4_List> list;
	public Table4(GeneralMessage gm, List<GoodsInfo> giList) {
		super();
		table4_1 = gm.getOrigin_certificate_Num();
		table4_2 = gm.getSellerName_en();
		table4_3 = gm.getBuyerName_en();
		table4_4 = gm.getRoute_mean();
		table4_5 = gm.getTo_country_en();
		table4_6 = giList.get(0).getMarks_Numbers();
		table4_10 = gm.getInvoiceNum() + "    " + gm.getInvoiceDate();
		table4_11 = gm.getSellerName_en();
		List<Table4_List> l = new ArrayList<Table4_List>();
		for (int i = 0; i < giList.size(); i ++) {
			l.add(new Table4_List(giList.get(i)));
		}
		list = l;
	}
	public String getTable4_1() {
		if (list == null) {
			list = new ArrayList<Table4_List>();
		}
		return table4_1;
	}
	public void setTable4_1(String table4_1) {
		this.table4_1 = table4_1;
	}
	public String getTable4_2() {
		return table4_2;
	}
	public void setTable4_2(String table4_2) {
		this.table4_2 = table4_2;
	}
	public String getTable4_3() {
		return table4_3;
	}
	public void setTable4_3(String table4_3) {
		this.table4_3 = table4_3;
	}
	public String getTable4_4() {
		return table4_4;
	}
	public void setTable4_4(String table4_4) {
		this.table4_4 = table4_4;
	}
	public String getTable4_5() {
		return table4_5;
	}
	public void setTable4_5(String table4_5) {
		this.table4_5 = table4_5;
	}
	public String getTable4_6() {
		return table4_6;
	}
	public void setTable4_6(String table4_6) {
		this.table4_6 = table4_6;
	}
	public String getTable4_10() {
		return table4_10;
	}
	public void setTable4_10(String table4_10) {
		this.table4_10 = table4_10;
	}
	public String getTable4_11() {
		return table4_11;
	}
	public void setTable4_11(String table4_11) {
		this.table4_11 = table4_11;
	}
	public List<Table4_List> getList() {
		return list;
	}
	public void setList(List<Table4_List> list) {
		this.list = list;
	}
}
