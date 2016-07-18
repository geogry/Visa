package com.java.visa.entities;

import java.util.ArrayList;
import java.util.List;

public class Table3 {

	private String table3_1;
	private String table3_2;
	private String table3_3;
	private String table3_4;
	private String table3_5;
	private String table3_6;
	private String table3_7;
	private String table3_8;
	private String table3_9;
	private String table3_10;
	private String table3_11;
	private String table3_15;
	private String table3_16;
	private String table3_17;
	private String table3_18;
	private String table3_19;
	private String table3_20;
	private String table3_21;
	
	private List<Table3_List> list;

	public Table3(GeneralMessage gm, List<GoodsInfo> giList) {
		super();
		table3_1 = gm.getBlNum();
		table3_2 = gm.getSellerName_en();
		table3_3 = gm.getConsignee();
		table3_4 = gm.getNotify();
		table3_5 = gm.getPre_carriage();
		table3_6 = gm.getReceipt_place();
		table3_7 = gm.getVesselName();
		table3_8 = gm.getLoading_port();
		table3_9 = gm.getUnload_port();
		table3_10 = gm.getDelivery_place();
		table3_11 = giList.get(0).getMarks_Numbers();
		table3_15 = gm.getTransshipment_contact();
		table3_16 = gm.getFreight();
		table3_17 = gm.getPrepaid_place();
		table3_18 = gm.getFreight_payable_place();
		table3_19 = gm.getBl_date();
		table3_20 = gm.getBl_original_num();
		table3_21 = gm.getSign_bl();
		List<Table3_List> l = new ArrayList<Table3_List>();
		for (int i = 0; i < giList.size(); i ++) {
			l.add(new Table3_List(giList.get(i)));
		}
		list = l;
	}

	public String getTable3_1() {
		return table3_1;
	}

	public void setTable3_1(String table3_1) {
		this.table3_1 = table3_1;
	}

	public String getTable3_2() {
		return table3_2;
	}

	public void setTable3_2(String table3_2) {
		this.table3_2 = table3_2;
	}

	public String getTable3_3() {
		return table3_3;
	}

	public void setTable3_3(String table3_3) {
		this.table3_3 = table3_3;
	}

	public String getTable3_4() {
		return table3_4;
	}

	public void setTable3_4(String table3_4) {
		this.table3_4 = table3_4;
	}

	public String getTable3_5() {
		return table3_5;
	}

	public void setTable3_5(String table3_5) {
		this.table3_5 = table3_5;
	}

	public String getTable3_6() {
		return table3_6;
	}

	public void setTable3_6(String table3_6) {
		this.table3_6 = table3_6;
	}

	public String getTable3_7() {
		return table3_7;
	}

	public void setTable3_7(String table3_7) {
		this.table3_7 = table3_7;
	}

	public String getTable3_8() {
		return table3_8;
	}

	public void setTable3_8(String table3_8) {
		this.table3_8 = table3_8;
	}

	public String getTable3_9() {
		return table3_9;
	}

	public void setTable3_9(String table3_9) {
		this.table3_9 = table3_9;
	}

	public String getTable3_10() {
		return table3_10;
	}

	public void setTable3_10(String table3_10) {
		this.table3_10 = table3_10;
	}

	public String getTable3_11() {
		return table3_11;
	}

	public void setTable3_11(String table3_11) {
		this.table3_11 = table3_11;
	}

	public String getTable3_15() {
		return table3_15;
	}

	public void setTable3_15(String table3_15) {
		this.table3_15 = table3_15;
	}

	public String getTable3_16() {
		return table3_16;
	}

	public void setTable3_16(String table3_16) {
		this.table3_16 = table3_16;
	}

	public String getTable3_17() {
		return table3_17;
	}

	public void setTable3_17(String table3_17) {
		this.table3_17 = table3_17;
	}

	public String getTable3_18() {
		return table3_18;
	}

	public void setTable3_18(String table3_18) {
		this.table3_18 = table3_18;
	}

	public String getTable3_19() {
		return table3_19;
	}

	public void setTable3_19(String table3_19) {
		this.table3_19 = table3_19;
	}

	public String getTable3_20() {
		return table3_20;
	}

	public void setTable3_20(String table3_20) {
		this.table3_20 = table3_20;
	}

	public String getTable3_21() {
		return table3_21;
	}

	public void setTable3_21(String table3_21) {
		this.table3_21 = table3_21;
	}

	public List<Table3_List> getList() {
		if (list == null) {
			list = new ArrayList<Table3_List>();
		}
		return list;
	}

	public void setList(List<Table3_List> list) {
		this.list = list;
	}
	
}
