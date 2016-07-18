package com.java.visa.entities;

import java.util.ArrayList;
import java.util.List;

public class Table1 {

	private String chineseName;
	private String englishName;
	private String table1_1;
	private String table1_2;
	private String table1_3;
	private String table1_4;
	private String table1_5;
	private String table1_6;
	private String table1_7;
	private String table1_8;
	private String table1_9;
	private String table1_10;
	
	private String table1_15;
	private String table1_16;
	private String table1_17;
	private String table1_18;
	private String table1_19;
	private List<Table1_List> list;
	public Table1(GeneralMessage gm, List<GoodsInfo> gi) {
		super();
		chineseName = gm.getSellerName_zh_CN();
		englishName = gm.getSellerName_en();
		table1_1 = gm.getBuyerName_en();
		table1_2 = gm.getBuyerAddress();
		table1_3 = gm.getInvoiceNum();
		table1_4 = gm.getInvoiceDate();
		table1_5 = gm.getScNum();
		table1_6 = gm.getLcNum();
		table1_7 = gm.getLoading_port();
		table1_8 = gm.getUnload_port();
		table1_9 = gm.getTransport_way_en();
		table1_10 = gi.get(0).getMarks_Numbers();
		
		table1_17 = gm.getAmount_invoice();
		table1_18 = gm.getSellerName_en();
		table1_19 = gm.getDeal_way() + "    " + gm.getUnload_port();
		List<Table1_List> l = new ArrayList<Table1_List>();
		int x=0, y=0;
		for (int i = 0; i < gi.size(); i ++) {
			Table1_List table1_List = new Table1_List(gi.get(i));
			l.add(table1_List);
			x += Integer.parseInt(gi.get(i).getQuantities());
			y += Integer.parseInt(gi.get(i).getAmount());
		}
		table1_15 = x + "";
		table1_16 = y + "";
		list = l;
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
	public String getTable1_1() {
		return table1_1;
	}
	public void setTable1_1(String table1_1) {
		this.table1_1 = table1_1;
	}
	public String getTable1_2() {
		return table1_2;
	}
	public void setTable1_2(String table1_2) {
		this.table1_2 = table1_2;
	}
	public String getTable1_3() {
		return table1_3;
	}
	public void setTable1_3(String table1_3) {
		this.table1_3 = table1_3;
	}
	public String getTable1_4() {
		return table1_4;
	}
	public void setTable1_4(String table1_4) {
		this.table1_4 = table1_4;
	}
	public String getTable1_5() {
		return table1_5;
	}
	public void setTable1_5(String table1_5) {
		this.table1_5 = table1_5;
	}
	public String getTable1_6() {
		return table1_6;
	}
	public void setTable1_6(String table1_6) {
		this.table1_6 = table1_6;
	}
	public String getTable1_7() {
		return table1_7;
	}
	public void setTable1_7(String table1_7) {
		this.table1_7 = table1_7;
	}
	

	public String getTable1_8() {
		return table1_8;
	}
	public void setTable1_8(String table1_8) {
		this.table1_8 = table1_8;
	}
	public String getTable1_9() {
		return table1_9;
	}
	public void setTable1_9(String table1_9) {
		this.table1_9 = table1_9;
	}
	public String getTable1_15() {
		return table1_15;
	}
	
	public void setTable1_15(String table1_15) {
		this.table1_15 = table1_15;
	}
	public String getTable1_16() {
		return table1_16;
	}
	public void setTable1_16(String table1_16) {
		this.table1_16 = table1_16;
	}
	public String getTable1_17() {
		return table1_17;
	}
	public void setTable1_17(String table1_17) {
		this.table1_17 = table1_17;
	}
	public String getTable1_18() {
		return table1_18;
	}
	public void setTable1_18(String table1_18) {
		this.table1_18 = table1_18;
	}
	public String getTable1_19() {
		return table1_19;
	}
	public void setTable1_19(String table1_19) {
		this.table1_19 = table1_19;
	}
	public List<Table1_List> getList() {
		if (list == null) {
			list = new ArrayList<Table1_List>();
		}
		return list;
	}
	public void setList(List<Table1_List> list) {
		this.list = list;
	}
	public String getTable1_10() {
		return table1_10;
	}
	public void setTable1_10(String table1_10) {
		this.table1_10 = table1_10;
	}
}
