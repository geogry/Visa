package com.java.visa.entities;

import java.util.ArrayList;
import java.util.List;

public class Table6 {

	private String chineseName;
	private String englishName;
	private String table6_1;
	private String table6_2;
	private String table6_3;
	private String table6_4;
	private String table6_5;
	private String table6_6;
	private String table6_7;
	private String table6_8;
	private String table6_9;
	private String table6_10;
	private String table6_14;
	private String table6_15;
	private String table6_16;
	private String table6_17;
	private String table6_18;
	private List<Table6_List> list;
	public Table6(GeneralMessage gm, List<GoodsInfo> giList) {
		super();
		chineseName = gm.getSellerName_zh_CN();
		englishName = gm.getSellerName_en();
		table6_1 = gm.getBuyerName_en();
		table6_2 = gm.getBuyerFax();
		table6_3 = gm.getShipping_advice_time();
		table6_4 = gm.getInvoiceDate();
		table6_5 = gm.getLcNum();
		table6_6 = gm.getScNum();
		table6_7 = gm.getLoading_port();
		table6_8 = gm.getUnload_port();
		table6_9 = gm.getTransit_port();
		table6_10 = giList.get(0).getMarks_Numbers();
		table6_14 = gm.getVesselName();
		table6_15 = gm.getBlNum();
		table6_16 = gm.getEtd();
		table6_17 = gm.getEta();
		table6_18 = gm.getSellerName_en();
		List<Table6_List> l = new ArrayList<Table6_List>();
		for (int i = 0; i < giList.size(); i ++) {
			l.add(new Table6_List(giList.get(i)));
		}
		list = l;
	}
	public String getTable6_1() {
		return table6_1;
	}
	public void setTable6_1(String table6_1) {
		this.table6_1 = table6_1;
	}
	public String getTable6_2() {
		return table6_2;
	}
	public void setTable6_2(String table6_2) {
		this.table6_2 = table6_2;
	}
	public String getTable6_3() {
		return table6_3;
	}
	public void setTable6_3(String table6_3) {
		this.table6_3 = table6_3;
	}
	public String getTable6_4() {
		return table6_4;
	}
	public void setTable6_4(String table6_4) {
		this.table6_4 = table6_4;
	}
	public String getTable6_5() {
		return table6_5;
	}
	public void setTable6_5(String table6_5) {
		this.table6_5 = table6_5;
	}
	public String getTable6_6() {
		return table6_6;
	}
	public void setTable6_6(String table6_6) {
		this.table6_6 = table6_6;
	}
	public String getTable6_7() {
		return table6_7;
	}
	public void setTable6_7(String table6_7) {
		this.table6_7 = table6_7;
	}
	public String getTable6_8() {
		return table6_8;
	}
	public void setTable6_8(String table6_8) {
		this.table6_8 = table6_8;
	}
	public String getTable6_9() {
		return table6_9;
	}
	public void setTable6_9(String table6_9) {
		this.table6_9 = table6_9;
	}
	public String getTable6_10() {
		return table6_10;
	}
	public void setTable6_10(String table6_10) {
		this.table6_10 = table6_10;
	}
	public String getTable6_14() {
		return table6_14;
	}
	public void setTable6_14(String table6_14) {
		this.table6_14 = table6_14;
	}
	public String getTable6_15() {
		return table6_15;
	}
	public void setTable6_15(String table6_15) {
		this.table6_15 = table6_15;
	}
	public String getTable6_16() {
		return table6_16;
	}
	public void setTable6_16(String table6_16) {
		this.table6_16 = table6_16;
	}
	public String getTable6_17() {
		return table6_17;
	}
	public void setTable6_17(String table6_17) {
		this.table6_17 = table6_17;
	}
	public String getTable6_18() {
		return table6_18;
	}
	public void setTable6_18(String table6_18) {
		this.table6_18 = table6_18;
	}
	public List<Table6_List> getList() {
		if (list == null) {
			list =  new ArrayList<Table6_List>();
		}
		return list;
	}
	public void setList(List<Table6_List> list) {
		this.list = list;
	}
	public String getChineseName() {
		return chineseName;
	}
	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
	}
	public String getEnglishName() {
		return englishName;
	}
	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}
	
}
