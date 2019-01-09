/**
 * Zweb_getShipmentNoV2_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mc_style.functions.soap.sap.document.sap_com;

public interface Zweb_getShipmentNoV2_PortType extends java.rmi.Remote {
    public void zfmShipmentno(java.lang.String changeon, java.lang.String changetime, java.lang.String date, mc_style.functions.soap.sap.document.sap_com.holders.TableOfZshipmentNoTableHolder itChangetable, mc_style.functions.soap.sap.document.sap_com.holders.TableOfZshipmentNoTableHolder itTable, int limit, int ok, java.lang.String shipmentno, java.lang.String startdate) throws java.rmi.RemoteException;
}
