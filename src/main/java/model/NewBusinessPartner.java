package model;

import model.*;


import java.util.ArrayList;
import java.util.List;

public class NewBusinessPartner {
  private String orgId;
  private String places;
  private String name;
  private String location;
  private String type;
  private String uuid;
  private String fretronId;
  private List<Contacts> contacts;
  private String geoFence;
  
public String getOrgId() {
	return orgId;
}
public void setOrgId(String orgId) {
	this.orgId = orgId;
}
public String getPlaces() {
	return places;
}
public void setPlaces(String places) {
	this.places = places;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getUuid() {
	return uuid;
}
public void setUuid(String uuid) {
	this.uuid = uuid;
}
public String getFretronId() {
	return fretronId;
}
public void setFretronId(String fretronId) {
	this.fretronId = fretronId;
}
public List<Contacts> getContacts() {
	return contacts;
}
public void setContacts(List<Contacts> contacts) {
	this.contacts = contacts;
}
public String getGeoFence() {
	return geoFence;
}
public void setGeoFence(String geoFence) {
	this.geoFence = geoFence;
}
 

}
