package com.fretron.sap.onpremise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.rpc.ServiceException;

import org.json.JSONArray;
import org.json.JSONObject;

import mc_style.functions.soap.sap.document.sap_com.ZFM_shipment;
import mc_style.functions.soap.sap.document.sap_com.Zfm_shipment_serviceLocator;
import mc_style.functions.soap.sap.document.sap_com.Zshipment;
import mc_style.functions.soap.sap.document.sap_com.ZshipmentNoTable;
import mc_style.functions.soap.sap.document.sap_com.Zweb_getShipmentNoV2_ServiceLocator;
import mc_style.functions.soap.sap.document.sap_com.Zweb_getShipmentServiceLocator;
import mc_style.functions.soap.sap.document.sap_com.Zwebfm_shmtLocator;
import mc_style.functions.soap.sap.document.sap_com.holders.TableOfZshipmentHolder;
import mc_style.functions.soap.sap.document.sap_com.holders.TableOfZshipmentNoTableHolder;
import model.Shipment;

public class TimerHelper extends TimerTask {

	boolean isFirstTime = true;
	JSONArray finalArray;
	int limit = 5;
	String changeOn = "20190108";
	String changeTime = "160200";
	String startdate = "20181101";
	String shipmentno = "0";
	String shipmentFetchdate = startdate;
	String TOKEN = "eyJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1NDUzMTAzOTUsInVzZXJJZCI6ImQyNTUyNDE5LWY2N2EtNDAxOC1iNDBiLTA1NGZlN2E0OWZiMCIsImVtYWlsIjoiYWJoaXNoZWsuc0BmcmV0cm9uLmNvbSIsIm1vYmlsZU51bWJlciI6IjcwMTE5NzIxMjEiLCJvcmdJZCI6IjYyY2FiNGFiLWRjOGItNGEzYS1iNDRmLWY3YzE2YTk5OTEwOCIsIm5hbWUiOiJBYmhpc2hlayBTcml2YXN0YXZhIiwib3JnVHlwZSI6IkZMRUVUX09XTkVSIiwiaXNHb2QiOnRydWV9.4Pr2-xel5l_0vu7VqgTXofF2-aQfqf4NQCiQ1ZlrGz8";
	
	
	public TimerHelper() {
	
		String[] files=  {"lastSync.txt","token.txt"};
		validateFiles(files);
	}
	
	@Override
	public void run() {
		
		if (!validateToken(TOKEN)) {
			writeToFile("","lastSync.txt");
			writeToFile(TOKEN,"token.txt");
		}
		
		
		finalArray = new JSONArray();
		 Date dateObject = new Date();
		 Calendar calendar = Calendar.getInstance();
			calendar.setTime(dateObject);
		System.out.println("Sync start at ::"+dateObject.toString());
		int m = calendar.get(Calendar.MONTH)+1;
		String dd = "01";
		String mnt = "00";
		if (calendar.get(Calendar.DATE)<=9) {
			 dd = "0"+calendar.get(Calendar.DATE);
		}
		changeOn = calendar.get(Calendar.YEAR)+"0"+m+dd;
		System.out.println("change on created::"+changeOn);
		int minut = calendar.get(Calendar.MINUTE)-2;
		if (minut<=9) {
			
			mnt = "0"+minut ;
		}
		else {
			mnt =""+minut;
		}
		
		changeTime = calendar.get(Calendar.HOUR_OF_DAY)+mnt+"00";
		System.out.println("changeTime created::"+changeTime);
		String lastSync = readFile("lastSync.txt");
		fetchShipmentFromSap(lastSync);

	}
	
	
	private boolean validateToken(String token)
	{
		String savedToken =  readFile("token.txt");
		if (savedToken.equals(token)) {
			return true;	
		}
		return false;
		
	}
	
	
	private boolean validateFiles(String[] array)
	{
		for (String fi : array) {
			
			try {
				File file = new File(fi);
				 if (file.createNewFile()) {
					 
					 System.out.println(fi+" file created");
				}
				 else {
					System.out.println(fi+" file found");
				}
			} catch (Exception e) {
				System.out.println("Exception Occurs at validateFile"+e.getMessage());
				return false;
			}
		}
		return true;
	}

	private void writeToFile(String txt,String fileName) {

		try {
			BufferedWriter   writer = new BufferedWriter(new FileWriter(fileName));
			writer.write(txt);
			writer.newLine();
			writer.close();
		} catch (Exception e) {
			System.out.println("Exception Occurs to write lastsync::"+e.getMessage());
		}

	}
	

