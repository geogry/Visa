package com.java.visa.entities;

import java.util.ArrayList;
import java.util.List;

public class Table5 {

	private String table5_1;
	private String table5_2;
	private String table5_3;
	private String table5_4;
	private String table5_6;
	private String table5_11;
	private String table5_12;
	private List<Table5_List> list;
	public Table5(GeneralMessage gm, List<GoodsInfo> giList) {
		super();
		table5_1 = gm.getOrigin_certificate_Num_refer();
		table5_2 = gm.getSellerName_en() + "    " + gm.getSellerAddress();
		table5_3 = gm.getBuyerName_en() + "    " + gm.getBuyerAddress();
		table5_4 = gm.getRoute_mean();
		table5_6 = giList.get(0).getMarks_Numbers();
		table5_11 = gm.getProduce_country();
		table5_12 = gm.getTo_country_en();
		List<Table5_List> l =  new ArrayList<Table5_List>();
		for (int i = 0; i < giList.size(); i ++) {
			l.add(new Table5_List(gm, giList.get(i)));
		}
		list = l;
	}
	public String getTable5_1() {
		return table5_1;
	}
	public void setTable5_1(String table5_1) {
		this.table5_1 = table5_1;
	}
	public String getTable5_2() {
		return table5_2;
	}
	public void setTable5_2(String table5_2) {
		this.table5_2 = table5_2;
	}
	public String getTable5_3() {
		return table5_3;
	}
	public void setTable5_3(String table5_3) {
		this.table5_3 = table5_3;
	}
	public String getTable5_4() {
		return table5_4;
	}
	public void setTable5_4(String table5_4) {
		this.table5_4 = table5_4;
	}
	public String getTable5_11() {
		return table5_11;
	}
	public void setTable5_11(String table5_11) {
		this.table5_11 = table5_11;
	}
	public String getTable5_12() {
		return table5_12;
	}
	public void setTable5_12(String table5_12) {
		this.table5_12 = table5_12;
	}
	public List<Table5_List> getList() {
		if (list == null) {
			list = new ArrayList<Table5_List>();
		}
		return list;
	}
	public void setList(List<Table5_List> list) {
		this.list = list;
	}
	public String getTable5_6() {
		return table5_6;
	}
	public void setTable5_6(String table5_6) {
		this.table5_6 = table5_6;
	}
	
}
