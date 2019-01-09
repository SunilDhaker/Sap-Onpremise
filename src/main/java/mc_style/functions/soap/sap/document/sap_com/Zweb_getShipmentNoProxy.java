package mc_style.functions.soap.sap.document.sap_com;

public class Zweb_getShipmentNoProxy implements mc_style.functions.soap.sap.document.sap_com.Zweb_getShipmentNo {
  private String _endpoint = null;
  private mc_style.functions.soap.sap.document.sap_com.Zweb_getShipmentNo zweb_getShipmentNo = null;
  
  public Zweb_getShipmentNoProxy() {
    _initZweb_getShipmentNoProxy();
  }
  
  public Zweb_getShipmentNoProxy(String endpoint) {
    _endpoint = endpoint;
    _initZweb_getShipmentNoProxy();
  }
  
  private void _initZweb_getShipmentNoProxy() {
    try {
      zweb_getShipmentNo = (new mc_style.functions.soap.sap.document.sap_com.Zweb_getShipmentServiceLocator()).getzweb_getShipmentService();
      if (zweb_getShipmentNo != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)zweb_getShipmentNo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)zweb_getShipmentNo)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (zweb_getShipmentNo != null)
      ((javax.xml.rpc.Stub)zweb_getShipmentNo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public mc_style.functions.soap.sap.document.sap_com.Zweb_getShipmentNo getZweb_getShipmentNo() {
    if (zweb_getShipmentNo == null)
      _initZweb_getShipmentNoProxy();
    return zweb_getShipmentNo;
  }
  
  public void zfmShipmentno(java.lang.String date, mc_style.functions.soap.sap.document.sap_com.holders.TableOfZshipmentNoTableHolder itTable, int limit) throws java.rmi.RemoteException{
    if (zweb_getShipmentNo == null)
      _initZweb_getShipmentNoProxy();
    zweb_getShipmentNo.zfmShipmentno(date, itTable, limit);
  }
  
  
}