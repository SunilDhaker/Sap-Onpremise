package mc_style.functions.soap.sap.document.sap_com;

public class Zweb_shmtProxy implements mc_style.functions.soap.sap.document.sap_com.Zweb_shmt {
  private String _endpoint = null;
  private mc_style.functions.soap.sap.document.sap_com.Zweb_shmt zweb_shmt = null;
  
  public Zweb_shmtProxy() {
    _initZweb_shmtProxy();
  }
  
  public Zweb_shmtProxy(String endpoint) {
    _endpoint = endpoint;
    _initZweb_shmtProxy();
  }
  
  private void _initZweb_shmtProxy() {
    try {
      zweb_shmt = (new mc_style.functions.soap.sap.document.sap_com.Zwebfm_shmtLocator()).getzweb_fm_shmt();
      if (zweb_shmt != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)zweb_shmt)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)zweb_shmt)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (zweb_shmt != null)
      ((javax.xml.rpc.Stub)zweb_shmt)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public mc_style.functions.soap.sap.document.sap_com.Zweb_shmt getZweb_shmt() {
    if (zweb_shmt == null)
      _initZweb_shmtProxy();
    return zweb_shmt;
  }
  
  public void zfmShipmentService(mc_style.functions.soap.sap.document.sap_com.holders.TableOfZshipmentHolder itShipment, java.lang.String shipmentNo) throws java.rmi.RemoteException{
    if (zweb_shmt == null)
      _initZweb_shmtProxy();
    zweb_shmt.zfmShipmentService(itShipment, shipmentNo);
  }
  
  
}