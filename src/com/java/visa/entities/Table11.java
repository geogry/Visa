package com.java.visa.entities;

import java.util.ArrayList;
import java.util.List;

public class Table11 {

	private String table11_1;
	private String table11_2;
	private String table11_6;
	private String table11_7;
	private String table11_8;
	private String table11_9;
	private String table11_10;
	private String table11_11;
	private String table11_12;
	private String table11_13;
	private String table11_14;
	private String table11_15;
	private String table11_16;
	private String table11_17;
	private String table11_18;
	
	private List<Table11_List> list;

	public Table11(GeneralMessage gm, List<GoodsInfo> giList) {
		super();
		table11_1 = gm.getApplicant();
		table11_2 = giList.get(0).getMarks_Numbers();
		table11_6 = gm.getInsurance_amount_en();
		table11_7 = gm.getExcess();
		table11_8 = gm.getSailing_date();
		table11_9 = gm.getVesselName();
		table11_10 = gm.getLoading_port();
		table11_11 = gm.getFreight_();
		table11_12 = gm.getUnload_port();
		table11_13 = gm.getInsurance_type();
		table11_14 = gm.getAddress_applicant();
		table11_15 = gm.getPhoneNum_applicant();
		table11_16 = gm.getFax_applicant();
		table11_17 = gm.getIndemnity_place();
		table11_18 = gm.getInsurance_policy_date();
		List<Table11_List> l = new ArrayList<Table11_List>();
		for (int i = 0; i < giList.size(); i ++) {
			l.add(new Table11_List(giList.get(i)));
		}
		list = l;
	}

	public String getTable11_1() {
		return table11_1;
	}

	public void setTable11_1(String table11_1) {
		this.table11_1 = table11_1;
	}

	public String getTable11_2() {
		return table11_2;
	}

	public void setTable11_2(String table11_2) {
		this.table11_2 = table11_2;
	}

	public String getTable11_6() {
		return table11_6;
	}

	public void setTable11_6(String table11_6) {
		this.table11_6 = table11_6;
	}

	public String getTable11_7() {
		return table11_7;
	}

	public void setTable11_7(String table11_7) {
		this.table11_7 = table11_7;
	}

	public String getTable11_8() {
		return table11_8;
	}

	public void setTable11_8(String table11_8) {
		this.table11_8 = table11_8;
	}

	public String getTable11_9() {
		return table11_9;
	}

	public void setTable11_9(String table11_9) {
		this.table11_9 = table11_9;
	}

	public String getTable11_10() {
		return table11_10;
	}

	public void setTable11_10(String table11_10) {
		this.table11_10 = table11_10;
	}

	public String getTable11_11() {
		return table11_11;
	}

	public void setTable11_11(String table11_11) {
		this.table11_11 = table11_11;
	}

	public String getTable11_12() {
		return table11_12;
	}

	public void setTable11_12(String table11_12) {
		this.table11_12 = table11_12;
	}

	public String getTable11_13() {
		return table11_13;
	}

	public void setTable11_13(String table11_13) {
		this.table11_13 = table11_13;
	}

	public String getTable11_14() {
		return table11_14;
	}

	public void setTable11_14(String table11_14) {
		this.table11_14 = table11_14;
	}

	public String getTable11_15() {
		return table11_15;
	}

	public void setTable11_15(String table11_15) {
		this.table11_15 = table11_15;
	}

	public String getTable11_16() {
		return table11_16;
	}

	public void setTable11_16(String table11_16) {
		this.table11_16 = table11_16;
	}

	public String getTable11_17() {
		return table11_17;
	}

	public void setTable11_17(String table11_17) {
		this.table11_17 = table11_17;
	}

	public String getTable11_18() {
		return table11_18;
	}

	public void setTable11_18(String table11_18) {
		this.table11_18 = table11_18;
	}

	public List<Table11_List> getList() {
		if (list == null) {
			list = new ArrayList<Table11_List>();
		}
		return list;
	}

	public void setList(List<Table11_List> list) {
		this.list = list;
	}
}
