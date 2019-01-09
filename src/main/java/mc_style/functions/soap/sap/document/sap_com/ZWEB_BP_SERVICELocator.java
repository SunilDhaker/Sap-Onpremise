/**
 * ZWEB_BP_SERVICELocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mc_style.functions.soap.sap.document.sap_com;

public class ZWEB_BP_SERVICELocator extends org.apache.axis.client.Service implements mc_style.functions.soap.sap.document.sap_com.ZWEB_BP_SERVICE {

    public ZWEB_BP_SERVICELocator() {
    }


    public ZWEB_BP_SERVICELocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ZWEB_BP_SERVICELocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for zweb_business_partner_service
    private java.lang.String zweb_business_partner_service_address = "http://saptest.darcl.corp:8011/sap/bc/srt/rfc/sap/zfm_business_partner_service/800/zweb_bp_service/zweb_business_partner_service";

    public java.lang.String getzweb_business_partner_serviceAddress() {
        return zweb_business_partner_service_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String zweb_business_partner_serviceWSDDServiceName = "zweb_business_partner_service";

    public java.lang.String getzweb_business_partner_serviceWSDDServiceName() {
        return zweb_business_partner_serviceWSDDServiceName;
    }

    public void setzweb_business_partner_serviceWSDDServiceName(java.lang.String name) {
        zweb_business_partner_serviceWSDDServiceName = name;
    }

    public mc_style.functions.soap.sap.document.sap_com.ZFM_BUSINESS_PARTNER_SERVICE getzweb_business_partner_service() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(zweb_business_partner_service_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getzweb_business_partner_service(endpoint);
    }

    public mc_style.functions.soap.sap.document.sap_com.ZFM_BUSINESS_PARTNER_SERVICE getzweb_business_partner_service(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mc_style.functions.soap.sap.document.sap_com.Zweb_business_partner_serviceStub _stub = new mc_style.functions.soap.sap.document.sap_com.Zweb_business_partner_serviceStub(portAddress, this);
            _stub.setPortName(getzweb_business_partner_serviceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setzweb_business_partner_serviceEndpointAddress(java.lang.String address) {
        zweb_business_partner_service_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mc_style.functions.soap.sap.document.sap_com.ZFM_BUSINESS_PARTNER_SERVICE.class.isAssignableFrom(serviceEndpointInterface)) {
                mc_style.functions.soap.sap.document.sap_com.Zweb_business_partner_serviceStub _stub = new mc_style.functions.soap.sap.document.sap_com.Zweb_business_partner_serviceStub(new java.net.URL(zweb_business_partner_service_address), this);
                _stub.setPortName(getzweb_business_partner_serviceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("zweb_business_partner_service".equals(inputPortName)) {
            return getzweb_business_partner_service();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZWEB_BP_SERVICE");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "zweb_business_partner_service"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("zweb_business_partner_service".equals(portName)) {
            setzweb_business_partner_serviceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
