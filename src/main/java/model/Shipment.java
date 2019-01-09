package model;

import model.*;
import model.LatitudeLongitude;

import java.util.ArrayList;

public class Shipment {
	
	private String NetWt ;
	private String EwayRegDate;
	private String EwayBillNo;
	private String EWayExpiryDate;
	private String ChallanNo ;
	private String OwnerName ;
	private String BillingCustomerCity ;
	private String GrosstWT ;
	private String VehicleNo ;
	private String FWDAgentName ;
	private String ChDept ;
	private String ChallanDate ;
	private String LastLocation ;
	private String OwnerNo2 ;
	private String OwnerNo1 ;
	private String DriverName ;
	private String TPTMode ;
	private String TrainTripNo ;
	private String ContainerNo ;
	private String SalesOrderNo ;
	private String CnDest ;
	private String ShipmentType ;
	private String CNNo ;
	private String ConsigneeName ;
	private String PartySalesInvice;
	private String TrackingDate ;
	private String MaterialName ;
	private String CnBranchID ;
	private String ChallanBranch ;
	private String DriverMobNo3 ;
	private String OwnerAddress ;
	private String DriverMobNo1 ;
	private String FleetType ;
	private String DriverMobNo2 ;
	private String OwnerCity ;
	private String ChDest ;
	private String IMEI ;
	private String DeiveryNo ;
	private String ConsignorName ;
	private String ChallanBranchID ;
	private String ShipmentNo ;
	private String ShipmentEndDate ;
	private String ConsignorCity ;
	private String UOM ;
	private String CnDept ;
	private String OwnerID ;
	private String CNDate ;
	private String BillingCustomer ;
	private String CnBranch ;
	private String ConsigneeCity ;

	
	public Shipment(String netWt, String ewayRegDate, String ewayBillNo, String eWayExpiryDate, String challanNo,
			String ownerName, String billingCustomerCity, String grosstWT, String vehicleNo, String fWDAgentName,
			String chDept, String challanDate, String lastLocation, String ownerNo2, String ownerNo1, String driverName,
			String tPTMode, String trainTripNo, String containerNo, String salesOrderNo, String cnDest,
			String shipmentType, String cNNo, String consigneeName, String partySalesInvice, String trackingDate,
			String materialName, String cnBranchID, String challanBranch, String driverMobNo3, String ownerAddress,
			String driverMobNo1, String fleetType, String driverMobNo2, String ownerCity, String chDest, String iMEI,
			String deiveryNo, String consignorName, String challanBranchID, String shipmentNo, String shipmentEndDate,
			String consignorCity, String uOM, String cnDept, String ownerID, String cNDate, String billingCustomer,
			String cnBranch, String consigneeCity, String shipmentEDD) {
		NetWt = netWt;
		EwayRegDate = ewayRegDate;
		EwayBillNo = ewayBillNo;
		EWayExpiryDate = eWayExpiryDate;
		ChallanNo = challanNo;
		OwnerName = ownerName;
		BillingCustomerCity = billingCustomerCity;
		GrosstWT = grosstWT;
		VehicleNo = vehicleNo;
		FWDAgentName = fWDAgentName;
		ChDept = chDept;
		ChallanDate = challanDate;
		LastLocation = lastLocation;
		OwnerNo2 = ownerNo2;
		OwnerNo1 = ownerNo1;
		DriverName = driverName;
		TPTMode = tPTMode;
		TrainTripNo = trainTripNo;
		ContainerNo = containerNo;
		SalesOrderNo = salesOrderNo;
		CnDest = cnDest;
		ShipmentType = shipmentType;
		CNNo = cNNo;
		ConsigneeName = consigneeName;
		PartySalesInvice = partySalesInvice;
		TrackingDate = trackingDate;
		MaterialName = materialName;
		CnBranchID = cnBranchID;
		ChallanBranch = challanBranch;
		DriverMobNo3 = driverMobNo3;
		OwnerAddress = ownerAddress;
		DriverMobNo1 = driverMobNo1;
		FleetType = fleetType;
		DriverMobNo2 = driverMobNo2;
		OwnerCity = ownerCity;
		ChDest = chDest;
		IMEI = iMEI;
		DeiveryNo = deiveryNo;
		ConsignorName = consignorName;
		ChallanBranchID = challanBranchID;
		ShipmentNo = shipmentNo;
		ShipmentEndDate = shipmentEndDate;
		ConsignorCity = consignorCity;
		UOM = uOM;
		CnDept = cnDept;
		OwnerID = ownerID;
		CNDate = cNDate;
		BillingCustomer = billingCustomer;
		CnBranch = cnBranch;
		ConsigneeCity = consigneeCity;
		ShipmentEDD = shipmentEDD;
	}
	
