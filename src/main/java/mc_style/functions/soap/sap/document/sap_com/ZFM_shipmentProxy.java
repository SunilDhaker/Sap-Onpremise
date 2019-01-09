package mc_style.functions.soap.sap.document.sap_com;

public class ZFM_shipmentProxy implements mc_style.functions.soap.sap.document.sap_com.ZFM_shipment {
  private String _endpoint = null;
  private mc_style.functions.soap.sap.document.sap_com.ZFM_shipment zFM_shipment = null;
  
  public ZFM_shipmentProxy() {
    _initZFM_shipmentProxy();
  }
  
  public ZFM_shipmentProxy(String endpoint) {
    _endpoint = endpoint;
    _initZFM_shipmentProxy();
  }
  
  private void _initZFM_shipmentProxy() {
    try {
      zFM_shipment = (new mc_style.functions.soap.sap.document.sap_com.Zfm_shipment_serviceLocator()).getZfm_shipment_service_abap();
      if (zFM_shipment != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)zFM_shipment)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)zFM_shipment)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (zFM_shipment != null)
      ((javax.xml.rpc.Stub)zFM_shipment)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public mc_style.functions.soap.sap.document.sap_com.ZFM_shipment getZFM_shipment() {
    if (zFM_shipment == null)
      _initZFM_shipmentProxy();
    return zFM_shipment;
  }
  
  public void zfmShipmentnoService(mc_style.functions.soap.sap.document.sap_com.holders.TableOfZshipmentNoTableHolder itTable, int limit) throws java.rmi.RemoteException{
    if (zFM_shipment == null)
      _initZFM_shipmentProxy();
    zFM_shipment.zfmShipmentnoService(itTable, limit);
  }
  
  
}