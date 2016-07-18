package com.java.visa.word;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.visa.entities.GeneralMessage;
import com.java.visa.entities.GoodsInfo;
import com.java.visa.utils.Constant;

public class ResultSetHandler {
	
	public GeneralMessage GMHandle(ResultSet rs){
		GeneralMessage gm = new GeneralMessage();
		try {
			if(rs != null){
				if(rs.first()){
					gm.setBuyerName_zh_CN(rs.getString(Constant.FEILD[1]));
					gm.setBuyerName_en(rs.getString(Constant.FEILD[2]));
					gm.setBuyerAddress(rs.getString(Constant.FEILD[3]));
					gm.setBuyerFax(rs.getString(Constant.FEILD[4]));
					gm.setSellerName_zh_CN(rs.getString(Constant.FEILD[5]));
					gm.setSellerName_en(rs.getString(Constant.FEILD[6]));
					gm.setSellerAddress(rs.getString(Constant.FEILD[7]));
					gm.setSellerFax(rs.getString(Constant.FEILD[8]));
					gm.setInvoiceNum(rs.getString(Constant.FEILD[9]));
					gm.setInvoiceDate(rs.getString(Constant.FEILD[10]));
					gm.setScNum(rs.getString(Constant.FEILD[11]));
					gm.setLcNum(rs.getString(Constant.FEILD[12]));
					gm.setSignDate(rs.getString(Constant.FEILD[13]));
					gm.setRoute_mean(rs.getString(Constant.FEILD[14]));
					gm.setShipping_advice_time(rs.getString(Constant.FEILD[15]));
					gm.setBlNum(rs.getString(Constant.FEILD[16]));
					gm.setVesselName(rs.getString(Constant.FEILD[17]));
					gm.setEtd(rs.getString(Constant.FEILD[18]));
					gm.setEta(rs.getString(Constant.FEILD[19]));
					gm.setDate_benefitor_creitify(rs.getString(Constant.FEILD[20]));
					gm.setPlace_benefitor_creitify(rs.getString(Constant.FEILD[21]));
					gm.setContent_benefitor_creitify(rs.getString(Constant.FEILD[22]));
					gm.setBank_import(rs.getString(Constant.FEILD[23]));
					gm.setBank_export(rs.getString(Constant.FEILD[24]));
					gm.setAmount_invoice(rs.getString(Constant.FEILD[25]));
					gm.setDeadline_payment(rs.getString(Constant.FEILD[26]));
					gm.setConsignee(rs.getString(Constant.FEILD[27]));
					gm.setNotify(rs.getString(Constant.FEILD[28]));
					gm.setPre_carriage(rs.getString(Constant.FEILD[29]));
					gm.setReceipt_place(rs.getString(Constant.FEILD[30]));
					gm.setDelivery_place(rs.getString(Constant.FEILD[31]));
					gm.setTransshipment_contact(rs.getString(Constant.FEILD[32]));
					gm.setLoading_port(rs.getString(Constant.FEILD[33]));
					gm.setUnload_port(rs.getString(Constant.FEILD[34]));
					gm.setTransit_port(rs.getString(Constant.FEILD[35]));
					gm.setFreight(rs.getString(Constant.FEILD[36]));
					gm.setPrepaid_place(rs.getString(Constant.FEILD[37]));
					gm.setFreight_payable_place(rs.getString(Constant.FEILD[38]));
					gm.setBl_original_num(rs.getString(Constant.FEILD[39]));
					gm.setSign_bl(rs.getString(Constant.FEILD[40]));
					gm.setBl_date(rs.getString(Constant.FEILD[41]));
					gm.setBl_place(rs.getString(Constant.FEILD[42]));
					gm.setInsurance_type(rs.getString(Constant.FEILD[43]));
					gm.setInsurance_policy_date(rs.getString(Constant.FEILD[44]));
					gm.setApplicant(rs.getString(Constant.FEILD[45]));
					gm.setAddress_applicant(rs.getString(Constant.FEILD[46]));
					gm.setExcess(rs.getString(Constant.FEILD[47]));
					gm.setSailing_date(rs.getString(Constant.FEILD[48]));
					gm.setFax_applicant(rs.getString(Constant.FEILD[49]));
					gm.setPhoneNum_applicant(rs.getString(Constant.FEILD[50]));
					gm.setIndemnity_place(rs.getString(Constant.FEILD[51]));
					gm.setOrigin_criterion(rs.getString(Constant.FEILD[52]));
					gm.setOrigin_certificate_Num(rs.getString(Constant.FEILD[53]));
					gm.setOrigin_certificate_Num_refer(rs.getString(Constant.FEILD[54]));
					gm.setPacking_date(rs.getString(Constant.FEILD[55]));
					gm.setAmount_package_en(rs.getString(Constant.FEILD[56]));
					gm.setGoods_name_zh_CN(rs.getString(Constant.FEILD[57]));
					gm.setGoods_name_en(rs.getString(Constant.FEILD[58]));
					gm.setProduce_area(rs.getString(Constant.FEILD[59]));
					gm.setAmount_weight(rs.getString(Constant.FEILD[60]));
					gm.setPackaging_type_count(rs.getString(Constant.FEILD[61]));
					gm.setProduce_country(rs.getString(Constant.FEILD[62]));
					gm.setGross_weight(rs.getString(Constant.FEILD[63]));
					gm.setNet_weight(rs.getString(Constant.FEILD[64]));
					gm.setTrade_way(rs.getString(Constant.FEILD[65]));
					gm.setStore_place(rs.getString(Constant.FEILD[66]));
					gm.setPurpose(rs.getString(Constant.FEILD[67]));
					gm.setShipment_date(rs.getString(Constant.FEILD[68]));
					gm.setTest_unit(rs.getString(Constant.FEILD[69]));
					gm.setTo_country_zh_cn(rs.getString(Constant.FEILD[70]));
					gm.setTo_country_en(rs.getString(Constant.FEILD[71]));
					gm.setLicenceNum(rs.getString(Constant.FEILD[72]));
					gm.setStart_place(rs.getString(Constant.FEILD[73]));
					gm.setReach_port(rs.getString(Constant.FEILD[74]));
					gm.setManufacture_register_no(rs.getString(Constant.FEILD[75]));
					gm.setContainer_amount(rs.getString(Constant.FEILD[76]));
					gm.setSpecial_request(rs.getString(Constant.FEILD[77]));
					gm.setExport_port(rs.getString(Constant.FEILD[78]));
					gm.setDeclaration_form_recordNum(rs.getString(Constant.FEILD[79]));
					gm.setExport_date(rs.getString(Constant.FEILD[80]));
					gm.setApply_date(rs.getString(Constant.FEILD[81]));
					gm.setDelivery_unit(rs.getString(Constant.FEILD[82]));
					gm.setTransport_way_zh_cn(rs.getString(Constant.FEILD[83]));
					gm.setTransport_way_en(rs.getString(Constant.FEILD[84]));
					gm.setDuty_free_properties(rs.getString(Constant.FEILD[85]));
					gm.setSettlement_way(rs.getString(Constant.FEILD[86]));
					gm.setReach_country(rs.getString(Constant.FEILD[87]));
					gm.setSupply_goods_place(rs.getString(Constant.FEILD[88]));
					gm.setApproval_number(rs.getString(Constant.FEILD[89]));
					gm.setDeal_way(rs.getString(Constant.FEILD[90]));
					gm.setFreight_(rs.getString(Constant.FEILD[91]));
					gm.setPremium(rs.getString(Constant.FEILD[92]));
					gm.setInsurance_amount_num(rs.getString(Constant.FEILD[93]));
					gm.setInsurance_amount_en(rs.getString(Constant.FEILD[94]));
					gm.setTrivial_fee(rs.getString(Constant.FEILD[95]));
					gm.setAmount(rs.getString(Constant.FEILD[96]));
					gm.setPackaging_type(rs.getString(Constant.FEILD[97]));
					gm.setContainerNum(rs.getString(Constant.FEILD[98]));
					gm.setAttach_doc(rs.getString(Constant.FEILD[99]));
					gm.setTag_note(rs.getString(Constant.FEILD[100]));
					gm.setMonetary(rs.getString(Constant.FEILD[101]));
					gm.setManufacturer(rs.getString(Constant.FEILD[102]));
					gm.setPostcode_apply(rs.getString(Constant.FEILD[103]));
					gm.setPhoneNum_apply(rs.getString(Constant.FEILD[104]));
					gm.setDeclaration_form_date(rs.getString(Constant.FEILD[105]));
					gm.setFree_tax(rs.getString(Constant.FEILD[106]));
					gm.setDraft_date(rs.getString(Constant.FEILD[107]));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return gm;
	}
	
	public List<GoodsInfo> GIHandle(ResultSet rs){
		List<GoodsInfo> list = new ArrayList<GoodsInfo>();
		if(rs != null){
			try {
				while(rs.next()){
					GoodsInfo gi = new GoodsInfo();
					gi.setItemNum(rs.getString("itemNum"));
					gi.setMarks_Numbers(rs.getString("marks_Numbers"));
					gi.sethSCode(rs.getString("hSCode"));
					gi.setDescription(rs.getString("description"));
					gi.setQuantities(rs.getString("quantities"));
					gi.setUnit_price(rs.getString("unit_price"));
					gi.setAmount(rs.getString("amount"));
					gi.set_package(rs.getString("package"));
					gi.setGWORNW(rs.getString("GWORNW"));
					gi.setMeans(rs.getString("means"));
					list.add(gi);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
}