	private String readFile(String file) {
		try {
			FileReader reader = new FileReader(file);
			int character;
			String txt="";
			while ((character = reader.read()) != -1) {
				txt = txt + (char) character;
			}
			reader.close();
			return txt;

		}
		
		catch (Exception e) {
			System.out.println("Exception Occurs to read lastsync::"+e.getMessage());
			return null;
		}


	}

	private void fetchShipmentFromSap( String lastSync) {

		try {
			ZshipmentNoTable[] zNoTables,changelogTable =null;
			List<ZshipmentNoTable> tripShipmentList = null;

			TableOfZshipmentNoTableHolder itTable = new TableOfZshipmentNoTableHolder();
			TableOfZshipmentNoTableHolder itChangetable = new TableOfZshipmentNoTableHolder();

			Zweb_getShipmentNoV2_ServiceLocator shipmentno_serviceLocator = new Zweb_getShipmentNoV2_ServiceLocator();

			shipmentno_serviceLocator.getzweb_getShipmentNoV2().zfmShipmentno(changeOn, changeTime, shipmentFetchdate, itChangetable, itTable, limit, 1, shipmentno, startdate);
			zNoTables = itTable.value;
			changelogTable = itChangetable.value;
			
			if (changelogTable.length>0) {
				
				updateShipment(changelogTable);
				
			}
			else {
				System.out.println("ChangeLog table is empty");
			}

			if (zNoTables.length>0 ) {

				if (!lastSync.isEmpty()) {

					for (int i=0;i<zNoTables.length;i++) {
						ZshipmentNoTable  shipment = zNoTables[i];

						String spmtNo = shipment.getShipmentno();
						String date = shipment.getCreatedOn();
						

						if (lastSync.equals(spmtNo+"@"+date)) {

							List<ZshipmentNoTable> shipmentList =  Arrays.asList(zNoTables);
							tripShipmentList =  shipmentList.subList(i+1, zNoTables.length);
							break;
						}
						else {
							System.out.println("skip::"+spmtNo+"---"+date);
						}
					}
				}
				if (tripShipmentList ==null) {
					tripShipmentList   = Arrays.asList(zNoTables);
				}

				for (ZshipmentNoTable zshipmentNoTable : tripShipmentList) {

					System.out.println("sync shipment ::"+zshipmentNoTable.getShipmentno()+"--"+zshipmentNoTable.getCreatedOn());
					makeShipmentObject(zshipmentNoTable.getShipmentno());
					lastSync = zshipmentNoTable.getShipmentno()+"@"+zshipmentNoTable.getCreatedOn();
					String chnageOn = zshipmentNoTable.getShipmentno() +"@"+zshipmentNoTable.getChangeOn();
					writeToFile(lastSync,"lastSync.txt");
				}
				

				System.out.println("final response::"+finalArray.toString());
				//postRequest(finalArray);
				isFirstTime = false;
			}
			else {
				Logger.getGlobal().log(Level.INFO, "shipment no table is empty");
			}

		}
		catch (Exception e) {
			Logger.getGlobal().log(Level.WARNING, "Exception Occurs::"+e.getMessage());
		}

	}

	private void updateShipment(ZshipmentNoTable[] changelogTable) {
		
		for (ZshipmentNoTable zshipmentNoTable : changelogTable) {

			System.out.println("sync updated shipment ::"+zshipmentNoTable.getShipmentno()+"--"+zshipmentNoTable.getChangeOn());
			makeShipmentObject(zshipmentNoTable.getShipmentno());
		}
		System.out.println("final response::"+finalArray.toString());
		postRequest(finalArray);
	}

	public String postRequest(JSONArray responseObject) {

		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("http://apis.fretron.com/sh-sync/sync");
		Response response = webTarget.request(MediaType.APPLICATION_JSON).header("Content-Type", MediaType.APPLICATION_JSON).header("Authorization", "Bearer "+TOKEN).
				post(Entity.entity(responseObject.toString(), MediaType.APPLICATION_JSON));
		JSONObject responceObject = new JSONObject(response.readEntity(String.class));
		System.out.println(responceObject.toString());
		return responceObject.toString();

	}
	public String getFormatedDate(String strDate) {
		if(strDate.equals("0000-00-00")) {
			return "";
		}
		else {
			return strDate + " 00:00:00.0";
		}
	}

