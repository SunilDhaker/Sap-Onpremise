package com.fretron.sap.onpremise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.logging.Logger;

import javax.enterprise.inject.New;
import javax.json.JsonArray;
import javax.naming.LimitExceededException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.apache.commons.logging.Log;
import org.json.JSONArray;
import org.json.JSONObject;

import mc_style.functions.soap.sap.document.sap_com.ZWEB_BP_SERVICELocator;
import mc_style.functions.soap.sap.document.sap_com.ZcustomerResult;
import mc_style.functions.soap.sap.document.sap_com.Zfm_shipment_serviceLocator;
import mc_style.functions.soap.sap.document.sap_com.ZshipmentNoTable;
import mc_style.functions.soap.sap.document.sap_com.ZvendorResult;
import mc_style.functions.soap.sap.document.sap_com.holders.TableOfZcustomerResultHolder;
import mc_style.functions.soap.sap.document.sap_com.holders.TableOfZshipmentNoTableHolder;
import mc_style.functions.soap.sap.document.sap_com.holders.TableOfZvendorResultHolder;
import model.BusinessPartner;
import model.Contacts;
import model.NewBusinessPartner;
import model.Shipment;


@Path("/sync")
public class Resource {
	boolean isFirstTime = true;
	JSONArray jsonArray = new JSONArray();

	ArrayList<NewBusinessPartner> businessPartners = new ArrayList<>();
	String URI = "http://apis.fretron.com/business-partners/v1/partners";
//	String URI = "http://192.168.0.153/business-partners/v1/partners";
	String TOKEN ;
	int limit ;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt() {
		return "Got it!";
	}    



	@Path("/business-partner")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String syncBusinessPartner(@QueryParam("token") String token,@QueryParam("limit") int limit) {
		TOKEN = token;
		this.limit = limit;
		System.out.println("limit::"+limit+" token:: "+token);
		JSONObject response =null;
		ZcustomerResult[] customer=null;
		ZvendorResult[] vendor = null;
		
		if (token==null) {
			response = new JSONObject();
			response.put("status", 400);
			response.put("error", "token is not provide");
			return response.toString();
		}
		 
		try {
			
			ZWEB_BP_SERVICELocator locator = new ZWEB_BP_SERVICELocator();
			TableOfZcustomerResultHolder cZcustomerResult = new TableOfZcustomerResultHolder();
			TableOfZvendorResultHolder vZvendorResult =new TableOfZvendorResultHolder();
			locator.getzweb_business_partner_service().zfmBusinessPartnerService(cZcustomerResult, vZvendorResult);
			customer =cZcustomerResult.value; 
			vendor=vZvendorResult.value;
			
			if (vendor.length>0 ) {
				addVendor(vendor);
				}
			if (customer.length>0 ) {
				addCustomer(customer);
			}

		} catch (Exception e) {
			response= new JSONObject();
			e.printStackTrace();
			response.put("status",500 );
			response.put("error","Synchronization failed !" );
			return response.toString();
		}

//		response = new JSONObject();
//		response.put("status", 200);
//		response.put("data", businessPartners);
		System.out.println("size of vendor "+vendor.length);
		System.out.println("size of customer "+customer.length);
		return postRequest(jsonArray.toString());

	}


	public void addVendor(ZvendorResult[] vendor)
	{
		int datalimit =1;
		int internallimit = limit;
		if ( internallimit ==0) {
			internallimit = vendor.length;
		} 
		
		NewBusinessPartner businessPartner=null;
		for(ZvendorResult bp:vendor)
		{
			if (datalimit <= internallimit) {
				businessPartner = new NewBusinessPartner();
				Contacts contacts = new Contacts();
				contacts.setAddress(bp.getStreet()+" "+bp.getStrSuppl1()+" "+bp.getStrSuppl2()+" "+bp.getStrSuppl3());
				contacts.setEmails(Arrays.asList(bp.getSmtpAddr()));
				contacts.setMobileNumber(bp.getTelf1());
				businessPartner.setContacts(Arrays.asList(contacts));
				businessPartner.setUuid(bp.getLifnr());
				businessPartner.setType("customer");
				businessPartner.setName(bp.getName1());
				businessPartners.add(businessPartner);	
				jsonArray.put(new JSONObject(businessPartner));
				datalimit++;
			}
			else {
				break;
			}
			
		}
		
		
//		
//		BusinessPartner businessPartner=null;
//
//		for(ZvendorResult bp:vendor)
//		{
//			businessPartner = new BusinessPartner();
//
//			businessPartner.setUuid(bp.getLifnr());
//			businessPartner.setAddress(bp.getStreet()+" "+bp.getStrSuppl1()+" "+bp.getStrSuppl2()+" "+bp.getStrSuppl3());
//			businessPartner.setEmailId(bp.getSmtpAddr());
//			businessPartner.setMobileNo(bp.getTelf1());
//			businessPartner.setPartnerName(bp.getName1());
//			businessPartner.setZip(bp.getPostCode1());
//			businessPartner.setType("vendor");
//			businessPartner.setState(bp.getBezei());
//
//			businessPartners.add(businessPartner);
//		}
//
	}

