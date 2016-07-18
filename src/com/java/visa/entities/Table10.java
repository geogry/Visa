package com.java.visa.entities;

import java.util.List;

public class Table10 {

	private String table10_1;
	private String table10_2;
	private String table10_3;
	private String table10_4;
	private String table10_5;
	private String table10_6;
	private String table10_7;
	private String table10_8;
	private String table10_9;
	private String table10_10;
	private String table10_11;
	private String table10_12;
	private String table10_13;
	private String table10_14;
	private String table10_15;
	private String table10_16;
	private String table10_17;
	private String table10_18;
	private String table10_19;
	private String table10_20;
	private String table10_21;
	private String table10_22;
	private String table10_23;
	private String table10_24;
	private String table10_25;
	public Table10(GeneralMessage gm, List<GoodsInfo> giList) {
		super();
		table10_1 = gm.getSellerName_zh_CN();
		table10_2 = gm.getSellerName_en();
		table10_3 = gm.getBuyerName_zh_CN();
		table10_4 = gm.getBuyerName_en();
		table10_5 = gm.getGoods_name_zh_CN() + "    " + gm.getGoods_name_en();
		table10_6 = giList.get(0).gethSCode();
		table10_7 = gm.getProduce_area();
		table10_8 = gm.getAmount_weight();
		table10_10 = gm.getPackaging_type_count();
		table10_11 = gm.getVesselName();
		table10_12 = gm.getTrade_way();
		table10_13 = gm.getStore_place();
		table10_14 = gm.getScNum();
		table10_15 = gm.getLcNum();
		table10_16 = gm.getPurpose();
		table10_17 = gm.getShipment_date();
		table10_18 = gm.getTo_country_zh_cn();
		table10_19 = gm.getLicenceNum();
		table10_20 = gm.getStart_place();
		table10_21 = gm.getReach_port();
		table10_22 = gm.getManufacture_register_no();
		table10_23 = gm.getContainer_amount();
		table10_24 = gm.getSpecial_request();
		table10_25 = giList.get(0).getMarks_Numbers();
		
		int i = 0;
		for(int j = 0 ; j < giList.size(); j++){
			i += Integer.parseInt(giList.get(j).getAmount());
		}
		table10_9 = i + "";
	}
	public String getTable10_1() {
		return table10_1;
	}
	public void setTable10_1(String table10_1) {
		this.table10_1 = table10_1;
	}
	public String getTable10_2() {
		return table10_2;
	}
	public void setTable10_2(String table10_2) {
		this.table10_2 = table10_2;
	}
	public String getTable10_3() {
		return table10_3;
	}
	public void setTable10_3(String table10_3) {
		this.table10_3 = table10_3;
	}
	public String getTable10_4() {
		return table10_4;
	}
	public void setTable10_4(String table10_4) {
		this.table10_4 = table10_4;
	}
	public String getTable10_5() {
		return table10_5;
	}
	public void setTable10_5(String table10_5) {
		this.table10_5 = table10_5;
	}
	public String getTable10_6() {
		return table10_6;
	}
	public void setTable10_6(String table10_6) {
		this.table10_6 = table10_6;
	}
	public String getTable10_7() {
		return table10_7;
	}
	public void setTable10_7(String table10_7) {
		this.table10_7 = table10_7;
	}
	public String getTable10_8() {
		return table10_8;
	}
	public void setTable10_8(String table10_8) {
		this.table10_8 = table10_8;
	}
	public String getTable10_9() {
		return table10_9;
	}
	public void setTable10_9(String table10_9) {
		this.table10_9 = table10_9;
	}
	public String getTable10_10() {
		return table10_10;
	}
	public void setTable10_10(String table10_10) {
		this.table10_10 = table10_10;
	}
	public String getTable10_11() {
		return table10_11;
	}
	public void setTable10_11(String table10_11) {
		this.table10_11 = table10_11;
	}
	public String getTable10_12() {
		return table10_12;
	}
	public void setTable10_12(String table10_12) {
		this.table10_12 = table10_12;
	}
	public String getTable10_13() {
		return table10_13;
	}
	public void setTable10_13(String table10_13) {
		this.table10_13 = table10_13;
	}
	public String getTable10_14() {
		return table10_14;
	}
	public void setTable10_14(String table10_14) {
		this.table10_14 = table10_14;
	}
	public String getTable10_15() {
		return table10_15;
	}
	public void setTable10_15(String table10_15) {
		this.table10_15 = table10_15;
	}
	public String getTable10_16() {
		return table10_16;
	}
	public void setTable10_16(String table10_16) {
		this.table10_16 = table10_16;
	}
	public String getTable10_17() {
		return table10_17;
	}
	public void setTable10_17(String table10_17) {
		this.table10_17 = table10_17;
	}
	public String getTable10_18() {
		return table10_18;
	}
	public void setTable10_18(String table10_18) {
		this.table10_18 = table10_18;
	}
	public String getTable10_19() {
		return table10_19;
	}
	public void setTable10_19(String table10_19) {
		this.table10_19 = table10_19;
	}
	public String getTable10_20() {
		return table10_20;
	}
	public void setTable10_20(String table10_20) {
		this.table10_20 = table10_20;
	}
	public String getTable10_21() {
		return table10_21;
	}
	public void setTable10_21(String table10_21) {
		this.table10_21 = table10_21;
	}
	public String getTable10_22() {
		return table10_22;
	}
	public void setTable10_22(String table10_22) {
		this.table10_22 = table10_22;
	}
	public String getTable10_23() {
		return table10_23;
	}
	public void setTable10_23(String table10_23) {
		this.table10_23 = table10_23;
	}
	public String getTable10_24() {
		return table10_24;
	}
	public void setTable10_24(String table10_24) {
		this.table10_24 = table10_24;
	}
	public String getTable10_25() {
		return table10_25;
	}
	public void setTable10_25(String table10_25) {
		this.table10_25 = table10_25;
	}
}
