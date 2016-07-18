package com.java.visa.word;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import com.java.visa.entities.Table1;
import com.java.visa.entities.Table10;
import com.java.visa.entities.Table11;
import com.java.visa.entities.Table2;
import com.java.visa.entities.Table3;
import com.java.visa.entities.Table4;
import com.java.visa.entities.Table5;
import com.java.visa.entities.Table6;
import com.java.visa.entities.Table7;
import com.java.visa.entities.Table8;
import com.java.visa.entities.Table9;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class VisaHandler {
	
	Configuration configuration;
	private String date = null;
	
	public VisaHandler(String date) {
		configuration = new Configuration();
		configuration.setDefaultEncoding("UTF-8");
		this.date = date;
	}
	
	public boolean createTable1(Table1 table1) {
		//用户保存需要填入模板的数据
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("chineseName", table1.getChineseName());
		dataMap.put("englishName", table1.getEnglishName());
		dataMap.put("table1_1", table1.getTable1_1());
		dataMap.put("table1_2", table1.getTable1_2());
		dataMap.put("table1_3", table1.getTable1_3());
		dataMap.put("table1_4", table1.getTable1_4());
		dataMap.put("table1_5", table1.getTable1_5());
		dataMap.put("table1_6", table1.getTable1_6());
		dataMap.put("table1_7", table1.getTable1_7());
		dataMap.put("table1_8", table1.getTable1_8());
		dataMap.put("table1_9", table1.getTable1_9());
		dataMap.put("table1_10", table1.getTable1_10());
		dataMap.put("table1_15", table1.getTable1_15());
		dataMap.put("table1_16", table1.getTable1_16());
		dataMap.put("table1_17", table1.getTable1_17());
		dataMap.put("table1_18", table1.getTable1_18());
		dataMap.put("table1_19", table1.getTable1_19());
		
		dataMap.put("table1_list", table1.getList());
		
		return createFile(dataMap, "table1.xml", "table1.doc");
	}

	public boolean createTable2(Table2 table2) {
		//用户保存需要填入模板的数据
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("chineseName", table2.getChineseName());
		dataMap.put("englishName", table2.getEnglishName());
		dataMap.put("table2_1", table2.getTable2_1());
		dataMap.put("table2_2", table2.getTable2_2());
		dataMap.put("table2_3", table2.getTable2_3());
		dataMap.put("table2_4", table2.getTable2_4());
		dataMap.put("table2_5", table2.getTable2_5());
		dataMap.put("table2_6", table2.getTable2_6());
		dataMap.put("table2_7", table2.getTable2_7());
		dataMap.put("table2_8", table2.getTable2_8());
		dataMap.put("table2_14", table2.getTable2_14());
		dataMap.put("table2_15", table2.getTable2_15());
		dataMap.put("table2_16", table2.getTable2_16());
		dataMap.put("table2_17", table2.getTable2_17());
		dataMap.put("table2_18", table2.getTable2_18());
		dataMap.put("table2_19", table2.getTable2_19());
		dataMap.put("table2_list", table2.getList());
		
		return createFile(dataMap, "table2.xml", "table2.doc");
	}
	
	public boolean createTable3(Table3 table3) {
		//用户保存需要填入模板的数据
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("table3_1", table3.getTable3_1());
		dataMap.put("table3_2", table3.getTable3_2());
		dataMap.put("table3_3", table3.getTable3_3());
		dataMap.put("table3_4", table3.getTable3_4());
		dataMap.put("table3_5", table3.getTable3_5());
		dataMap.put("table3_6", table3.getTable3_6());
		dataMap.put("table3_7", table3.getTable3_7());
		dataMap.put("table3_8", table3.getTable3_8());
		dataMap.put("table3_9", table3.getTable3_9());
		dataMap.put("table3_10", table3.getTable3_10());
		dataMap.put("table3_11", table3.getTable3_11());
		dataMap.put("table3_15", table3.getTable3_15());
		dataMap.put("table3_16", table3.getTable3_16());
		dataMap.put("table3_17", table3.getTable3_17());
		dataMap.put("table3_18", table3.getTable3_18());
		dataMap.put("table3_19", table3.getTable3_19());
		dataMap.put("table3_20", table3.getTable3_20());
		dataMap.put("table3_21", table3.getTable3_21());
		dataMap.put("table3_list", table3.getList());
		
		return createFile(dataMap, "table3.xml", "table3.doc");
	}
	
	public boolean createTable5(Table5 table5) {
		//用户保存需要填入模板的数据
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("table5_1", table5.getTable5_1());
		dataMap.put("table5_2", table5.getTable5_2());
		dataMap.put("table5_3", table5.getTable5_3());
		dataMap.put("table5_4", table5.getTable5_4());
		dataMap.put("table5_6", table5.getTable5_6());
		dataMap.put("table5_11", table5.getTable5_11());
		dataMap.put("table5_12", table5.getTable5_12());
		dataMap.put("table5_list", table5.getList());
		
		return createFile(dataMap, "table5.xml", "table5.doc");
	}

	public boolean createTable4(Table4 table4) {
		//用户保存需要填入模板的数据
		Map<String, Object> dataMap = new HashMap<String, Object>();
		
		dataMap.put("table4_1", table4.getTable4_1());
		dataMap.put("table4_2", table4.getTable4_2());
		dataMap.put("table4_3", table4.getTable4_3());
		dataMap.put("table4_4", table4.getTable4_4());
		dataMap.put("table4_5", table4.getTable4_5());
		dataMap.put("table4_6", table4.getTable4_6());
		dataMap.put("table4_10", table4.getTable4_10());
		dataMap.put("table4_11", table4.getTable4_11());
		dataMap.put("table4_list", table4.getList());
		
		return createFile(dataMap, "table4.xml", "table4.doc");
	}

	public boolean createTable6(Table6 table6) {
		//用户保存需要填入模板的数据
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("table6_1", table6.getTable6_1());
		dataMap.put("table6_2", table6.getTable6_2());
		dataMap.put("table6_3", table6.getTable6_3());
		dataMap.put("table6_4", table6.getTable6_4());
		dataMap.put("table6_5", table6.getTable6_5());
		dataMap.put("table6_6", table6.getTable6_6());
		dataMap.put("table6_7", table6.getTable6_7());
		dataMap.put("table6_8", table6.getTable6_8());
		dataMap.put("table6_9", table6.getTable6_9());
		dataMap.put("table6_10", table6.getTable6_10());
		dataMap.put("table6_14", table6.getTable6_14());
		dataMap.put("table6_15", table6.getTable6_15());
		dataMap.put("table6_16", table6.getTable6_16());
		dataMap.put("table6_17", table6.getTable6_17());
		dataMap.put("table6_18", table6.getTable6_18());
		dataMap.put("table6_list", table6.getList());
		dataMap.put("chineseName", table6.getChineseName());
		dataMap.put("englishName", table6.getEnglishName());
		
		return createFile(dataMap, "table6.xml", "table6.doc");
	}

	public boolean createTable7(Table7 table7) {
		//用户保存需要填入模板的数据
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("table7_1", table7.getTable7_1());
		dataMap.put("table7_2", table7.getTable7_2());
		dataMap.put("table7_3", table7.getTable7_3());
		dataMap.put("table7_4", table7.getTable7_4());
		dataMap.put("table7_5", table7.getTable7_5());
		dataMap.put("table7_6", table7.getTable7_6());
		dataMap.put("table7_7", table7.getTable7_7());
		dataMap.put("table7_8", table7.getTable7_8());
		dataMap.put("table7_9", table7.getTable7_9());
		dataMap.put("table7_10", table7.getTable7_10());
		
		return createFile(dataMap, "table7.xml", "table7.doc");
	}

	public boolean createTable8(Table8 table8) {
		//用户保存需要填入模板的数据
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("chineseName", table8.getChineseName());
		dataMap.put("englishName", table8.getEnglishName());
		dataMap.put("table8_1", table8.getTable8_1());
		dataMap.put("table8_2", table8.getTable8_2());
		dataMap.put("table8_3", table8.getTable8_3());
		dataMap.put("table8_4", table8.getTable8_4());
		dataMap.put("table8_5", table8.getTable8_5());
		dataMap.put("table8_6", table8.getTable8_6());
		
		return createFile(dataMap, "table8.xml", "table8.doc");
	}

	public boolean createTable9(Table9 table9) {
		//用户保存需要填入模板的数据
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("table9_1", table9.getTable9_1());
		dataMap.put("table9_2", table9.getTable9_2());
		dataMap.put("table9_3", table9.getTable9_3());
		dataMap.put("table9_4", table9.getTable9_4());
		dataMap.put("table9_5", table9.getTable9_5());
		dataMap.put("table9_6", table9.getTable9_6());
		dataMap.put("table9_7", table9.getTable9_7());
		dataMap.put("table9_8", table9.getTable9_8());
		dataMap.put("table9_9", table9.getTable9_9());
		dataMap.put("table9_10", table9.getTable9_10());
		dataMap.put("table9_11", table9.getTable9_11());
		dataMap.put("table9_12", table9.getTable9_12());
		dataMap.put("table9_13", table9.getTable9_13());
		dataMap.put("table9_14", table9.getTable9_14());
		dataMap.put("table9_15", table9.getTable9_15());
		dataMap.put("table9_16", table9.getTable9_16());
		dataMap.put("table9_17", table9.getTable9_17());
		dataMap.put("table9_18", table9.getTable9_18());
		dataMap.put("table9_19", table9.getTable9_19());
		dataMap.put("table9_20", table9.getTable9_20());
		dataMap.put("table9_21", table9.getTable9_21());
		dataMap.put("table9_22", table9.getTable9_22());
		dataMap.put("table9_23", table9.getTable9_23());
		dataMap.put("table9_24", table9.getTable9_24());
		dataMap.put("table9_25", table9.getTable9_25());
		dataMap.put("table9_26", table9.getTable9_26());
		dataMap.put("table9_27", table9.getTable9_27());
		dataMap.put("table9_28", table9.getTable9_28());
		dataMap.put("table9_29", table9.getTable9_29());
		dataMap.put("table9_30", table9.getTable9_30());
		dataMap.put("table9_35", table9.getTable9_35());
		dataMap.put("table9_38", table9.getTable9_38());
		dataMap.put("table9_39", table9.getTable9_39());
		dataMap.put("table9_40", table9.getTable9_40());
		dataMap.put("table9_41", table9.getTable9_41());
		dataMap.put("table9_42", table9.getTable9_42());
		dataMap.put("table9_43", table9.getTable9_43());
		dataMap.put("table9_44", table9.getTable9_44());
		dataMap.put("table9_45", table9.getTable9_45());
		dataMap.put("table9_list", table9.getList());
		
		return createFile(dataMap, "table9.xml", "table9.doc");
	}
	
	public boolean createTable10(Table10 table10) {
		//用户保存需要填入模板的数据
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("table10_1", table10.getTable10_1());
		dataMap.put("table10_2", table10.getTable10_2());
		dataMap.put("table10_3", table10.getTable10_3());
		dataMap.put("table10_4", table10.getTable10_4());
		dataMap.put("table10_5", table10.getTable10_5());
		dataMap.put("table10_6", table10.getTable10_6());
		dataMap.put("table10_7", table10.getTable10_7());
		dataMap.put("table10_8", table10.getTable10_8());
		dataMap.put("table10_9", table10.getTable10_9());
		dataMap.put("table10_10", table10.getTable10_10());
		dataMap.put("table10_11", table10.getTable10_11());
		dataMap.put("table10_12", table10.getTable10_12());
		dataMap.put("table10_13", table10.getTable10_13());
		dataMap.put("table10_14", table10.getTable10_14());
		dataMap.put("table10_15", table10.getTable10_15());
		dataMap.put("table10_16", table10.getTable10_16());
		dataMap.put("table10_17", table10.getTable10_17());
		dataMap.put("table10_18", table10.getTable10_18());
		dataMap.put("table10_19", table10.getTable10_19());
		dataMap.put("table10_20", table10.getTable10_20());
		dataMap.put("table10_21", table10.getTable10_21());
		dataMap.put("table10_22", table10.getTable10_22());
		dataMap.put("table10_23", table10.getTable10_23());
		dataMap.put("table10_24", table10.getTable10_24());
		dataMap.put("table10_25", table10.getTable10_25());
		
		return createFile(dataMap, "table10.xml", "table10.doc");
	}
	
	public boolean createTable11(Table11 table11) {
		//用户保存需要填入模板的数据
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("table11_1", table11.getTable11_1());
		dataMap.put("table11_2", table11.getTable11_2());
		dataMap.put("table11_6", table11.getTable11_6());
		dataMap.put("table11_7", table11.getTable11_7());
		dataMap.put("table11_8", table11.getTable11_8());
		dataMap.put("table11_9", table11.getTable11_9());
		dataMap.put("table11_10", table11.getTable11_10());
		dataMap.put("table11_11", table11.getTable11_11());
		dataMap.put("table11_12", table11.getTable11_12());
		dataMap.put("table11_13", table11.getTable11_13());
		dataMap.put("table11_14", table11.getTable11_14());
		dataMap.put("table11_15", table11.getTable11_15());
		dataMap.put("table11_16", table11.getTable11_16());
		dataMap.put("table11_17", table11.getTable11_17());
		dataMap.put("table11_18", table11.getTable11_18());
		dataMap.put("table11_list", table11.getList());
		
		return createFile(dataMap, "table11.xml", "table11.doc");
		
	}
	
	public boolean createFile(Map<String, Object> dataMap, String xmlName, String fileName) {
		//设置模板装载数据的方法和路径，
		configuration.setClassForTemplateLoading(this.getClass(), "/com/java/visa/template");
		Template t = null;
		try {
			t = configuration.getTemplate(xmlName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
			return false;
		}
		//输出文件路径
		File outFile = new File(System.getProperty("user.dir") + "/" + date + "/" + fileName);
		//判断路径是否存在，如果不存在就创建
		if (!outFile.getParentFile().exists()) {
			outFile.getParentFile().mkdirs();
		}
		Writer writer = null;
		try {
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile), "utf-8"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} 
		try {
			t.process(dataMap, writer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
