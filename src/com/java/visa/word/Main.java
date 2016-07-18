package com.java.visa.word;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import com.java.visa.dbhelper.DBHelper;
import com.java.visa.entities.GeneralMessage;
import com.java.visa.entities.GoodsInfo;

public class Main extends JFrame{
	
	//定义表格模型对象
    private DefaultTableModel tableModel;
    //定义表格对象
    private JTable table;
    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;
    private JTextField tf4;
    private JTextField tf5;
    private JTextField tf6;
    private JTextField tf7;
    private JTextField tf8;
    private JTextField tf9;
    private JTextField tf10;
    private BufferedImage ico;
    private DBHelper mDBHelper;
    private List<GoodsInfo> list;
    
    JTextField jt1=new JTextField();
	JTextField jt2=new JTextField();
	JTextField jt3=new JTextField();
	JTextField jt4=new JTextField();
	JTextField jt5=new JTextField();
	JTextField jt6=new JTextField();
	JTextField jt7=new JTextField();
	JTextField jt8=new JTextField();
	JTextField jt9=new JTextField();
	JTextField jt10=new JTextField();
	JTextField jt11=new JTextField();
	JTextField jt12=new JTextField();
	JTextField jt13=new JTextField();
	JTextField jt14=new JTextField();
	JTextField jt15=new JTextField();
	JTextField jt16=new JTextField();
	JTextField jt17=new JTextField();
	JTextField jt18=new JTextField();
	JTextField jt19=new JTextField();
	JTextField jt20=new JTextField();
	JTextField jt21=new JTextField();
	JTextField jt22=new JTextField();
	JTextField jt23=new JTextField();
	JTextField jt24=new JTextField();
	JTextField jt25=new JTextField();
	JTextField jt26=new JTextField();
	JTextField jt27=new JTextField();
	JTextField jt28=new JTextField();
	JTextField jt29=new JTextField();
	JTextField jt30=new JTextField();
	JTextField jt31=new JTextField();
	JTextField jt32=new JTextField();
	JTextField jt33=new JTextField();
	JTextField jt34=new JTextField();
	JTextField jt35=new JTextField();
	JTextField jt36=new JTextField();
	JTextField jt37=new JTextField();
	JTextField jt38=new JTextField();
	JTextField jt39=new JTextField();
	JTextField jt40=new JTextField();
	JTextField jt41=new JTextField();
	JTextField jt42=new JTextField();
	JTextField jt43=new JTextField();
	JTextField jt44=new JTextField();
	JTextField jt45=new JTextField();
	JTextField jt46=new JTextField();
	JTextField jt47=new JTextField();
	JTextField jt48=new JTextField();
	JTextField jt49=new JTextField();
	JTextField jt50=new JTextField();
	JTextField jt51=new JTextField();
	JTextField jt52=new JTextField();
	JTextField jt53=new JTextField();
	JTextField jt54=new JTextField();
	JTextField jt55=new JTextField();
	JTextField jt56=new JTextField();
	JTextField jt57=new JTextField();
	JTextField jt58=new JTextField();
	JTextField jt59=new JTextField();
	JTextField jt60=new JTextField();
	JTextField jt61=new JTextField();
	JTextField jt62=new JTextField();
	JTextField jt63=new JTextField();
	JTextField jt64=new JTextField();
	JTextField jt65=new JTextField();
	JTextField jt66=new JTextField();
	JTextField jt67=new JTextField();
	JTextField jt68=new JTextField();
	JTextField jt69=new JTextField();
	JTextField jt70=new JTextField();
	JTextField jt71=new JTextField();
	JTextField jt72=new JTextField();
	JTextField jt73=new JTextField();
	JTextField jt74=new JTextField();
	JTextField jt75=new JTextField();
	JTextField jt76=new JTextField();
	JTextField jt77=new JTextField();
	JTextField jt78=new JTextField();
	JTextField jt79=new JTextField();
	JTextField jt80=new JTextField();
	JTextField jt81=new JTextField();
	JTextField jt82=new JTextField();
	JTextField jt83=new JTextField();
	JTextField jt84=new JTextField();
	JTextField jt85=new JTextField();
	JTextField jt86=new JTextField();
	JTextField jt87=new JTextField();
	JTextField jt88=new JTextField();
	JTextField jt89=new JTextField();
	JTextField jt90=new JTextField();
	JTextField jt91=new JTextField();
	JTextField jt92=new JTextField();
	JTextField jt93=new JTextField();
	JTextField jt94=new JTextField();
	JTextField jt95=new JTextField();
	JTextField jt96=new JTextField();
	JTextField jt97=new JTextField();
	JTextField jt98=new JTextField();
	JTextField jt99=new JTextField();
	JTextField jt100=new JTextField();
	
	JTextField jt101 = new JTextField();
    JTextField jt102 = new JTextField();
    JTextField jt103 = new JTextField();
    JTextField jt104 = new JTextField();
    JTextField jt105 = new JTextField();
    JTextField jt106 = new JTextField();
    