	public JSONArray makeShipmentObject(String shipmentNo)
	{
		Zshipment[] sZshipments = null;
		TableOfZshipmentHolder  itShipment = new TableOfZshipmentHolder();

		Zwebfm_shmtLocator shipmnetLocator = new Zwebfm_shmtLocator();

		try {

			shipmnetLocator.getzweb_fm_shmt().zfmShipmentService(itShipment, shipmentNo);
			sZshipments = itShipment.value;

			if (sZshipments.length>0) {

				for (Zshipment result : sZshipments) {



					JSONObject jObject  = new JSONObject();
					jObject.put("BillingCustomer",result.getBillingcustomer());
					jObject.put("BillingCustomerCity", result.getBillingcustomercity());
					jObject.put("ChallanBranchID",result.getChallanbranchid());
					jObject.put("ChallanBranch", "");
					jObject.put("ChallanDate",getFormatedDate(result.getZzlhd()));
					jObject.put("ChallanNo", result.getZzlhn());
					jObject.put("ChDept",result.getChdept());
					jObject.put("ChDest",result.getChdest());
					jObject.put("ShipmentType", result.getShipmenttype());
					jObject.put("CnBranch","");
					jObject.put("ConsignorID","");
					jObject.put("CNDate",getFormatedDate(result.getCndate()));
					jObject.put("CnDept",result.getCndept());
					jObject.put("CnDest",result.getCndest());
					jObject.put("CustomerPSN", result.getZzpsnc());
					jObject.put("CNNo",result.getZzcnn());
					jObject.put("ConsigneeCity",result.getConsigneecity());
					jObject.put("ConsigneeName",result.getConsigneename());
					jObject.put("ConsignorCity",result.getConsignorcity());
					jObject.put("ConsignorName",result.getConsignorname());
					jObject.put("ContainerNo",result.getZd0029());
					jObject.put("CustomerID", "");
					jObject.put("ConsigneeID", "");
					jObject.put("CustomerName", result.getCustomername());
					jObject.put("CustomerCity", result.getCustomercity());
					jObject.put("DeiveryNo",result.getDeliveryno());
					jObject.put("DriverMobNo1",result.getDrivermobno1());
					jObject.put("DriverMobNo2",result.getDrivermobno2());
					jObject.put("DriverMobNo3",result.getDrivermobno3());
					jObject.put("DriverName",result.getDrivername());
					jObject.put("EwayBillNo",result.getEwaybillno());
					jObject.put("EWayExpiryDate",getFormatedDate(result.getEwayexpirydate()));
					jObject.put("EwayRegDate",getFormatedDate(result.getEwayregdate()));
					jObject.put("FleetType",result.getFleettype());
					jObject.put("FWDAgentName",result.getFwdagentname());
					jObject.put("GrosstWT",""+result.getGrosstwt());
					jObject.put("IMEI",result.getZimei());
					jObject.put("LastLocation",result.getLastlocation());
					jObject.put("MaterialName",result.getMaterialname());
					jObject.put("NetWt",""+result.getNetwt());
					jObject.put("OwnerAddress",result.getOwneradress1()+result.getOwneradress2()+result.getOwneradress3());
					jObject.put("OwnerCity",result.getOwnCity());
					jObject.put("OwnerID",result.getOwnerid());
					jObject.put("OwnerName",result.getOwnName());
					jObject.put("OwnerNo1",result.getZomob2());
					jObject.put("OwnerNo2",result.getText3());
					jObject.put("PartySalesInvice",result.getPartysaleinvoiceno());
					jObject.put("ShipmentEDD",getFormatedDate(result.getShipmentedd()));
					jObject.put("ShipmentEndDate",getFormatedDate(result.getShipmentenddate()));
					jObject.put("ShipmentNo",result.getTknum());
					jObject.put("CnBranchID","000000"+result.getChallanbranchid());
					jObject.put("TrackingDate",getFormatedDate(result.getTrackingdate()));
					jObject.put("TrainTripNo",result.getZtrpNo());
					jObject.put("UOM",result.getUom());
					jObject.put("VehicleNo",result.getVehicleno());
					jObject.put("SalesOrderNo", result.getSalesorderno());
					jObject.put("EwayAllowedDays", "");
					jObject.put("TPTMode", result.getTptmode());
					jObject.put("NoofPkgs", ""+result.getZd0030());
					jObject.put("BillingCustID","");
					jObject.put("Volume", ""+result.getVolum());
					jObject.put("TypeofPkgs", "");
					jObject.put("FWDAgentID", "");
					jObject.put("Party Sale Invoice No", result.getPartysaleinvoiceno());
					jObject.put("ValueOfGoods", "");
					jObject.put("DarclPSN", result.getZzpsnd());
					finalArray.put(jObject);
				}
				return finalArray;
			}
			return null;

		} catch (Exception e) {
			System.out.println("Exception Occurs in create Shipment Object::"+e.getMessage());
			return null;
		}
	}
}
