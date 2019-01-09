package mc_style.functions.soap.sap.document.sap_com;

public class Zweb_getShipmentNoV2Proxy implements mc_style.functions.soap.sap.document.sap_com.Zweb_getShipmentNoV2_PortType {
  private String _endpoint = null;
  private mc_style.functions.soap.sap.document.sap_com.Zweb_getShipmentNoV2_PortType zweb_getShipmentNoV2_PortType = null;
  
  public Zweb_getShipmentNoV2Proxy() {
    _initZweb_getShipmentNoV2Proxy();
  }
  
  public Zweb_getShipmentNoV2Proxy(String endpoint) {
    _endpoint = endpoint;
    _initZweb_getShipmentNoV2Proxy();
  }
  
  private void _initZweb_getShipmentNoV2Proxy() {
    try {
      zweb_getShipmentNoV2_PortType = (new mc_style.functions.soap.sap.document.sap_com.Zweb_getShipmentNoV2_ServiceLocator()).getzweb_getShipmentNoV2();
      if (zweb_getShipmentNoV2_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)zweb_getShipmentNoV2_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)zweb_getShipmentNoV2_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (zweb_getShipmentNoV2_PortType != null)
      ((javax.xml.rpc.Stub)zweb_getShipmentNoV2_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public mc_style.functions.soap.sap.document.sap_com.Zweb_getShipmentNoV2_PortType getZweb_getShipmentNoV2_PortType() {
    if (zweb_getShipmentNoV2_PortType == null)
      _initZweb_getShipmentNoV2Proxy();
    return zweb_getShipmentNoV2_PortType;
  }
  
  public void zfmShipmentno(java.lang.String changeon, java.lang.String changetime, java.lang.String date, mc_style.functions.soap.sap.document.sap_com.holders.TableOfZshipmentNoTableHolder itChangetable, mc_style.functions.soap.sap.document.sap_com.holders.TableOfZshipmentNoTableHolder itTable, int limit, int ok, java.lang.String shipmentno, java.lang.String startdate) throws java.rmi.RemoteException{
    if (zweb_getShipmentNoV2_PortType == null)
      _initZweb_getShipmentNoV2Proxy();
    zweb_getShipmentNoV2_PortType.zfmShipmentno(changeon, changetime, date, itChangetable, itTable, limit, ok, shipmentno, startdate);
  }
  
  
}