	public Shipment()
	{
		
	}
	public String getPartySalesInvice() {
		return PartySalesInvice;
	}
	public void setPartySalesInvice(String partySalesInvice) {
		PartySalesInvice = partySalesInvice;
	}
		public String getNetWt() {
		return NetWt;
	}
	public void setNetWt(String netWt) {
		NetWt = netWt;
	}
	public String getChallanNo() {
		return ChallanNo;
	}
	public void setChallanNo(String challanNo) {
		ChallanNo = challanNo;
	}
	public String getOwnerName() {
		return OwnerName;
	}
	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}
	public String getBillingCustomerCity() {
		return BillingCustomerCity;
	}
	public void setBillingCustomerCity(String billingCustomerCity) {
		BillingCustomerCity = billingCustomerCity;
	}
	public String getGrosstWT() {
		return GrosstWT;
	}
	public void setGrosstWT(String grosstWT) {
		GrosstWT = grosstWT;
	}
	public String getVehicleNo() {
		return VehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		VehicleNo = vehicleNo;
	}
	public String getFWDAgentName() {
		return FWDAgentName;
	}
	public void setFWDAgentName(String fWDAgentName) {
		FWDAgentName = fWDAgentName;
	}
	public String getChDept() {
		return ChDept;
	}
	public void setChDept(String chDept) {
		ChDept = chDept;
	}
	public String getChallanDate() {
		return ChallanDate;
	}
	public void setChallanDate(String challanDate) {
		ChallanDate = challanDate;
	}
	public String getLastLocation() {
		return LastLocation;
	}
	public void setLastLocation(String lastLocation) {
		LastLocation = lastLocation;
	}
	public String getOwnerNo2() {
		return OwnerNo2;
	}
	public void setOwnerNo2(String ownerNo2) {
		OwnerNo2 = ownerNo2;
	}
	public String getOwnerNo1() {
		return OwnerNo1;
	}
	public void setOwnerNo1(String ownerNo1) {
		OwnerNo1 = ownerNo1;
	}
	public String getDriverName() {
		return DriverName;
	}
	public void setDriverName(String driverName) {
		DriverName = driverName;
	}
	public String getTPTMode() {
		return TPTMode;
	}
	public void setTPTMode(String tPTMode) {
		TPTMode = tPTMode;
	}
	public String getTrainTripNo() {
		return TrainTripNo;
	}
	public void setTrainTripNo(String trainTripNo) {
		TrainTripNo = trainTripNo;
	}
	public String getContainerNo() {
		return ContainerNo;
	}
	public void setContainerNo(String containerNo) {
		ContainerNo = containerNo;
	}
	public String getSalesOrderNo() {
		return SalesOrderNo;
	}
	public void setSalesOrderNo(String salesOrderNo) {
		SalesOrderNo = salesOrderNo;
	}
	public String getCnDest() {
		return CnDest;
	}
	public void setCnDest(String cnDest) {
		CnDest = cnDest;
	}
	public String getShipmentType() {
		return ShipmentType;
	}
	public void setShipmentType(String shipmentType) {
		ShipmentType = shipmentType;
	}
	public String getCNNo() {
		return CNNo;
	}
	public void setCNNo(String cNNo) {
		CNNo = cNNo;
	}
	public String getConsigneeName() {
		return ConsigneeName;
	}
	public void setConsigneeName(String consigneeName) {
		ConsigneeName = consigneeName;
	}
	
	public String getTrackingDate() {
		return TrackingDate;
	}
	public void setTrackingDate(String trackingDate) {
		TrackingDate = trackingDate;
	}
	public String getMaterialName() {
		return MaterialName;
	}
	public void setMaterialName(String materialName) {
		MaterialName = materialName;
	}
	public String getCnBranchID() {
		return CnBranchID;
	}
	public void setCnBranchID(String cnBranchID) {
		CnBranchID = cnBranchID;
	}
	public String getChallanBranch() {
		return ChallanBranch;
	}
	public void setChallanBranch(String challanBranch) {
		ChallanBranch = challanBranch;
	}
	public String getDriverMobNo3() {
		return DriverMobNo3;
	}
	public void setDriverMobNo3(String driverMobNo3) {
		DriverMobNo3 = driverMobNo3;
	}
	public String getOwnerAddress() {
		return OwnerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		OwnerAddress = ownerAddress;
	}
	public String getDriverMobNo1() {
		return DriverMobNo1;
	}
	public void setDriverMobNo1(String driverMobNo1) {
		DriverMobNo1 = driverMobNo1;
	}
	public String getFleetType() {
		return FleetType;
	}
	public void setFleetType(String fleetType) {
		FleetType = fleetType;
	}
	public String getDriverMobNo2() {
		return DriverMobNo2;
	}
	public void setDriverMobNo2(String driverMobNo2) {
		DriverMobNo2 = driverMobNo2;
	}
	public String getOwnerCity() {
		return OwnerCity;
	}
	public void setOwnerCity(String ownerCity) {
		OwnerCity = ownerCity;
	}
	public String getChDest() {
		return ChDest;
	}
	public void setChDest(String chDest) {
		ChDest = chDest;
	}
	public String getIMEI() {
		return IMEI;
	}
	public void setIMEI(String iMEI) {
		IMEI = iMEI;
	}
	public String getDeiveryNo() {
		return DeiveryNo;
	}
	public void setDeiveryNo(String deiveryNo) {
		DeiveryNo = deiveryNo;
	}
	public String getConsignorName() {
		return ConsignorName;
	}
	public void setConsignorName(String consignorName) {
		ConsignorName = consignorName;
	}
	public String getChallanBranchID() {
		return ChallanBranchID;
	}
	public void setChallanBranchID(String challanBranchID) {
		ChallanBranchID = challanBranchID;
	}
	public String getShipmentNo() {
		return ShipmentNo;
	}
	public void setShipmentNo(String shipmentNo) {
		ShipmentNo = shipmentNo;
	}
	public String getShipmentEndDate() {
		return ShipmentEndDate;
	}
	public void setShipmentEndDate(String shipmentEndDate) {
		ShipmentEndDate = shipmentEndDate;
	}
	public String getConsignorCity() {
		return ConsignorCity;
	}
	public void setConsignorCity(String consignorCity) {
		ConsignorCity = consignorCity;
	}
	public String getUOM() {
		return UOM;
	}
	public void setUOM(String uOM) {
		UOM = uOM;
	}
	public String getCnDept() {
		return CnDept;
	}
	public void setCnDept(String cnDept) {
		CnDept = cnDept;
	}
	public String getOwnerID() {
		return OwnerID;
	}
	public void setOwnerID(String ownerID) {
		OwnerID = ownerID;
	}
	public String getCNDate() {
		return CNDate;
	}
	public void setCNDate(String cNDate) {
		CNDate = cNDate;
	}
	public String getBillingCustomer() {
		return BillingCustomer;
	}
	public void setBillingCustomer(String billingCustomer) {
		BillingCustomer = billingCustomer;
	}
	public String getCnBranch() {
		return CnBranch;
	}
	public void setCnBranch(String cnBranch) {
		CnBranch = cnBranch;
	}
	public String getConsigneeCity() {
		return ConsigneeCity;
	}
	public void setConsigneeCity(String consigneeCity) {
		ConsigneeCity = consigneeCity;
	}
	public String getShipmentEDD() {
		return ShipmentEDD;
	}
	public void setShipmentEDD(String shipmentEDD) {
		ShipmentEDD = shipmentEDD;
	}
	public String getEwayRegDate() {
		return EwayRegDate;
	}
	public void setEwayRegDate(String ewayRegDate) {
		EwayRegDate = ewayRegDate;
	}
	public String getEWayExpiryDate() {
		return EWayExpiryDate;
	}
	public void setEWayExpiryDate(String eWayExpiryDate) {
		EWayExpiryDate = eWayExpiryDate;
	}
	public String getEwayBillNo() {
		return EwayBillNo;
	}
	public void setEwayBillNo(String ewayBillNo) {
		EwayBillNo = ewayBillNo;
	}
	private String ShipmentEDD ;
	
}
