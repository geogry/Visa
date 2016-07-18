package com.java.visa.entities;

import java.util.ArrayList;
import java.util.List;

public class Table9 {

	private String table9_1;
	private String table9_2;
	private String table9_3;
	private String table9_4;
	private String table9_5;
	private String table9_6;
	private String table9_7;
	private String table9_8;
	private String table9_9;
	private String table9_10;
	private String table9_11;
	private String table9_12;
	private String table9_13;
	private String table9_14;
	private String table9_15;
	private String table9_16;
	private String table9_17;
	private String table9_18;
	private String table9_19;
	private String table9_20;
	private String table9_21;
	private String table9_22;
	private String table9_23;
	private String table9_24;
	private String table9_25;
	private String table9_26;
	private String table9_27;
	private String table9_28;
	private String table9_29;
	private String table9_30;
	private String table9_35;
	private String table9_38;
	private String table9_39;
	private String table9_40;
	private String table9_41;
	private String table9_42;
	private String table9_43;
	private String table9_44;
	private String table9_45;
	
	private List<Table9_List> list;

	public Table9(GeneralMessage gm, List<GoodsInfo> giList) {
		super();
		table9_1 = gm.getExport_port();
		table9_2 = gm.getDeclaration_form_recordNum();
		table9_3 = gm.getExport_date();
		table9_4 = gm.getApply_date();
		table9_5 = gm.getSellerName_zh_CN();
		table9_6 = gm.getTransport_way_zh_cn();
		table9_7 = gm.getVesselName();
		table9_8 = gm.getBlNum();
		table9_9 = gm.getDelivery_unit();
		table9_10 = gm.getTrade_way();
		table9_11 = gm.getDuty_free_properties();
		table9_12 = gm.getSettlement_way();
		table9_13 = gm.getLicenceNum();
		table9_14 = gm.getReach_country();
		table9_15 = gm.getUnload_port();
		table9_16 = gm.getSupply_goods_place();
		table9_17 = gm.getApproval_number();
		table9_18 = gm.getDeal_way();
		table9_19 = gm.getFreight_();
		table9_20 = gm.getPremium();
		table9_21 = gm.getTrivial_fee();
		table9_22 = gm.getScNum();
		table9_23 = gm.getAmount();
		table9_24 = gm.getPackaging_type();
		table9_25 = gm.getGross_weight();
		table9_26 = gm.getNet_weight();
		table9_27 = gm.getContainerNum();
		table9_28 = gm.getAttach_doc();
		table9_29 = gm.getManufacturer();
		table9_30 = gm.getTag_note();
		table9_35 = gm.getTo_country_zh_cn();
		table9_38 = gm.getMonetary();
		table9_39 = gm.getFree_tax();
		table9_40 = gm.getSellerName_zh_CN();
		table9_41 = gm.getSellerName_zh_CN();
		table9_42 = gm.getSellerAddress();
		table9_43 = gm.getPostcode_apply();
		table9_44 = gm.getPhoneNum_apply();
		table9_45 = gm.getDeclaration_form_date();
		List<Table9_List> l = new ArrayList<Table9_List>();
		for (int i = 0; i < giList.size(); i ++) {
			l.add(new Table9_List(giList.get(i)));
		}
		list = l;
	}

	public String getTable9_1() {
		return table9_1;
	}

	public void setTable9_1(String table9_1) {
		this.table9_1 = table9_1;
	}

	public String getTable9_2() {
		return table9_2;
	}

	public void setTable9_2(String table9_2) {
		this.table9_2 = table9_2;
	}

	public String getTable9_3() {
		return table9_3;
	}

	public void setTable9_3(String table9_3) {
		this.table9_3 = table9_3;
	}

	public String getTable9_4() {
		return table9_4;
	}

	public void setTable9_4(String table9_4) {
		this.table9_4 = table9_4;
	}

	public String getTable9_5() {
		return table9_5;
	}

	public void setTable9_5(String table9_5) {
		this.table9_5 = table9_5;
	}

	public String getTable9_6() {
		return table9_6;
	}

	public void setTable9_6(String table9_6) {
		this.table9_6 = table9_6;
	}

	public String getTable9_7() {
		return table9_7;
	}

	public void setTable9_7(String table9_7) {
		this.table9_7 = table9_7;
	}

	public String getTable9_8() {
		return table9_8;
	}

	public void setTable9_8(String table9_8) {
		this.table9_8 = table9_8;
	}

	public String getTable9_9() {
		return table9_9;
	}

	public void setTable9_9(String table9_9) {
		this.table9_9 = table9_9;
	}

