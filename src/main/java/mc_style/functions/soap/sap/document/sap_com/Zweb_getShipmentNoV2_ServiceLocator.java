/**
 * Zweb_getShipmentNoV2_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mc_style.functions.soap.sap.document.sap_com;

public class Zweb_getShipmentNoV2_ServiceLocator extends org.apache.axis.client.Service implements mc_style.functions.soap.sap.document.sap_com.Zweb_getShipmentNoV2_Service {

    public Zweb_getShipmentNoV2_ServiceLocator() {
    }


    public Zweb_getShipmentNoV2_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Zweb_getShipmentNoV2_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for zweb_getShipmentNoV2
    private java.lang.String zweb_getShipmentNoV2_address = "http://saptest.darcl.corp:8011/sap/bc/srt/rfc/sap/zweb_getshipmentnov2/800/zweb_getshipmentnov2/zweb_getshipmentnov2";

    public java.lang.String getzweb_getShipmentNoV2Address() {
        return zweb_getShipmentNoV2_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String zweb_getShipmentNoV2WSDDServiceName = "zweb_getShipmentNoV2";

    public java.lang.String getzweb_getShipmentNoV2WSDDServiceName() {
        return zweb_getShipmentNoV2WSDDServiceName;
    }

    public void setzweb_getShipmentNoV2WSDDServiceName(java.lang.String name) {
        zweb_getShipmentNoV2WSDDServiceName = name;
    }

    public mc_style.functions.soap.sap.document.sap_com.Zweb_getShipmentNoV2_PortType getzweb_getShipmentNoV2() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(zweb_getShipmentNoV2_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getzweb_getShipmentNoV2(endpoint);
    }

    public mc_style.functions.soap.sap.document.sap_com.Zweb_getShipmentNoV2_PortType getzweb_getShipmentNoV2(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mc_style.functions.soap.sap.document.sap_com.Zweb_getShipmentNoV2_BindingStub _stub = new mc_style.functions.soap.sap.document.sap_com.Zweb_getShipmentNoV2_BindingStub(portAddress, this);
            _stub.setPortName(getzweb_getShipmentNoV2WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setzweb_getShipmentNoV2EndpointAddress(java.lang.String address) {
        zweb_getShipmentNoV2_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mc_style.functions.soap.sap.document.sap_com.Zweb_getShipmentNoV2_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mc_style.functions.soap.sap.document.sap_com.Zweb_getShipmentNoV2_BindingStub _stub = new mc_style.functions.soap.sap.document.sap_com.Zweb_getShipmentNoV2_BindingStub(new java.net.URL(zweb_getShipmentNoV2_address), this);
                _stub.setPortName(getzweb_getShipmentNoV2WSDDServiceName());
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
        if ("zweb_getShipmentNoV2".equals(inputPortName)) {
            return getzweb_getShipmentNoV2();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "zweb_getShipmentNoV2");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "zweb_getShipmentNoV2"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("zweb_getShipmentNoV2".equals(portName)) {
            setzweb_getShipmentNoV2EndpointAddress(address);
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
