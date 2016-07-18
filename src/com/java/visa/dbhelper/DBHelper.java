package com.java.visa.dbhelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.java.visa.entities.GeneralMessage;
import com.java.visa.entities.GoodsInfo;

public class DBHelper {

	private String DBPath = null;
	private String url = null;
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	private String sql = null;
	
	public DBHelper(){
		DBPath = System.getProperty("user.dir") + "/DB/invoice.mdb";
		url = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=" + DBPath;
	}
	
	public void connect(){
		try {
			conn = DriverManager.getConnection(url, "", "");
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据库连接失败！！！");
		}
		//System.out.println("数据库连接成功！！！");
	}
	
	public ResultSet queryGoodsInfo(String this_time){
		sql = "select itemNum,marks_Numbers,hSCode,description,quantities,unit_price,amount,package,GWORNW,means " +
				"from goods_info where allinfo_ID ='" + this_time + "'";
		try {
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public ResultSet queryAllInfo(String this_time){
		sql = "select * from all_info where ID='" + this_time + "'";
		try {
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public void insertInfo(GeneralMessage gm){
		sql = "insert into all_info values('" + gm.getThis_time() + "','" + gm.getBuyerName_zh_CN() + "','" + gm.getBuyerName_en() + "','" + gm.getBuyerAddress() + "','" +
				gm.getBuyerFax() + "','" + gm.getSellerName_zh_CN() + "','" + gm.getSellerName_en() + "','" + gm.getSellerAddress() + "','" + gm.getSellerFax() + "','" + 
				gm.getInvoiceNum() + "','" + gm.getInvoiceDate() + "','" + gm.getScNum() + "','" + gm.getLcNum() + "','" + gm.getSignDate() + "','" + gm.getRoute_mean() + "','" + 
				gm.getShipping_advice_time() + "','" + gm.getBlNum() + "','" + gm.getVesselName() + "','" + gm.getEtd() + "','" + gm.getEta() + "','" + gm.getDate_benefitor_creitify() + "','" + 
				gm.getPlace_benefitor_creitify() + "','" + gm.getContent_benefitor_creitify() + "','" + gm.getBank_import() + "','" + gm.getBank_export() + "','" + gm.getAmount_invoice() + "','" + 
				gm.getDeadline_payment() + "','" + gm.getConsignee() + "','" + gm.getNotify() + "','" + gm.getPre_carriage() + "','" + gm.getReceipt_place() + "','" + gm.getDelivery_place() + "','" +
				gm.getTransshipment_contact() + "','" + gm.getLoading_port() + "','" + gm.getUnload_port() + "','" + gm.getTransit_port() + "','" + gm.getFreight() + "','" + gm.getPrepaid_place() + "','" + 
				gm.getFreight_payable_place() + "','" + gm.getBl_original_num() + "','" + gm.getSign_bl() + "','" + gm.getBl_date() + "','" + gm.getBl_place() + "','" + gm.getInsurance_type() + "','" + 
				gm.getInsurance_policy_date() + "','" + gm.getApplicant() + "','" + gm.getAddress_applicant() + "','" + gm.getExcess() + "','" + gm.getSailing_date() + "','" + gm.getFax_applicant() + "','" + 
				gm.getPhoneNum_applicant() + "','" + gm.getIndemnity_place() + "','" + gm.getOrigin_criterion() + "','" + gm.getOrigin_certificate_Num() + "','" + gm.getOrigin_certificate_Num_refer() + "','" + 
				gm.getPacking_date() + "','" + gm.getAmount_package_en() + "','" + gm.getGoods_name_zh_CN() + "','" + gm.getGoods_name_en() + "','" + gm.getProduce_area() + "','" + gm.getAmount_weight() + "','" + 
				gm.getPackaging_type_count() + "','" + gm.getProduce_country() + "','" + gm.getGross_weight() + "','" + gm.getNet_weight() + "','" + gm.getTrade_way() + "','" + gm.getStore_place() + "','" + 
				gm.getPurpose() + "','" + gm.getShipment_date() + "','" + gm.getTest_unit() + "','" + gm.getTo_country_zh_cn() + "','" + gm.getTo_country_en() + "','" + gm.getLicenceNum() + "','" + gm.getStart_place() + "','" + 
				gm.getReach_port() + "','" +  gm.getManufacture_register_no()+ "','" + gm.getContainer_amount() + "','" + gm.getSpecial_request() + "','" + gm.getExport_port() + "','" + gm.getDeclaration_form_recordNum() + "','" + 
				gm.getExport_date() + "','" + gm.getApply_date() + "','" + gm.getDelivery_unit() + "','" + gm.getTransport_way_zh_cn() + "','" + gm.getTransport_way_en() + "','" + gm.getDuty_free_properties() + "','" + 
				gm.getSettlement_way() + "','" + gm.getReach_country() + "','" + gm.getSupply_goods_place() + "','" + gm.getApproval_number() + "','" + gm.getDeal_way() + "','" + gm.getFreight_() + "','" + gm.getPremium() + "','" +
				gm.getInsurance_amount_num() + "','" + gm.getInsurance_amount_en() + "','" + gm.getTrivial_fee() + "','" + gm.getAmount() + "','" + gm.getPackaging_type() + "','" + gm.getContainerNum() + "','" + gm.getAttach_doc() + "','" +
				gm.getTag_note() + "','" + gm.getMonetary() + "','" + gm.getManufacturer() + "','" + gm.getPostcode_apply() + "','" + gm.getPhoneNum_apply() + "','" + gm.getDeclaration_form_date() + "','" + gm.getFree_tax() + "','" + gm.getDraft_date() + "')";
		try {
			stmt.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insertGoodsInfo(GoodsInfo gi){
		sql = "insert into goods_info(itemNum,marks_Numbers,hSCode,description,quantities,unit_price,amount,package,GWORNW,means,allinfo_ID) values('" + gi.getItemNum() + "','" + gi.getMarks_Numbers() + "','" + gi.gethSCode() + "','" + gi.getDescription() + "','" + gi.getQuantities() + "','" + gi.getUnit_price() + "','" + gi.getAmount() + "','" + gi.get_package() + "','" + gi.getGWORNW() + "','" + gi.getMeans() + "','" + gi.getAllinfo_ID() + "')";
		try {
			stmt.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateInfo(GeneralMessage gm, String this_time){
		sql = "update all_info set ID='" + gm.getThis_time() + "',buyerName_zh_CN='" + gm.getBuyerName_zh_CN() + "',buyerName_en='" + gm.getBuyerName_en() + "',buyerAddress='" + gm.getBuyerAddress() + "',buyerFax='" +
				gm.getBuyerFax() + "',sellerName_zh_CN='" + gm.getSellerName_zh_CN() + "',sellerName_en='" + gm.getSellerName_en() + "',sellerAddress='" + gm.getSellerAddress() + "',sellerFax='" + gm.getSellerFax() + "',invoiceNum='" + 
				gm.getInvoiceNum() + "',invoiceDate='" + gm.getInvoiceDate() + "',scNum='" + gm.getScNum() + "',lcNum='" + gm.getLcNum() + "',signDate='" + gm.getSignDate() + "',route_mean='" + gm.getRoute_mean() + "',shipping_advice_time='" + 
				gm.getShipping_advice_time() + "',blNum='" + gm.getBlNum() + "',vesselName='" + gm.getVesselName() + "',etd='" + gm.getEtd() + "',eta='" + gm.getEta() + "',data_benefitor_creitify='" + gm.getDate_benefitor_creitify() + "',place_benefitor_creitify='" + 
				gm.getPlace_benefitor_creitify() + "',content_benefitor_creitify='" + gm.getContent_benefitor_creitify() + "',bank_import='" + gm.getBank_import() + "',bank_export='" + gm.getBank_export() + "',amount_invoice='" + gm.getAmount_invoice() + "',deadline_payment='" + 
				gm.getDeadline_payment() + "',consignee='" + gm.getConsignee() + "',notify='" + gm.getNotify() + "',pre_carriage='" + gm.getPre_carriage() + "',receipt_place='" + gm.getReceipt_place() + "',delivery_place='" + gm.getDelivery_place() + "',transshipment_contact='" +
				gm.getTransshipment_contact() + "',loading_port='" + gm.getLoading_port() + "',unload_port='" + gm.getUnload_port() + "',transit_port='" + gm.getTransit_port() + "',freight='" + gm.getFreight() + "',prepaid_place='" + gm.getPrepaid_place() + "',freight_payable_place='" + 
				gm.getFreight_payable_place() + "',bl_original_num='" + gm.getBl_original_num() + "',sign_bl='" + gm.getSign_bl() + "',bl_date='" + gm.getBl_date() + "',bl_place='" + gm.getBl_place() + "',insurance_type='" + gm.getInsurance_type() + "',insurance_policy_date='" + 
				gm.getInsurance_policy_date() + "',applicant='" + gm.getApplicant() + "',address_applicant='" + gm.getAddress_applicant() + "',excess='" + gm.getExcess() + "',sailing_date='" + gm.getSailing_date() + "',fax_applicant='" + gm.getFax_applicant() + "',phoneNum_applicant='" + 
				gm.getPhoneNum_applicant() + "',indemnity_place='" + gm.getIndemnity_place() + "',origin_criterion='" + gm.getOrigin_criterion() + "',origin_certificate_Num='" + gm.getOrigin_certificate_Num() + "',origin_certificate_Num_refer='" + gm.getOrigin_certificate_Num_refer() + "',packing_date='" + 
				gm.getPacking_date() + "',amount_package_en='" + gm.getAmount_package_en() + "',goods_name_zh_CN='" + gm.getGoods_name_zh_CN() + "',goods_name_en='" + gm.getGoods_name_en() + "',produce_area='" + gm.getProduce_area() + "',amount_weight='" + gm.getAmount_weight() + "',packaging_type_count='" + 
				gm.getPackaging_type_count() + "',produce_country='" + gm.getProduce_country() + "',gross_weight='" + gm.getGross_weight() + "',net_weight='" + gm.getNet_weight() + "',trade_way='" + gm.getTrade_way() + "',store_place='" + gm.getStore_place() + "',purpose='" + 
				gm.getPurpose() + "',shipment_date='" + gm.getShipment_date() + "',test_unit='" + gm.getTest_unit() + "',to_country_zh_cn='" + gm.getTo_country_zh_cn() + "',to_country_en='" + gm.getTo_country_en() + "',licenceNum='" + gm.getLicenceNum() + "',start_place='" + gm.getStart_place() + "',reach_port='" + 
				gm.getReach_port() + "',manufacture_register_no='" +  gm.getManufacture_register_no() + "',container_amount='" + gm.getContainer_amount() + "',special_request='" + gm.getSpecial_request() + "',export_port='" + gm.getExport_port() + "',declaration_form_recordNum='" + gm.getDeclaration_form_recordNum() + "',export_date='" + 
				gm.getExport_date() + "',apply_date='" + gm.getApply_date() + "',delivery_unit='" + gm.getDelivery_unit() + "',transport_way_zh_cn='" + gm.getTransport_way_zh_cn() + "',transport_way_en='" + gm.getTransport_way_en() + "',duty_free_properties='" + gm.getDuty_free_properties() + "',settlement_way='" + 
				gm.getSettlement_way() + "',reach_country='" + gm.getReach_country() + "',supply_goods_place='" + gm.getSupply_goods_place() + "',approval_number='" + gm.getApproval_number() + "',deal_way='" + gm.getDeal_way() + "',freight_='" + gm.getFreight_() + "',premium='" + gm.getPremium() + "',insurance_amount_num='" +
				gm.getInsurance_amount_num() + "',insurance_amount_en='" + gm.getInsurance_amount_en() + "',trivial_fee='" + gm.getTrivial_fee() + "',amount='" + gm.getAmount() + "',packaging_type='" + gm.getPackaging_type() + "',containerNum='" + gm.getContainerNum() + "',attach_doc='" + gm.getAttach_doc() + "',tag_note='" +
				gm.getTag_note() + "',monetary='" + gm.getMonetary() + "',manufacturer='" + gm.getManufacturer() + "',postcode_apply='" + gm.getPostcode_apply() + "',PhoneNum_apply='" + gm.getPhoneNum_apply() + "',declaration_form_date='" + gm.getDeclaration_form_date() + "',free_tax='" + gm.getFree_tax() + "',draft_date='" + gm.getDraft_date() + "where ID='" + this_time + "'";
		try {
			stmt.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateGoodsInfo(GoodsInfo gi, String this_time){
		sql = "update goods_info set itemNum='" + gi.getItemNum() + "', marks_Numbers='" + gi.getMarks_Numbers() + "',hSCode='" + gi.gethSCode() + 
				"',description='" + gi.getDescription() + "',quantities='" + gi.getQuantities() + "',unit_price='" + gi.getUnit_price() + "',amount='" + 
				gi.getAmount() + "',_package='" + gi.get_package() + "',GWORNW='" + gi.getGWORNW() + "',means'" + gi.getMeans() + "' where allinfo_ID= '" + this_time + "'";
		try {
			stmt.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteGoodsInfo(String this_time){
		sql = "delete from goods_info where allinfo_ID='" + this_time + "'";
		try {
			stmt.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteAllInfo(String this_time){
		sql = "delete from all_info where ID='" + this_time + "'";
		try {
			stmt.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void close(){
		try {
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