	public String getTable9_10() {
		return table9_10;
	}

	public void setTable9_10(String table9_10) {
		this.table9_10 = table9_10;
	}

	public String getTable9_11() {
		return table9_11;
	}

	public void setTable9_11(String table9_11) {
		this.table9_11 = table9_11;
	}

	public String getTable9_12() {
		return table9_12;
	}

	public void setTable9_12(String table9_12) {
		this.table9_12 = table9_12;
	}

	public String getTable9_13() {
		return table9_13;
	}

	public void setTable9_13(String table9_13) {
		this.table9_13 = table9_13;
	}

	public String getTable9_14() {
		return table9_14;
	}

	public void setTable9_14(String table9_14) {
		this.table9_14 = table9_14;
	}

	public String getTable9_15() {
		return table9_15;
	}

	public void setTable9_15(String table9_15) {
		this.table9_15 = table9_15;
	}

	public String getTable9_16() {
		return table9_16;
	}

	public void setTable9_16(String table9_16) {
		this.table9_16 = table9_16;
	}

	public String getTable9_17() {
		return table9_17;
	}

	public void setTable9_17(String table9_17) {
		this.table9_17 = table9_17;
	}

	public String getTable9_18() {
		return table9_18;
	}

	public void setTable9_18(String table9_18) {
		this.table9_18 = table9_18;
	}

	public String getTable9_19() {
		return table9_19;
	}

	public void setTable9_19(String table9_19) {
		this.table9_19 = table9_19;
	}

	public String getTable9_20() {
		return table9_20;
	}

	public void setTable9_20(String table9_20) {
		this.table9_20 = table9_20;
	}

	public String getTable9_21() {
		return table9_21;
	}

	public void setTable9_21(String table9_21) {
		this.table9_21 = table9_21;
	}

	public String getTable9_22() {
		return table9_22;
	}

	public void setTable9_22(String table9_22) {
		this.table9_22 = table9_22;
	}

	public String getTable9_23() {
		return table9_23;
	}

	public void setTable9_23(String table9_23) {
		this.table9_23 = table9_23;
	}

	public String getTable9_24() {
		return table9_24;
	}

	public void setTable9_24(String table9_24) {
		this.table9_24 = table9_24;
	}

	public String getTable9_25() {
		return table9_25;
	}

	public void setTable9_25(String table9_25) {
		this.table9_25 = table9_25;
	}

	public String getTable9_26() {
		return table9_26;
	}

	public void setTable9_26(String table9_26) {
		this.table9_26 = table9_26;
	}

	public String getTable9_27() {
		return table9_27;
	}

	public void setTable9_27(String table9_27) {
		this.table9_27 = table9_27;
	}

	public String getTable9_28() {
		return table9_28;
	}

	public void setTable9_28(String table9_28) {
		this.table9_28 = table9_28;
	}

	public String getTable9_29() {
		return table9_29;
	}

	public void setTable9_29(String table9_29) {
		this.table9_29 = table9_29;
	}

	public String getTable9_30() {
		return table9_30;
	}

	public void setTable9_30(String table9_30) {
		this.table9_30 = table9_30;
	}

	public String getTable9_35() {
		return table9_35;
	}

	public void setTable9_35(String table9_35) {
		this.table9_35 = table9_35;
	}

	public String getTable9_38() {
		return table9_38;
	}

	public void setTable9_38(String table9_38) {
		this.table9_38 = table9_38;
	}

	public String getTable9_39() {
		return table9_39;
	}

	public void setTable9_39(String table9_39) {
		this.table9_39 = table9_39;
	}

	public String getTable9_40() {
		return table9_40;
	}

	public void setTable9_40(String table9_40) {
		this.table9_40 = table9_40;
	}

	public String getTable9_41() {
		return table9_41;
	}

	public void setTable9_41(String table9_41) {
		this.table9_41 = table9_41;
	}

	public String getTable9_42() {
		return table9_42;
	}

	public void setTable9_42(String table9_42) {
		this.table9_42 = table9_42;
	}

	public String getTable9_43() {
		return table9_43;
	}

	public void setTable9_43(String table9_43) {
		this.table9_43 = table9_43;
	}

	public String getTable9_44() {
		return table9_44;
	}

	public void setTable9_44(String table9_44) {
		this.table9_44 = table9_44;
	}

	public String getTable9_45() {
		return table9_45;
	}

	public void setTable9_45(String table9_45) {
		this.table9_45 = table9_45;
	}

	public List<Table9_List> getList() {
		return list;
	}

	public void setList(List<Table9_List> list) {
		this.list = list;
	}
}
