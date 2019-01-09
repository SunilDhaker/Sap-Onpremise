/**
 * Zwebfm_shmtLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mc_style.functions.soap.sap.document.sap_com;

public class Zwebfm_shmtLocator extends org.apache.axis.client.Service implements mc_style.functions.soap.sap.document.sap_com.Zwebfm_shmt {

    public Zwebfm_shmtLocator() {
    }


    public Zwebfm_shmtLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Zwebfm_shmtLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for zweb_fm_shmt
    private java.lang.String zweb_fm_shmt_address = "http://saptest.darcl.corp:8011/sap/bc/srt/rfc/sap/zweb_shmt/800/zwebfm_shmt/zweb_fm_shmt";

    public java.lang.String getzweb_fm_shmtAddress() {
        return zweb_fm_shmt_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String zweb_fm_shmtWSDDServiceName = "zweb_fm_shmt";

    public java.lang.String getzweb_fm_shmtWSDDServiceName() {
        return zweb_fm_shmtWSDDServiceName;
    }

    public void setzweb_fm_shmtWSDDServiceName(java.lang.String name) {
        zweb_fm_shmtWSDDServiceName = name;
    }

    public mc_style.functions.soap.sap.document.sap_com.Zweb_shmt getzweb_fm_shmt() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(zweb_fm_shmt_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getzweb_fm_shmt(endpoint);
    }

    public mc_style.functions.soap.sap.document.sap_com.Zweb_shmt getzweb_fm_shmt(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mc_style.functions.soap.sap.document.sap_com.Zweb_fm_shmtStub _stub = new mc_style.functions.soap.sap.document.sap_com.Zweb_fm_shmtStub(portAddress, this);
            _stub.setPortName(getzweb_fm_shmtWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setzweb_fm_shmtEndpointAddress(java.lang.String address) {
        zweb_fm_shmt_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mc_style.functions.soap.sap.document.sap_com.Zweb_shmt.class.isAssignableFrom(serviceEndpointInterface)) {
                mc_style.functions.soap.sap.document.sap_com.Zweb_fm_shmtStub _stub = new mc_style.functions.soap.sap.document.sap_com.Zweb_fm_shmtStub(new java.net.URL(zweb_fm_shmt_address), this);
                _stub.setPortName(getzweb_fm_shmtWSDDServiceName());
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
        if ("zweb_fm_shmt".equals(inputPortName)) {
            return getzweb_fm_shmt();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "zwebfm_shmt");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "zweb_fm_shmt"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("zweb_fm_shmt".equals(portName)) {
            setzweb_fm_shmtEndpointAddress(address);
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