	public void addCustomer(ZcustomerResult[] customer)
	{
		int datalimit =1;
		int internallimit = limit;
		if ( internallimit ==0) {
			internallimit = customer.length;
		} 
//		BusinessPartner businessPartner=null;
//		for(ZcustomerResult bp:customer)
//		{
//			businessPartner = new BusinessPartner();
//
//			businessPartner.setUuid(bp.getKunnr());
//			businessPartner.setAddress(bp.getStreet()+" "+bp.getStrSuppl1()+" "+bp.getStrSuppl2()+" "+bp.getStrSuppl3());
//			businessPartner.setEmailId(bp.getSmtpAddr());
//			businessPartner.setMobileNo(bp.getTelf1());
//			businessPartner.setPartnerName(bp.getName1());
//			businessPartner.setZip(bp.getPostCode1());
//			businessPartner.setType("customer");
//			businessPartner.setState(bp.getBezei());
//
//			businessPartners.add(businessPartner);
//
//		}
//
//
//	}
		
		NewBusinessPartner businessPartner=null;
		
		for(ZcustomerResult bp:customer)
		{
			if (datalimit<=internallimit) {
				
				businessPartner = new NewBusinessPartner();
				Contacts contacts = new Contacts();
				contacts.setAddress(bp.getStreet()+" "+bp.getStrSuppl1()+" "+bp.getStrSuppl2()+" "+bp.getStrSuppl3());
				contacts.setEmails(Arrays.asList(bp.getSmtpAddr()));
				contacts.setMobileNumber(bp.getTelf1());
				businessPartner.setContacts(Arrays.asList(contacts));
				businessPartner.setUuid(bp.getKunnr());
				businessPartner.setType("customer");
				businessPartner.setName(bp.getName1());
				businessPartners.add(businessPartner);
				jsonArray.put(new JSONObject(businessPartner));
				datalimit++;
			}
			else {
				break;
			}
		
		}
	}
	
	public String postRequest(String requestObject) {

		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target(URI);
		Response response = webTarget.request(MediaType.APPLICATION_JSON).header("Content-Type", MediaType.APPLICATION_JSON).header("Authorization", "Bearer "+TOKEN).
		post(Entity.entity(requestObject, MediaType.APPLICATION_JSON));
		JSONObject responceObject = new JSONObject(response.readEntity(String.class));
		System.out.println(responceObject.toString());
		return responceObject.toString();
		
	}
	
	public JSONObject getRequest(String url) {

		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target(url);
		Response response = webTarget.request(MediaType.APPLICATION_JSON).
		get();
		JSONObject responceObject = new JSONObject(response.readEntity(String.class));
		System.out.println(responceObject.toString());
		return responceObject;
		
	}
	
	
	
//	@Path("/sipment")
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_JSON)
//	public String syncShipmentPartner() {
//
////		JSONObject response =null;
////		Zshipment[] sZshipments = null;
////		 
////		try {
////			Zweb_shipment_serviceLocator shipment_serviceLocator = new Zweb_shipment_serviceLocator();
////			
////			sZshipments = shipment_serviceLocator.getZweb_shipment_service().zfmShipmentService(sZshipments);
////			
////			if (sZshipments.length>0 ) {
////				response= new JSONObject();
////				response.put("data",addShipment(sZshipments) );
////				response.put("status", 200);
////				return  response.toString();
////				}
////		} catch (Exception e) {
////			response= new JSONObject();
////			e.printStackTrace();
////			response.put("status",500 );
////			response.put("error","Synchronization failed !" );
////			return response.toString();
////		}
////		response= new JSONObject();
////		response.put("status",500 );
////		response.put("error","Synchronization failed !" );
////		return response.toString();
////
//	}
//	
//	
	@Path("/sipmentNo")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String syncShipmentNo(@QueryParam("limit") int datalimit) {

		JSONObject response =null;
		ZshipmentNoTable[] zNoTables =null;
		
		TableOfZshipmentNoTableHolder itTable = new TableOfZshipmentNoTableHolder();
		 
		try {

			Zfm_shipment_serviceLocator  shipmentno_serviceLocator = new Zfm_shipment_serviceLocator();
			
			shipmentno_serviceLocator.getZfm_shipment_service_abap().zfmShipmentnoService(itTable, datalimit);
			zNoTables = itTable.value;
			
			if (zNoTables.length>0 ) {
				response= new JSONObject();
				response.put("data",addShipmentNo(zNoTables).toString() );
				response.put("status", 200);
				return  response.toString();
				}
		} catch (Exception e) {
			response= new JSONObject();
			e.printStackTrace();
			response.put("status",500 );
			response.put("error","Synchronization failed !" );
			return response.toString();
		}
		response= new JSONObject();
		response.put("status",500 );
		response.put("error","Synchronization failed !" );
		return response.toString();

	}
	
	

	private JSONArray addShipmentNo(ZshipmentNoTable[] zNoTables) {
		JSONArray arrayList = new JSONArray();
		
	
		for (ZshipmentNoTable zshipmentNoTable : zNoTables) {
			
			arrayList.put(zshipmentNoTable.getShipmentno());
			arrayList.put(zshipmentNoTable.getCreatedOn());
			
		}
		return arrayList;
	}



	@Path("/remove")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String removeValueFromJson(String data)
	{
		
		JSONObject jsonObject = new JSONObject(data);
		System.out.println(jsonObject.toString());
		Set<String> keys = 	jsonObject.keySet();
		for (String string : keys) {
			System.out.println("private String "+string+" ;");
		}
		
		return jsonObject.toString();
		
		
	}
	
	@Path("/syncFromDarcl")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String syncLsmDarcl()
	{
	JSONObject 	jsonObject = getRequest("http://apps.darcl.com:9010/LSM/Service?actkey=9&proc=SAP_ShipmentDetail_Frt&clnt=800&params=1128605409");
	
		return jsonObject.getJSONArray("details").toString();
		
	}
}


