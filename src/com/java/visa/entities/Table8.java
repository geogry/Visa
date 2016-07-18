package com.java.visa.entities;

public class Table8 {

	private String chineseName;
	private String englishName;
	private String table8_1;
	private String table8_2;
	private String table8_3;
	private String table8_4;
	private String table8_5;
	private String table8_6;
	public Table8(GeneralMessage gm) {
		super();
		englishName = gm.getSellerName_en();
		chineseName = gm.getSellerName_zh_CN();
		table8_1 = gm.getBuyerName_en();
		table8_2 = gm.getBuyerFax();
		table8_3 = gm.getDate_benefitor_creitify();
		table8_4 = gm.getPlace_benefitor_creitify();
		table8_5 = gm.getContent_benefitor_creitify();
		table8_6 = gm.getSellerName_en();
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
	public String getTable8_1() {
		return table8_1;
	}
	public void setTable8_1(String table8_1) {
		this.table8_1 = table8_1;
	}
	public String getTable8_2() {
		return table8_2;
	}
	public void setTable8_2(String table8_2) {
		this.table8_2 = table8_2;
	}
	public String getTable8_3() {
		return table8_3;
	}
	public void setTable8_3(String table8_3) {
		this.table8_3 = table8_3;
	}
	public String getTable8_4() {
		return table8_4;
	}
	public void setTable8_4(String table8_4) {
		this.table8_4 = table8_4;
	}
	public String getTable8_5() {
		return table8_5;
	}
	public void setTable8_5(String table8_5) {
		this.table8_5 = table8_5;
	}
	public String getTable8_6() {
		return table8_6;
	}
	public void setTable8_6(String table8_6) {
		this.table8_6 = table8_6;
	}
}
