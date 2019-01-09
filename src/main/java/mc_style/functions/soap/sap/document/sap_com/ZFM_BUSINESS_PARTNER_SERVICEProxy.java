package mc_style.functions.soap.sap.document.sap_com;

public class ZFM_BUSINESS_PARTNER_SERVICEProxy implements mc_style.functions.soap.sap.document.sap_com.ZFM_BUSINESS_PARTNER_SERVICE {
  private String _endpoint = null;
  private mc_style.functions.soap.sap.document.sap_com.ZFM_BUSINESS_PARTNER_SERVICE zFM_BUSINESS_PARTNER_SERVICE = null;
  
  public ZFM_BUSINESS_PARTNER_SERVICEProxy() {
    _initZFM_BUSINESS_PARTNER_SERVICEProxy();
  }
  
  public ZFM_BUSINESS_PARTNER_SERVICEProxy(String endpoint) {
    _endpoint = endpoint;
    _initZFM_BUSINESS_PARTNER_SERVICEProxy();
  }
  
  private void _initZFM_BUSINESS_PARTNER_SERVICEProxy() {
    try {
      zFM_BUSINESS_PARTNER_SERVICE = (new mc_style.functions.soap.sap.document.sap_com.ZWEB_BP_SERVICELocator()).getzweb_business_partner_service();
      if (zFM_BUSINESS_PARTNER_SERVICE != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)zFM_BUSINESS_PARTNER_SERVICE)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)zFM_BUSINESS_PARTNER_SERVICE)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (zFM_BUSINESS_PARTNER_SERVICE != null)
      ((javax.xml.rpc.Stub)zFM_BUSINESS_PARTNER_SERVICE)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public mc_style.functions.soap.sap.document.sap_com.ZFM_BUSINESS_PARTNER_SERVICE getZFM_BUSINESS_PARTNER_SERVICE() {
    if (zFM_BUSINESS_PARTNER_SERVICE == null)
      _initZFM_BUSINESS_PARTNER_SERVICEProxy();
    return zFM_BUSINESS_PARTNER_SERVICE;
  }
  
  public void zfmBusinessPartnerService(mc_style.functions.soap.sap.document.sap_com.holders.TableOfZcustomerResultHolder itCustomer, mc_style.functions.soap.sap.document.sap_com.holders.TableOfZvendorResultHolder itVendor) throws java.rmi.RemoteException{
    if (zFM_BUSINESS_PARTNER_SERVICE == null)
      _initZFM_BUSINESS_PARTNER_SERVICEProxy();
    zFM_BUSINESS_PARTNER_SERVICE.zfmBusinessPartnerService(itCustomer, itVendor);
  }
  
  
}