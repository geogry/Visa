package com.java.visa.word;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.java.visa.dbhelper.DBHelper;
import com.java.visa.entities.GeneralMessage;
import com.java.visa.entities.GoodsInfo;
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

public class BuildDoc {

	private DBHelper mDBHelper;
	private ResultSet rs_all;
	private ResultSet rs_goods;
	private GeneralMessage gm;
	private List<GoodsInfo> giList;
	private String date;
	
	public BuildDoc(String this_time){
		mDBHelper = new DBHelper();
		mDBHelper.connect();
		rs_all = mDBHelper.queryAllInfo(this_time);
		ResultSetHandler rsHandler = new ResultSetHandler();
		gm = rsHandler.GMHandle(rs_all);
		rs_goods = mDBHelper.queryGoodsInfo(this_time);
		giList = rsHandler.GIHandle(rs_goods);
		mDBHelper.close();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-D-HH-mm-ss");
		date = df.format(new Date());
	}
	
	public void test1() {
		VisaHandler visaHandler = new VisaHandler(date);
		Table1 table1 = new Table1(gm, giList);
		if (visaHandler.createTable1(table1)) {
			System.out.println("yes!!!!!!!!!");
		} else {
			System.out.println("no!!!!!!!!!!");
		}
	}
	
	public void test2() {
		VisaHandler visaHandler = new VisaHandler(date);
		Table2 table2 = new Table2(gm, giList);
		if (visaHandler.createTable2(table2)) {
			System.out.println("yes");
		} else {
			System.out.println("NO");
		}
	}
	
	public void test3() {
		if (new VisaHandler(date).createTable3(new Table3(gm, giList))) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
	public void test5() {
		VisaHandler visaHandler = new VisaHandler(date);
		Table5 table5 = new Table5(gm, giList);
		if (visaHandler.createTable5(table5)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
	public void test4() {
		if (new VisaHandler(date).createTable4(new Table4(gm, giList))) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
	public void test6() {
		if (new VisaHandler(date).createTable6(new Table6(gm, giList))) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
	public void test7() {
		if (new VisaHandler(date).createTable7(new Table7(gm))) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
	public void test8() {
		if (new VisaHandler(date).createTable8(new Table8(gm))) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
	public void test9() {
		if (new VisaHandler(date).createTable9(new Table9(gm, giList))) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
	public void test10() {
		if (new VisaHandler(date).createTable10(new Table10(gm, giList))) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
	public void test11() {
		if (new VisaHandler(date).createTable11(new Table11(gm, giList))) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