	public Main(){
		mDBHelper = new DBHelper();
		JPanel c = (JPanel)this.getContentPane();
		list = new ArrayList<GoodsInfo>();
		//创建主Panel
		JPanel pan=new JPanel();
		pan.setLayout(null);
		pan.setPreferredSize(new Dimension(850, 3350));
		//一次创建上中下Panel
		JPanel pan1=new JPanel();
		JPanel pan2=new JPanel();
		JPanel pan3=new JPanel();
		JPanel pan4=new JPanel();
		//设置7行2列的上方网格
		pan1.setLayout(new GridLayout(15,2,1,1));
		pan1.setBounds(10,0, 800, 400);
		//设置1行1列的中网格
		pan2.setLayout(new GridLayout(2,1,1,1));
		pan2.setBounds(10,3000,800,300);
		//设置下方网格
		pan3.setLayout(new GridLayout(100,2,1,1));
		pan3.setBounds(10,400, 800, 2600);
		//设置按钮panel
		pan4.setLayout(new GridLayout(1,1,1,1));
		pan4.setBounds(500, 3300, 300, 20);
		//创建JScrollPane
		JScrollPane sp=new JScrollPane(pan, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		JScrollPane scrollpane=new JScrollPane();
		pan2.add(scrollpane,BorderLayout.CENTER);
		//定义表格列名数组
		String[] columnNames={"Item NO.","Marks & numbers","H.S code","descriptions","quantities","unit price","amount","package","GW/NW（kgs）","means(cm)"};
		//创建表格模型
		tableModel=new DefaultTableModel(null,columnNames);
		table=new JTable(tableModel);
		//设置表格排序器
		table.setRowSorter(new TableRowSorter(tableModel));
		//设置表格的选择模式为单选
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		//为表格添加鼠标事件监听器
		table.addMouseListener(new MouseAdapter()
		{
			//发生点击事件
			public void mouseClicked(MouseEvent e)
			{
				int selectedRow=table.getSelectedRow();
				Object oa=tableModel.getValueAt(selectedRow, 0);
				Object ob=tableModel.getValueAt(selectedRow, 1);
				Object oc=tableModel.getValueAt(selectedRow, 2);
				Object od=tableModel.getValueAt(selectedRow, 3);
				Object oe=tableModel.getValueAt(selectedRow, 4);
				Object of=tableModel.getValueAt(selectedRow, 5);
				Object og=tableModel.getValueAt(selectedRow, 6);
				Object oh=tableModel.getValueAt(selectedRow, 7);
				Object oi=tableModel.getValueAt(selectedRow, 8);
				Object oj=tableModel.getValueAt(selectedRow, 9);
				tf1.setText(oa.toString());
				tf2.setText(ob.toString());
				tf3.setText(oc.toString());
				tf4.setText(od.toString());
				tf5.setText(oe.toString());
				tf6.setText(of.toString());
				tf7.setText(og.toString());		
				tf8.setText(oh.toString());
				tf9.setText(oi.toString());
				tf10.setText(oj.toString());
			}
		});
		scrollpane.setViewportView(table);
		JPanel panel=new JPanel(new GridLayout(1, 11, 1, 1));
		panel.setSize(800, 20);
		pan2.add(panel, BorderLayout.SOUTH);
//		panel.add(new JLabel("Item NO."));
		tf1=new JTextField();
		panel.add(tf1);
//		panel.add(new JLabel("Marks & numbers"));
		tf2=new JTextField();
		panel.add(tf2);
//		panel.add(new JLabel("H.S code"));
		tf3=new JTextField();
		panel.add(tf3);
//		panel.add(new JLabel("descriptions"));
		tf4=new JTextField();
		panel.add(tf4);
//		panel.add(new JLabel("quantities"));
		tf5=new JTextField();
		panel.add(tf5);
//		panel.add(new JLabel("unit price"));
		tf6=new JTextField();
		panel.add(tf6);
//		panel.add(new JLabel("amount "));
		tf7=new JTextField();
		panel.add(tf7);
//		panel.add(new JLabel("package"));
		tf8=new JTextField();
		panel.add(tf8);
//		panel.add(new JLabel("GW/NW（kgs） "));
		tf9=new JTextField();
		panel.add(tf9);
//		panel.add(new JLabel("means(cm)"));
		tf10=new JTextField();
		panel.add(tf10);
		
		JButton addButton=new JButton("添加");
		addButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String[] rowValues={tf1.getText(),tf2.getText(),tf3.getText(),tf4.getText(),tf5.getText(),tf6.getText(),tf7.getText(),tf8.getText(),tf9.getText(),tf10.getText(),};
			    tableModel.addRow(rowValues);
			    GoodsInfo gi = new GoodsInfo();
			    gi.setItemNum(tf1.getText());
			    gi.setMarks_Numbers(tf2.getText());
			    gi.sethSCode(tf3.getText());
			    gi.setDescription(tf4.getText());
			    gi.setQuantities(tf5.getText());
			    gi.setUnit_price(tf6.getText());
			    gi.setAmount(tf7.getText());
			    gi.set_package(tf8.getText());
			    gi.setGWORNW(tf9.getText());
			    gi.setMeans(tf10.getText());
			    list.add(gi);
			    tf1.setText("");
			    tf2.setText("");
			    tf3.setText("");
			    tf4.setText("");
			    tf5.setText("");
			    tf6.setText("");
			    tf7.setText("");
			    tf8.setText("");
			    tf9.setText("");
			    tf10.setText("");
			}
		});
		panel.add(addButton);
		
		//创建JButton
		JButton jb1=new JButton("生成");
		jb1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-DD-HH-mm-ss");
				String this_time = df.format(new Date());
				mDBHelper.connect();
				GeneralMessage gm = new GeneralMessage();
				gm.setBuyerName_zh_CN(jt1.getText());
				gm.setBuyerName_en(jt101.getText());
				gm.setBuyerAddress(jt2.getText());
				gm.setBuyerFax(jt3.getText());
				gm.setSellerName_zh_CN(jt4.getText());
				gm.setSellerName_en(jt102.getText());
				gm.setSellerAddress(jt5.getText());
				gm.setSellerFax(jt6.getText());
				gm.setInvoiceNum(jt7.getText());
				gm.setInvoiceDate(jt8.getText());
				gm.setScNum(jt9.getText());
				gm.setLcNum(jt10.getText());
				gm.setSignDate(jt11.getText());
				gm.setRoute_mean(jt12.getText());
				gm.setShipping_advice_time(jt13.getText());
				gm.setBlNum(jt14.getText());
				gm.setVesselName(jt15.getText());
				gm.setEtd(jt16.getText());
				gm.setEtd(jt17.getText());
				gm.setDate_benefitor_creitify(jt18.getText());
				gm.setPlace_benefitor_creitify(jt19.getText());
				gm.setContent_benefitor_creitify(jt20.getText());
				gm.setBank_import(jt21.getText());
				gm.setBank_export(jt22.getText());
				gm.setAmount_invoice(jt23.getText());
				gm.setDeadline_payment(jt24.getText());
				gm.setConsignee(jt25.getText());
				gm.setNotify(jt26.getText());
				gm.setPre_carriage(jt27.getText());
				gm.setReceipt_place(jt28.getText());
				gm.setDelivery_place(jt29.getText());
				gm.setTransshipment_contact(jt30.getText());
				gm.setLoading_port(jt31.getText());
				gm.setUnload_port(jt32.getText());
				gm.setTransit_port(jt33.getText());
				gm.setFreight(jt34.getText());
				gm.setPrepaid_place(jt35.getText());
				gm.setFreight_payable_place(jt36.getText());
				gm.setBl_original_num(jt37.getText());
				gm.setSign_bl(jt38.getText());
				gm.setBl_date(jt39.getText());
				gm.setBl_place(jt40.getText());
				gm.setInsurance_type(jt41.getText());
				gm.setInsurance_policy_date(jt42.getText());
				gm.setApplicant(jt43.getText());
				gm.setAddress_applicant(jt44.getText());
				gm.setExcess(jt45.getText());
				gm.setSailing_date(jt46.getText());
				gm.setPhoneNum_applicant(jt47.getText());
				gm.setIndemnity_place(jt48.getText());
				gm.setOrigin_criterion(jt49.getText());
				gm.setOrigin_certificate_Num(jt50.getText());
				gm.setOrigin_certificate_Num_refer(jt51.getText());
				gm.setPacking_date(jt52.getText());
				gm.setAmount_package_en(jt53.getText());
				gm.setGoods_name_zh_CN(jt54.getText());
				gm.setGoods_name_en(jt103.getText());
				gm.setProduce_area(jt55.getText());
				gm.setAmount_weight(jt56.getText());
				gm.setPackaging_type_count(jt57.getText());
				gm.setProduce_country(jt58.getText());
				gm.setGross_weight(jt59.getText());
				gm.setNet_weight(jt106.getText());
				gm.setTrade_way(jt60.getText());
				gm.setStore_place(jt61.getText());
				gm.setPurpose(jt62.getText());
				gm.setShipment_date(jt63.getText());
				gm.setTest_unit(jt64.getText());
				gm.setTo_country_zh_cn(jt65.getText());
				gm.setTo_country_en(jt104.getText());
				gm.setLicenceNum(jt66.getText());
				gm.setStart_place(jt67.getText());
				gm.setReach_port(jt68.getText());
				gm.setManufacture_register_no(jt69.getText());
				gm.setContainer_amount(jt70.getText());
				gm.setSpecial_request(jt71.getText());
				gm.setExport_port(jt72.getText());
				gm.setDeclaration_form_recordNum(jt73.getText());
				gm.setExport_date(jt74.getText());
				gm.setApply_date(jt75.getText());
				gm.setDelivery_unit(jt76.getText());
				gm.setTransport_way_zh_cn(jt77.getText());
				gm.setTransport_way_en(jt78.getText());
				gm.setDuty_free_properties(jt79.getText());
				gm.setSettlement_way(jt80.getText());
				gm.setReach_country(jt81.getText());
				gm.setSupply_goods_place(jt82.getText());
				gm.setApproval_number(jt83.getText());
				gm.setDeal_way(jt84.getText());
				gm.setFreight_(jt85.getText());
				gm.setPremium(jt86.getText());
				gm.setInsurance_amount_num(jt87.getText());
				gm.setInsurance_amount_en(jt105.getText());
				gm.setTrivial_fee(jt88.getText());
				gm.setAmount(jt89.getText());
				gm.setPackaging_type(jt90.getText());
				gm.setContainerNum(jt91.getText());
				gm.setAttach_doc(jt92.getText());
				gm.setTag_note(jt93.getText());
				gm.setMonetary(jt94.getText());
				gm.setManufacturer(jt95.getText());
				gm.setPostcode_apply(jt96.getText());
				gm.setPhoneNum_apply(jt97.getText());
				gm.setDeclaration_form_date(jt98.getText());
				gm.setFree_tax(jt99.getText());
				gm.setDraft_date(jt100.getText());
				gm.setThis_time(this_time);
				mDBHelper.insertInfo(gm);
				for(GoodsInfo gi:list){
					gi.setAllinfo_ID(this_time);
					mDBHelper.insertGoodsInfo(gi);
				}
				mDBHelper.close();
				list.clear();
				jt1.setText("");
				jt2.setText("");
				jt3.setText("");
				jt4.setText("");
				jt5.setText("");
				jt6.setText("");
				jt7.setText("");
				jt8.setText("");
				jt9.setText("");
				jt10.setText("");
				jt11.setText("");
				jt12.setText("");
				jt13.setText("");
				jt14.setText("");
				jt15.setText("");
				jt16.setText("");
				jt17.setText("");
				jt18.setText("");
				jt19.setText("");
				jt20.setText("");
				jt21.setText("");
				jt22.setText("");
				jt23.setText("");
				jt24.setText("");
				jt25.setText("");
				jt26.setText("");
				jt27.setText("");
				jt28.setText("");
				jt29.setText("");
				jt30.setText("");
				jt31.setText("");
				jt32.setText("");
				jt33.setText("");
				jt34.setText("");
				jt35.setText("");
				jt36.setText("");
				jt37.setText("");
				jt38.setText("");
				jt39.setText("");
				jt40.setText("");
				jt41.setText("");
				jt42.setText("");
				jt43.setText("");
				jt44.setText("");
				jt45.setText("");
				jt46.setText("");
				jt47.setText("");
				jt48.setText("");
				jt49.setText("");
				jt50.setText("");
				jt51.setText("");
				jt52.setText("");
				jt53.setText("");
				jt54.setText("");
				jt55.setText("");
				jt56.setText("");
				jt57.setText("");
				jt58.setText("");
				jt59.setText("");
				jt60.setText("");
				jt61.setText("");
				jt62.setText("");
				jt63.setText("");
				jt64.setText("");
				jt65.setText("");
				jt66.setText("");
				jt67.setText("");
				jt68.setText("");
				jt69.setText("");
				jt70.setText("");
				jt71.setText("");
				jt72.setText("");
				jt73.setText("");
				jt74.setText("");
				jt75.setText("");
				jt76.setText("");
				jt77.setText("");
				jt78.setText("");
				jt79.setText("");
				jt80.setText("");
				jt81.setText("");
				jt82.setText("");
				jt83.setText("");
				jt84.setText("");
				jt85.setText("");
				jt86.setText("");
				jt87.setText("");
				jt88.setText("");
				jt89.setText("");
				jt90.setText("");
				jt91.setText("");
				jt92.setText("");
				jt93.setText("");
				jt94.setText("");
				jt95.setText("");
				jt96.setText("");
				jt97.setText("");
				jt98.setText("");
				jt99.setText("");
				jt100.setText("");
				jt101.setText("");
				jt102.setText("");
				jt103.setText("");
				jt104.setText("");
				jt105.setText("");
				jt106.setText("");
				
				int x = tableModel.getRowCount();
				for(int i = 0; i < x; i++){
					tableModel.removeRow(0);
				}
				//生成Word文档
				BuildDoc builder = new BuildDoc(this_time);
				builder.test1();
				builder.test2();
				builder.test3();
				builder.test4();
				builder.test5();
				builder.test6();
				builder.test7();
				builder.test8();
				builder.test9();
				builder.test10();
				builder.test11();
				
				JOptionPane.showMessageDialog(Main.this, "文档生成成功并保存于" + System.getProperty("user.dir") + "文件夹下", "提示", 1);
			}
			
		});
		//JButton jb2=new JButton("打印");
		JButton jb3=new JButton("清空");
		jb3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				list.clear();
				jt1.setText("");
				jt2.setText("");
				jt3.setText("");
				jt4.setText("");
				jt5.setText("");
				jt6.setText("");
				jt7.setText("");
				jt8.setText("");
				jt9.setText("");
				jt10.setText("");
				jt11.setText("");
				jt12.setText("");
				jt13.setText("");
				jt14.setText("");
				jt15.setText("");
				jt16.setText("");
				jt17.setText("");
				jt18.setText("");
				jt19.setText("");
				jt20.setText("");
				jt21.setText("");
				jt22.setText("");
				jt23.setText("");
				jt24.setText("");
				jt25.setText("");
				jt26.setText("");
				jt27.setText("");
				jt28.setText("");
				jt29.setText("");
				jt30.setText("");
				jt31.setText("");
				jt32.setText("");
				jt33.setText("");
				jt34.setText("");
				jt35.setText("");
				jt36.setText("");
				jt37.setText("");
				jt38.setText("");
				jt39.setText("");
				jt40.setText("");
				jt41.setText("");
				jt42.setText("");
				jt43.setText("");
				jt44.setText("");
				jt45.setText("");
				jt46.setText("");
				jt47.setText("");
				jt48.setText("");
				jt49.setText("");
				jt50.setText("");
				jt51.setText("");
				jt52.setText("");
				jt53.setText("");
				jt54.setText("");
				jt55.setText("");
				jt56.setText("");
				jt57.setText("");
				jt58.setText("");
				jt59.setText("");
				jt60.setText("");
				jt61.setText("");
				jt62.setText("");
				jt63.setText("");
				jt64.setText("");
				jt65.setText("");
				jt66.setText("");
				jt67.setText("");
				jt68.setText("");
				jt69.setText("");
				jt70.setText("");
				jt71.setText("");
				jt72.setText("");
				jt73.setText("");
				jt74.setText("");
				jt75.setText("");
				jt76.setText("");
				jt77.setText("");
				jt78.setText("");
				jt79.setText("");
				jt80.setText("");
				jt81.setText("");
				jt82.setText("");
				jt83.setText("");
				jt84.setText("");
				jt85.setText("");
				jt86.setText("");
				jt87.setText("");
				jt88.setText("");
				jt89.setText("");
				jt90.setText("");
				jt91.setText("");
				jt92.setText("");
				jt93.setText("");
				jt94.setText("");
				jt95.setText("");
				jt96.setText("");
				jt97.setText("");
				jt98.setText("");
				jt99.setText("");
				jt100.setText("");
				jt101.setText("");
				jt102.setText("");
				jt103.setText("");
				jt104.setText("");
				jt105.setText("");
				jt106.setText("");
				
				int x = tableModel.getRowCount();
				for(int i = 0; i < x; i++){
					tableModel.removeRow(0);
				}
			}
			
		});
		
		//初始化上面板，设置1行2列的布局
		JPanel p0=new JPanel(new GridLayout(1,1,1,1));
		JPanel p1=new JPanel(new GridLayout(1,2,1,1));
		JPanel p2=new JPanel(new GridLayout(1,2,1,1));
		JPanel p3=new JPanel(new GridLayout(1,2,1,1));
		JPanel p4=new JPanel(new GridLayout(1,2,1,1));
		JPanel p5=new JPanel(new GridLayout(1,2,1,1));
		JPanel p6=new JPanel(new GridLayout(1,2,1,1));
		JPanel p7=new JPanel(new GridLayout(1,2,1,1));
		JPanel p8=new JPanel(new GridLayout(1,2,1,1));
		JPanel p9=new JPanel(new GridLayout(1,2,1,1));
		JPanel p10=new JPanel(new GridLayout(1,2,1,1));
		JPanel p11=new JPanel(new GridLayout(1,2,1,1));
		JPanel p12=new JPanel(new GridLayout(1,2,1,1));
		//初始化中面板
		
		//初始化下面板
		JPanel p13=new JPanel(new GridLayout(1,2,1,1));
		JPanel p14=new JPanel(new GridLayout(1,2,1,1));
		JPanel p15=new JPanel(new GridLayout(1,2,1,1));
		JPanel p16=new JPanel(new GridLayout(1,2,1,1));
		JPanel p17=new JPanel(new GridLayout(1,2,1,1));
		JPanel p18=new JPanel(new GridLayout(1,2,1,1));
		JPanel p19=new JPanel(new GridLayout(1,2,1,1));
		JPanel p20=new JPanel(new GridLayout(1,2,1,1));
		JPanel p21=new JPanel(new GridLayout(1,2,1,1));
		JPanel p22=new JPanel(new GridLayout(1,2,1,1));
		JPanel p23=new JPanel(new GridLayout(1,2,1,1));
		JPanel p24=new JPanel(new GridLayout(1,2,1,1));
		JPanel p25=new JPanel(new GridLayout(1,2,1,1));
		JPanel p26=new JPanel(new GridLayout(1,2,1,1));
		JPanel p27=new JPanel(new GridLayout(1,2,1,1));
		JPanel p28=new JPanel(new GridLayout(1,2,1,1));
		JPanel p29=new JPanel(new GridLayout(1,2,1,1));
		JPanel p30=new JPanel(new GridLayout(1,2,1,1));
		JPanel p31=new JPanel(new GridLayout(1,2,1,1));
		JPanel p32=new JPanel(new GridLayout(1,2,1,1));
		JPanel p33=new JPanel(new GridLayout(1,2,1,1));
		JPanel p34=new JPanel(new GridLayout(1,2,1,1));
		JPanel p35=new JPanel(new GridLayout(1,2,1,1));
		JPanel p36=new JPanel(new GridLayout(1,2,1,1));
		JPanel p37=new JPanel(new GridLayout(1,2,1,1));
		JPanel p38=new JPanel(new GridLayout(1,2,1,1));
		JPanel p39=new JPanel(new GridLayout(1,2,1,1));
		JPanel p40=new JPanel(new GridLayout(1,2,1,1));
		JPanel p41=new JPanel(new GridLayout(1,2,1,1));
		JPanel p42=new JPanel(new GridLayout(1,2,1,1));
		JPanel p43=new JPanel(new GridLayout(1,2,1,1));
		JPanel p44=new JPanel(new GridLayout(1,2,1,1));
		JPanel p45=new JPanel(new GridLayout(1,2,1,1));
		JPanel p46=new JPanel(new GridLayout(1,2,1,1));
		JPanel p47=new JPanel(new GridLayout(1,2,1,1));
		JPanel p48=new JPanel(new GridLayout(1,2,1,1));
		JPanel p49=new JPanel(new GridLayout(1,2,1,1));
		JPanel p50=new JPanel(new GridLayout(1,2,1,1));
		JPanel p51=new JPanel(new GridLayout(1,2,1,1));
		JPanel p52=new JPanel(new GridLayout(1,2,1,1));
		JPanel p53=new JPanel(new GridLayout(1,2,1,1));
		JPanel p54=new JPanel(new GridLayout(1,2,1,1));
		JPanel p55=new JPanel(new GridLayout(1,2,1,1));
		JPanel p56=new JPanel(new GridLayout(1,2,1,1));
		JPanel p57=new JPanel(new GridLayout(1,2,1,1));
		JPanel p58=new JPanel(new GridLayout(1,2,1,1));
		JPanel p59=new JPanel(new GridLayout(1,2,1,1));
		JPanel p60=new JPanel(new GridLayout(1,2,1,1));
		JPanel p61=new JPanel(new GridLayout(1,2,1,1));
		JPanel p62=new JPanel(new GridLayout(1,2,1,1));
		JPanel p63=new JPanel(new GridLayout(1,2,1,1));
		JPanel p64=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p65=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p66=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p67=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p68=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p69=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p70=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p71=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p72=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p73=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p74=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p75=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p76=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p77=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p78=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p79=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p80=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p81=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p82=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p83=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p84=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p85=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p86=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p87=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p88=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p89=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p90=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p91=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p92=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p93=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p94=new JPanel(new GridLayout(1,2,1,1));
		
		JPanel p95=new JPanel(new GridLayout(1,2,1,1));
		JPanel p96=new JPanel(new GridLayout(1,2,1,1));
		JPanel p97=new JPanel(new GridLayout(1,2,1,1));
		JPanel p98=new JPanel(new GridLayout(1,2,1,1));
		JPanel p99=new JPanel(new GridLayout(1,2,1,1));
		JPanel p100=new JPanel(new GridLayout(1,2,1,1));
		//创建JButton面板
        JPanel p101=new JPanel(new GridLayout(1,1,1,1));
        //JPanel p102=new JPanel(new GridLayout(1,1,1,1));
        JPanel p103=new JPanel(new GridLayout(1,1,1,1));
        
        JPanel p104=new JPanel(new GridLayout(1,2,1,1));
        JPanel p105=new JPanel(new GridLayout(1,2,1,1));
        JPanel p106=new JPanel(new GridLayout(1,2,1,1));
        JPanel p107=new JPanel(new GridLayout(1,2,1,1));
        JPanel p108=new JPanel(new GridLayout(1,2,1,1));
        JPanel p109=new JPanel(new GridLayout(1,2,1,1));
        
		//实例化上面板中的对象
		p0.add(new JLabel("------------------------------------------------------------------------------------综合信息单--------------------------------------------------------------------------------------------------"));
		p1.add(new JLabel("买方（The buyer）(中文)："));
		p1.add(jt1);
		p104.add(new JLabel("买方（The buyer）(英文)："));
		p104.add(jt101);
		p2.add(new JLabel("地址（address）: "));
		p2.add(jt2);
		p3.add(new JLabel("传真号码（Fax NO.）: "));
		p3.add(jt3);
		p4.add(new JLabel("卖方（The seller）（中文）: "));
		p4.add(jt4);
		p105.add(new JLabel("卖方（The seller）（英文）: "));
		p105.add(jt102);
		p5.add(new JLabel("地址（address）: "));
		p5.add(jt5);
		p6.add(new JLabel("传真号码（Fax NO.）: "));
		p6.add(jt6);
		p7.add(new JLabel("发票号码（Invoice No.）:  "));
		p7.add(jt7);
		p8.add(new JLabel("发票日期（Invoice date）: "));
		p8.add(jt8);
		p9.add(new JLabel("合同号（S/C No.）:"));
		p9.add(jt9);
		p10.add(new JLabel("信用证号（L/C No.）:  "));	
		p10.add(jt10);
		p11.add(new JLabel("开证日期（date）:  "));	
		p11.add(jt11);
		p12.add(new JLabel("运输路线与方式（meas of transport and route）："));
		p12.add(jt12);
		//实例化中面板中的对象
		
		//实例化下面板中的对象
		p13.add(new JLabel("装船通知时间（time of issuing shipping advice）:"));	
		p13.add(jt13);
		p14.add(new JLabel("提单号码（B/L No.）:"));	
		p14.add(jt14);
		p15.add(new JLabel("船名航次（vessel’s name）:"));	
		p15.add(jt15);
		p16.add(new JLabel("预计出发时间（ETD）:"));	
		p16.add(jt16);
		p17.add(new JLabel("预计到达时间（ETA）:"));	
		p17.add(jt17);
		p18.add(new JLabel("受益人证明开证时间（Date）:"));	
		p18.add(jt18);
		p19.add(new JLabel("受益人证明书开证地点（place）:"));	
		p19.add(jt19);
		p20.add(new JLabel("受益人证明的内容（We hereby certify that）:"));	
		p20.add(jt20);
		p21.add(new JLabel("进口地银行："));	
		p21.add(jt21);
		p22.add(new JLabel("出口地银行："));	
		p22.add(jt22);
		p23.add(new JLabel("发票金额（数字和英文描述）："));	
		p23.add(jt23);
		p24.add(new JLabel("付款期限（at sight）："));	
		p24.add(jt24);
		p25.add(new JLabel("收货人（consignee or order）:"));	
		p25.add(jt25);
		p26.add(new JLabel("通知人（notify party）:"));	
		p26.add(jt26);
		p27.add(new JLabel("前程运输（Pre-carriage by）:"));	
		p27.add(jt27);
		p28.add(new JLabel("收获地（Place of receipt）:"));	
		p28.add(jt28);
		p29.add(new JLabel("交货地点（Place of delivery）:"));	
		p29.add(jt29);
		p30.add(new JLabel("转运时联系人（Regarding transshipment information please contact）:"));	
		p30.add(jt30);
		p31.add(new JLabel("装运港（port of loading）："));	
		p31.add(jt31);
		p32.add(new JLabel("卸货港（port of discharges）:"));	
		p32.add(jt32);
		p33.add(new JLabel("中转港："));	
		p33.add(jt33);
		p34.add(new JLabel("运费与费用（freight and charges）:  "));	
		p34.add(jt34);
		p35.add(new JLabel("运费预付地（prepaid at）:"));	
		p35.add(jt35);
		p36.add(new JLabel("运费到付地（freight payable at）: "));	
		p36.add(jt36);
		p37.add(new JLabel("提单正本份数（number of original Bs/L）:"));	
		p37.add(jt37);
		p38.add(new JLabel("提单的签章（signed for or on behalf of the master as agent）:"));	
		p38.add(jt38);
		p39.add(new JLabel("提单签发日期，地点（place and date of issuing of B/L）:"));	
		p39.add(jt39);
		p40.add(new JLabel("承保险别（conditions）:"));	
		p40.add(jt40);
		p41.add(new JLabel("保险单签单日期（date）:"));	
		p41.add(jt41);
		p42.add(new JLabel("被保险人："));	
		p42.add(jt42);
		p43.add(new JLabel("被保险人地址："));	
		p43.add(jt43);
		p44.add(new JLabel("免赔额/率："));	
		p44.add(jt44);
		p45.add(new JLabel("开航日期："));	
		p45.add(jt45);
		p46.add(new JLabel("被保险人传真："));	
		p46.add(jt46);
		p47.add(new JLabel("被保险人电话："));	
		p47.add(jt47);
		p48.add(new JLabel("赔款偿付地点  :"));	
		p48.add(jt48);
		p49.add(new JLabel("原产地标准（ origin criterion(see notes overleaf) ）: "));	
		p49.add(jt49);
		p50.add(new JLabel("一般原产地证书号："));	
		p50.add(jt50);
		p51.add(new JLabel("普惠制原产地证书参考号："));	
		p51.add(jt51);
		p52.add(new JLabel("装箱单日期（date）: "));	
		p52.add(jt52);
		p53.add(new JLabel("包装总箱数的英文描述："));	
		p53.add(jt53);
		p54.add(new JLabel("货物名称（中文）："));
		p54.add(jt54);
		p106.add(new JLabel("货物名称（英文）："));
		p106.add(jt103);
		p55.add(new JLabel("产地："));	
		p55.add(jt55);
		p56.add(new JLabel("数/重量："));	
		p56.add(jt56);
		p57.add(new JLabel("包装种类及件数："));	
		p57.add(jt57);
		p58.add(new JLabel("产品生产国："));	
		p58.add(jt58);
		p59.add(new JLabel("毛重： "));	
		p59.add(jt59);
		p109.add(new JLabel("净重："));
		p109.add(jt106);
		p60.add(new JLabel("贸易方式："));	
		p60.add(jt60);
		p61.add(new JLabel("货物存放地点："));	
		p61.add(jt61);
		p62.add(new JLabel("用途："));	
		p62.add(jt62);
		p63.add(new JLabel("发货日期："));	
		p63.add(jt63);
		p64.add(new JLabel("报检单位："));	
		p64.add(jt64);
		p65.add(new JLabel("输往国家（地区）中文："));
		p65.add(jt65);
		p107.add(new JLabel("输往国家（地区）英文："));
		p107.add(jt104);
		p66.add(new JLabel("许可证/审批号："));	
		p66.add(jt66);
		p67.add(new JLabel("起运地："));	
		p67.add(jt67);
		p68.add(new JLabel("到达口岸："));	
		p68.add(jt68);
		p69.add(new JLabel("生产单位注册号："));	
		p69.add(jt69);
		p70.add(new JLabel("集装箱规格、数量及号码："));	
		p70.add(jt70);
		p71.add(new JLabel("合同、信用证订立的检验检疫条款或特殊要求："));	
		p71.add(jt71);
		p72.add(new JLabel("出口口岸："));	
		p72.add(jt72);
		p73.add(new JLabel("报关单备案号："));	
		p73.add(jt73);
		p74.add(new JLabel("出口日期："));	
		p74.add(jt74);
		p75.add(new JLabel("申报日期："));	
		p75.add(jt75);
		p76.add(new JLabel("发货单位："));	
		p76.add(jt76);
		p77.add(new JLabel("运输方式（中文）："));
		p77.add(jt77);
		p78.add(new JLabel("运输方式（英文）："));
		p78.add(jt78);
		p79.add(new JLabel("征免性质："));	
		p79.add(jt79);
		p80.add(new JLabel("结汇方式："));	
		p80.add(jt80);
		p81.add(new JLabel("运抵国："));	
		p81.add(jt81);
		p82.add(new JLabel("境内货源地："));	
		p82.add(jt82);
		p83.add(new JLabel("批准文号（核销单号）："));	
		p83.add(jt83);
		p84.add(new JLabel("成交方式："));	
		p84.add(jt84);
		p85.add(new JLabel("运费："));	
		p85.add(jt85);
		p86.add(new JLabel("保费："));	
		p86.add(jt86);
		p87.add(new JLabel("保险金额（数字）："));	
		p87.add(jt87);
		p108.add(new JLabel("保险金额（英文）："));
		p108.add(jt105);
		p88.add(new JLabel("杂费："));	
		p88.add(jt88);
		p89.add(new JLabel("件数："));	
		p89.add(jt89);
		p90.add(new JLabel("包装种类："));	
		p90.add(jt90);
		p91.add(new JLabel("集装箱号："));	
		p91.add(jt91);
		p92.add(new JLabel("随附单据："));	
		p92.add(jt92);
		p93.add(new JLabel("标记唛码及备注："));	
		p93.add(jt93);
		p94.add(new JLabel("币制："));	
		p94.add(jt94);
		p95.add(new JLabel("生产厂家："));	
		p95.add(jt95);
		p96.add(new JLabel("申报单位邮编："));	
		p96.add(jt96);
		p97.add(new JLabel("申报单位电话："));	
		p97.add(jt97);
		p98.add(new JLabel("报关单填制日期："));	
		p98.add(jt98);
		p99.add(new JLabel("征免："));	
		p99.add(jt99);
		p100.add(new JLabel("汇票出票日期："));	
		p100.add(jt100);
		
		//实例化JButton
		p101.add(jb1);
		//p102.add(jb2);
		p103.add(jb3);

		//在面板1中添加对象
		pan1.add(p0);
		pan1.add(p1);
		pan1.add(p104);
		pan1.add(p2);
		pan1.add(p3);
		pan1.add(p4);
		pan1.add(p105);
		pan1.add(p5);
		pan1.add(p6);
		pan1.add(p7);
		pan1.add(p8);
		pan1.add(p9);
		pan1.add(p10);
		pan1.add(p11);
		pan1.add(p12);
		//在面板2中添加对象
		
		//在面板3中添加对象
		pan3.add(p13);
		pan3.add(p14);
		pan3.add(p15);
		pan3.add(p16);
		pan3.add(p17);
		pan3.add(p18);
		pan3.add(p19);
		pan3.add(p20);
		pan3.add(p21);
		pan3.add(p22);
		pan3.add(p23);
		pan3.add(p24);
		pan3.add(p25);
		pan3.add(p26);
		pan3.add(p27);
		pan3.add(p28);
		pan3.add(p29);
		pan3.add(p30);
		pan3.add(p31);
		pan3.add(p32);
		pan3.add(p33);
		pan3.add(p34);
		pan3.add(p35);
		pan3.add(p36);
		pan3.add(p37);
		pan3.add(p38);
		pan3.add(p39);
		pan3.add(p40);
		pan3.add(p41);
		pan3.add(p42);
		pan3.add(p43);
		pan3.add(p44);
		pan3.add(p45);
		pan3.add(p46);
		pan3.add(p47);
		pan3.add(p48);
		pan3.add(p49);
		pan3.add(p50);
		pan3.add(p51);
		pan3.add(p52);
		pan3.add(p53);
		pan3.add(p54);
		pan3.add(p106);
		pan3.add(p55);
		pan3.add(p56);
		pan3.add(p57);
		pan3.add(p58);
		pan3.add(p59);
		pan3.add(p109);
		pan3.add(p60);
		pan3.add(p61);
		pan3.add(p62);
		pan3.add(p63);
		pan3.add(p64);
		pan3.add(p65);
		pan3.add(p107);
		pan3.add(p66);
		pan3.add(p67);
		pan3.add(p68);
		pan3.add(p69);
		pan3.add(p70);
		pan3.add(p71);
		pan3.add(p72);
		pan3.add(p73);
		pan3.add(p74);
		pan3.add(p75);
		pan3.add(p76);
		pan3.add(p77);
		pan3.add(p78);
		pan3.add(p79);
		pan3.add(p80);
		pan3.add(p81);
		pan3.add(p82);
		pan3.add(p83);
		pan3.add(p84);
		pan3.add(p85);
		pan3.add(p86);
		pan3.add(p87);
		pan3.add(p108);
		pan3.add(p88);
		pan3.add(p89);
		pan3.add(p90);
		pan3.add(p91);
		pan3.add(p92);
		pan3.add(p93);
		pan3.add(p94);
		pan3.add(p95);
		pan3.add(p96);
		pan3.add(p97);
		pan3.add(p98);
		pan3.add(p99);
		pan3.add(p100);	
		//添加对象到pan4
		pan4.add(p101);
		//pan4.add(p102);
		pan4.add(p103);

		//在主pan中添加子pan
		pan.add(pan1);
		pan.add(pan3);
		pan.add(pan2);
		pan.add(pan4);
		//将SCrollPanel添加到容器里面
		c.add(sp);
		
		//窗体设置
		try {
			ico = ImageIO.read(new File(System.getProperty("user.dir") + "/Img/ico.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		this.setIconImage(ico);
		this.setResizable(false);
		this.setSize(850,600);
		this.setTitle("Visa");
		this.setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setLocation((int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth() - this.getWidth())/2, 
				(int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight() - this.getHeight())/2);
	}
	
	public static void main(String[] args){
		new Main();
		//System.out.println(Constant.FEILD.length);
	}
}