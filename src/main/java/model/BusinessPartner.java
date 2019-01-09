package model;

import model.*;
import model.LatitudeLongitude;

import java.util.ArrayList;

public class BusinessPartner {
  private int id;
  private String uuid,bpuuid,orgId,type,fretronReferenceNo,partnerName,freightLocation,address,state,zip,contactPersonName,emailId,mobileNo,fretronReferenceNoUuid;
	private ArrayList<model.LatitudeLongitude> boundary;

public String getBpuuid() {
	return bpuuid;
}

	public ArrayList<LatitudeLongitude> getBoundary() {
		return boundary;
	}

	public void setBoundary(ArrayList<LatitudeLongitude> boundary) {
		this.boundary = boundary;
	}

	public void setBpuuid(String bpuuid) {

	this.bpuuid = bpuuid;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUuid() {
	return uuid;
}
public void setUuid(String uuid) {
	this.uuid = uuid;
}
public String getOrgId() {
	return orgId;
}

	public String getFretronReferenceNoUuid() {
		return fretronReferenceNoUuid;
	}

	public void setFretronReferenceNoUuid(String fretronReferenceNoUuid) {
		this.fretronReferenceNoUuid = fretronReferenceNoUuid;
	}

	public void setOrgId(String orgId) {
	this.orgId = orgId;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getFretronReferenceNo() {
	return fretronReferenceNo;
}
public void setFretronReferenceNo(String fretronReferenceNo) {
	this.fretronReferenceNo = fretronReferenceNo;
}
public String getPartnerName() {
	return partnerName;
}
public void setPartnerName(String partnerName) {
	this.partnerName = partnerName;
}
public String getFreightLocation() {
	return freightLocation;
}
public void setFreightLocation(String freightLocation) {
	this.freightLocation = freightLocation;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getZip() {
	return zip;
}
public void setZip(String zip) {
	this.zip = zip;
}

public String getContactPersonName() {
	return contactPersonName;
}
public void setContactPersonName(String contactPersonName) {
	this.contactPersonName = contactPersonName;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}

}
