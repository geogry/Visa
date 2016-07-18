package com.java.visa.entities;

import java.util.ArrayList;
import java.util.List;


public class Table2 {

	private String chineseName;
	private String englishName;
	private String table2_1;
	private String table2_2;
	private String table2_3;
	private String table2_4;
	private String table2_5;
	private String table2_6;
	private String table2_7;
	private String table2_8;
	private String table2_14;
	private String table2_15;
	private String table2_16;
	private String table2_17;
	private String table2_18;
	private String table2_19;
	
	private List<Table2_List> list;

	public Table2(GeneralMessage gm, List<GoodsInfo> giList) {
		super();
		chineseName = gm.getSellerName_zh_CN();
		englishName = gm.getSellerName_en();
		table2_1 = gm.getBuyerName_en();
		table2_2 = gm.getBuyerAddress();
		table2_3 = gm.getInvoiceNum();
		table2_4 = gm.getPacking_date();
		table2_5 = gm.getLoading_port();
		table2_6 = gm.getUnload_port();
		table2_7 = gm.getTransport_way_en();
		table2_8 = giList.get(0).getMarks_Numbers();
		
		table2_18 = gm.getGoods_name_en();
		table2_19 = gm.getSellerName_en();
		
		List<Table2_List> list = new ArrayList<Table2_List>();
		int x = 0, y = 0, z = 0, n = 0;
		for (int i = 0; i < giList.size(); i ++) {
			Table2_List l = new Table2_List(giList.get(i));
			x += Integer.parseInt(giList.get(i).getQuantities());
			y += Integer.parseInt(giList.get(i).get_package());
			z += Integer.parseInt(giList.get(i).getGWORNW());
			n += Integer.parseInt(giList.get(i).getMeans());
			list.add(l);
		}
		table2_14 = x + "";
		table2_15 = y + "";
		table2_16 = z + "";
		table2_17 = n + "";
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

	public String getTable2_1() {
		return table2_1;
	}

	public void setTable2_1(String table2_1) {
		this.table2_1 = table2_1;
	}

	public String getTable2_2() {
		return table2_2;
	}

	public void setTable2_2(String table2_2) {
		this.table2_2 = table2_2;
	}

	public String getTable2_3() {
		return table2_3;
	}

	public void setTable2_3(String table2_3) {
		this.table2_3 = table2_3;
	}

	public String getTable2_4() {
		return table2_4;
	}

	public void setTable2_4(String table2_4) {
		this.table2_4 = table2_4;
	}

	public String getTable2_5() {
		return table2_5;
	}

	public void setTable2_5(String table2_5) {
		this.table2_5 = table2_5;
	}

	public String getTable2_6() {
		return table2_6;
	}

	public void setTable2_6(String table2_6) {
		this.table2_6 = table2_6;
	}

	public String getTable2_7() {
		return table2_7;
	}

	public void setTable2_7(String table2_7) {
		this.table2_7 = table2_7;
	}

	public String getTable2_14() {
		return table2_14;
	}

	public void setTable2_14(String table2_14) {
		this.table2_14 = table2_14;
	}

	public String getTable2_15() {
		return table2_15;
	}

	public void setTable2_15(String table2_15) {
		this.table2_15 = table2_15;
	}

	public String getTable2_16() {
		return table2_16;
	}

	public void setTable2_16(String table2_16) {
		this.table2_16 = table2_16;
	}

	public String getTable2_17() {
		return table2_17;
	}

	public void setTable2_17(String table2_17) {
		this.table2_17 = table2_17;
	}

	public String getTable2_18() {
		return table2_18;
	}

	public void setTable2_18(String table2_18) {
		this.table2_18 = table2_18;
	}

	public String getTable2_19() {
		return table2_19;
	}

	public void setTable2_19(String table2_19) {
		this.table2_19 = table2_19;
	}

	public List<Table2_List> getList() {
		if (list == null) {
			list = new ArrayList<Table2_List>();
		}
		return list;
	}

	public void setList(List<Table2_List> list) {
		this.list = list;
	}

	public String getTable2_8() {
		return table2_8;
	}

	public void setTable2_8(String table2_8) {
		this.table2_8 = table2_8;
	}
	
}