//	private JSONArray addShipment(Zshipment[] sZshipments) {
//		
//		JSONArray finalArray = new JSONArray();
//		String oldShipmentNo ="",newShipmentNo = "";
//		JSONArray jsonArray = null ;
//		JSONObject finalObject = null;
//		
//		for (Zshipment result: sZshipments) {
//			newShipmentNo = result.getShipmentno();
//			if (isFirstTime) {
//				finalObject = new JSONObject();
//				jsonArray = new JSONArray();
//				oldShipmentNo = result.getShipmentno();
//				isFirstTime = false;
//			}
//			
//			if (oldShipmentNo.equals(newShipmentNo)) {
//				
//				finalObject.put("SipmentNo",result.getShipmentno());
//			}
//			else {
//				 finalObject.put("data", jsonArray);
//				 finalArray.put(finalObject);
//				jsonArray = new JSONArray();
//				 finalObject = new JSONObject();
//				 finalObject.put("SipmentNo",result.getShipmentno());
//				 oldShipmentNo = result.getShipmentno();
//				
//			}
//			
//			
//			Shipment shipment = new Shipment();
//			shipment.setBillingCustomer(result.getBillingcustomer());
//			shipment.setBillingCustomerCity(result.getBillingcustomercity());
//			shipment.setChallanBranchID(result.getChallanbranchid());
//			shipment.setChallanDate(result.getChallandate());
//			shipment.setChallanNo(result.getChallanno());
//			shipment.setChDept(result.getChdept());
//			shipment.setChDest(result.getChdest());
//			shipment.setCnBranch(null);
//			shipment.setCNDate(result.getCndate());
//			shipment.setCnDept(result.getCndept());
//			shipment.setCnDest(result.getCndest());
//			shipment.setCNNo(result.getCnno());
//			shipment.setConsigneeCity(result.getConsigneecity());
//			shipment.setConsigneeName(result.getConsigneename());
//			shipment.setConsignorCity(result.getConsignorcity());
//			shipment.setConsignorName(result.getConsignorname());
//			shipment.setContainerNo("");
//			shipment.setDeiveryNo(result.getDeiveryno());
//			shipment.setDriverMobNo1(result.getDrivermobno1());
//			shipment.setDriverMobNo2(result.getDrivermobno2());
//			shipment.setDriverMobNo3(result.getDrivermobno3());
//			shipment.setDriverName(result.getDrivername());
//			shipment.setEwayBillNo("");
//			shipment.setEWayExpiryDate("");
//			shipment.setEwayRegDate("");
//			shipment.setFleetType(result.getFleettype());
//			shipment.setFWDAgentName(result.getFwdagentname());
//			shipment.setGrosstWT("");
//			shipment.setIMEI("");
//			shipment.setLastLocation("");
//			shipment.setMaterialName(result.getMaterialname());
//			shipment.setNetWt("");
//			shipment.setOwnerAddress(result.getOwneradress1()+result.getOwneradress2()+result.getOwneradress3());
//			shipment.setOwnerCity(result.getOwnercity());
//			shipment.setOwnerID("");
//			shipment.setOwnerName(result.getOwnername());
//			shipment.setOwnerNo1(result.getOwnerno1());
//			shipment.setOwnerNo2(result.getOwnerno2());
//			shipment.setPartySalesInvice("");
//			shipment.setShipmentEDD(result.getShipmentedd());
//			shipment.setShipmentEndDate("");
//			shipment.setShipmentNo(result.getShipmentno());
//			shipment.setShipmentType(result.getShipmenttype());
//			shipment.setTrackingDate("");
//			shipment.setTrainTripNo(result.getTraintripno());
//			shipment.setUOM(result.getUom());
//			shipment.setVehicleNo(result.getVehicleno());
//			jsonArray.put(new JSONObject(shipment));
//		}
//		
//	
//		return finalArray;
//		
//	}
//	
//	
//}
